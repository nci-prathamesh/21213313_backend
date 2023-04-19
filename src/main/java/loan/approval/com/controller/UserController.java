package loan.approval.com.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


	@GetMapping("/")
	String getAllUsers() {
		return "heyyy hiiii";

	}
}
