package com.koweg.ob.handler;

import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.koweg.ob.repository.BranchesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import software.amazon.awssdk.http.HttpStatusCode;

import java.util.function.Function;

@Component
public class GetBranchesFunction implements Function<APIGatewayProxyRequestEvent, APIGatewayProxyResponseEvent> {

  private final BranchesRepository branchesRepository;
  private final ObjectMapper objectMapper;

  //@Autowired
  public GetBranchesFunction(BranchesRepository branchesRepository, ObjectMapper objectMapper) {
    this.branchesRepository = branchesRepository;
    this.objectMapper = objectMapper;
  }

  @Override
  public APIGatewayProxyResponseEvent apply(APIGatewayProxyRequestEvent requestEvent) {

    validateHttpMethodCall(requestEvent);

    try {
      return new APIGatewayProxyResponseEvent()
              .withStatusCode(HttpStatusCode.OK)
              .withBody(objectMapper.writeValueAsString(branchesRepository.getParticipants()));
    } catch (JsonProcessingException e) {
      return errorResponse();
    }
  }

  private APIGatewayProxyResponseEvent errorResponse() {
    return new APIGatewayProxyResponseEvent()
            .withStatusCode(HttpStatusCode.INTERNAL_SERVER_ERROR)
            .withBody("FAILURE: Internal server error");
  }

  private APIGatewayProxyResponseEvent validateHttpMethodCall(APIGatewayProxyRequestEvent requestEvent) {
    if (!requestEvent.getHttpMethod().equals(HttpMethod.GET.name())) {
      return new APIGatewayProxyResponseEvent()
              .withStatusCode(HttpStatusCode.METHOD_NOT_ALLOWED)
              .withBody("Only GET method is supported");
    }
    return null;
  }
}
