package service.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import service.db.LoginRepository;
import service.ecommerce.entities.Login;


@RestController
@RequestMapping("/api/login")
public class LoginController {
	
	@Autowired
	LoginRepository loginRepository;
	

}
