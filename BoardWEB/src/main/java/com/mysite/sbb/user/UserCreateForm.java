package com.mysite.sbb.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class UserCreateForm {

   @NotEmpty(message = "아이디는 필수 입력 항목입니다.")
   @Size(min = 3, max = 25)
   private String username;
   
   @Email
   private String email;
   
   @NotEmpty(message = "비밀번호는 필수 입력 항목입니다.")
   private String password1;
   
   @NotEmpty(message = "비밀번호는 필수 입력 항목입니다.")
   private String password2;
}
