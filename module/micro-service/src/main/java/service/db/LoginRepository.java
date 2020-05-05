package service.db;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import service.ecommerce.entities.Login;

public interface LoginRepository extends CrudRepository<Login, Long>{

	/***
	 * Mencari satu product dengan suatu product ID tertentu
	 * @param id
	 * @return
	 */
	  Login findByIdUser(Long idUser);
	  
	  
}
