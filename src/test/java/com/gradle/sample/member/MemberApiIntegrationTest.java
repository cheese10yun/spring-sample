package com.gradle.sample.member;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import com.gradle.sample.test.IntegrationApiTest;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.ResultActions;

public class MemberApiIntegrationTest extends IntegrationApiTest {


  @Test
  public void getMember() throws Exception {

    //given

    //when
    final ResultActions actions = requestGetMember("1");

    //then
    actions
        .andExpect(status().isOk());

  }

  private ResultActions requestGetMember(String id) throws Exception {
    return mvc.perform(get("/members/{id}", id)
        .contentType(MediaType.APPLICATION_JSON_UTF8))
        .andDo(print());
  }
}