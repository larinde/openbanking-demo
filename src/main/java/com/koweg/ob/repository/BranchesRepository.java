package com.koweg.ob.repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.koweg.ob.data.Participants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.io.IOException;

@Repository
public class BranchesRepository {

  private Participants participants;

  @Autowired
  ResourceLoader resourceLoader;

  @PostConstruct
  private void loadBranches() throws IOException {
    participants = new ObjectMapper().readValue(resourceLoader.getResource("classpath:data/participant_store.json").getInputStream(), Participants.class);
  }

  public Participants getParticipants(){
    return participants;
  }
}
