package loan.approval.com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@CrossOrigin("http://localhost:3000")
public class UserController1 {


	@GetMapping("/")
	String getAllUsers() {
		return "heyyy hiiii";

	}
}
