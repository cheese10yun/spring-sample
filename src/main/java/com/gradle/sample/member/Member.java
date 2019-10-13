package com.gradle.sample.member;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
//@Table(name = "member", uniqueConstraints = @UniqueConstraint(columnNames = {"name", "email"}))
@Table(name = "member")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member  {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name", nullable = false, unique = true)
    private String realName;

    @Column(name = "email", nullable = false, unique = true)
    private String realEmail;

    @Builder
    public Member(long id, String realName, String realEmail) {
        this.id = id;
        this.realName = realName;
        this.realEmail = realEmail;
    }
}