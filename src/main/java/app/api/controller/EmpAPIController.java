package app.api.controller;

@RestController
public class EmpAPIController {

	@GetMapping("/api/emp-test")
	public String empTest() {
		return "emp api controller";
	}
}
