package com.mysite.sbb.user;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class SiteUser {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id; //객체 식별용
   
   @Column(unique = true)
   private String username;
   
   @Column(unique = true)
   private String email;
   
   private String password;
}


//unique의 역할 : 중복 불가능
