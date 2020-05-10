package service.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import service.db.LoginRepository;
import service.ecommerce.entities.Login;
import service.ecommerce.entities.Product;


@RestController
@RequestMapping("/api/login")
public class LoginController {
	
	@Autowired
	LoginRepository loginRepository;
	
	@GetMapping("/{idUser}")
    public Login getLogin(@PathVariable Long userId) {
		// panggil database buat dapetin produk berdasarkan id yang di kasih
		Login u = getLoginFromDB(userId);
        return u;
    }
	
	
	private Login getLoginFromDB(Long userId) {
		// code buat panggil database
		Login u = loginRepository.findByIdUser(userId);
		return u;
	}
}
