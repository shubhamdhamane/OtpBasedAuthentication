package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class ApplicationController {

@GetMapping("Register")

public String RegistrationForm()
{
	
System.out.println("output");
return 	"RegistrationPage.jsp";
}

@PostMapping("Auth")

public String AuthForm()
{
	return "AuthenticationPage.jsp";
}

}
