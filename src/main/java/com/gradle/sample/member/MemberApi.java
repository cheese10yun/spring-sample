package com.gradle.sample.member;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/members")
public class MemberApi {

  @GetMapping("/{id}")
  public Member getMember(@PathVariable long id) {

    return  Member.builder()
          .realEmail("asd@asd.com")
          .realName("asd")
          .build();

  }

  @PostMapping
    public Member createMember(@RequestBody Member member){
      return member;
  }

}
