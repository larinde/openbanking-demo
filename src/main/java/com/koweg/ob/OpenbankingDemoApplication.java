package com.koweg.ob;

import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.xray.entities.TraceHeader;
import com.amazonaws.xray.entities.TraceID;
import com.amazonaws.xray.interceptors.TracingInterceptor;
import org.joda.time.DateTime;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.koweg.ob.data.Participants;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.nativex.hint.TypeAccess;
import org.springframework.nativex.hint.TypeHint;

import java.util.HashSet;


@SpringBootApplication
@TypeHint(types = {
				DateTime.class,
				APIGatewayProxyRequestEvent.class,
				TracingInterceptor.class,
				HashSet.class,
				TraceHeader.class,
				TraceID.class
},
				typeNames = {
								"com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent$ProxyRequestContext",
								"com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent$RequestIdentity",
								"com.amazonaws.xray.entities.TraceHeader$SampleDecision"
				})
@TypeHint(
				types = { Participants.class}, access = { TypeAccess.PUBLIC_CONSTRUCTORS, TypeAccess.PUBLIC_METHODS }
)
public class OpenbankingDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenbankingDemoApplication.class, args);
	}

/*
	@Bean
	@ConditionalOnMissingBean
	public ObjectMapper defaultObjectMapper() {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		return objectMapper;
	}
*/
}
