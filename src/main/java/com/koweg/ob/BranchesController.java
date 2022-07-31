package com.koweg.ob;

import com.koweg.ob.api.BranchesApi;
import com.koweg.ob.repository.BranchesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Map;

@RestController
public class BranchesController implements BranchesApi {

  private final BranchesRepository branchesRepository;

  @Autowired
  public BranchesController(BranchesRepository branchesRepository) {
    this.branchesRepository = branchesRepository;
  }

  @Override
  public ResponseEntity<Map<String, Object>> branchesGet(String ifModifiedSince, String ifNoneMatch) {
    return new ResponseEntity<Map<String, Object>>(Map.of("", branchesRepository.getParticipants()),HttpStatus.OK);
  }
}
