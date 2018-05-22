package heroku_demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class HomeController {

 
	@GetMapping(value = {"/"})
	public String openHomePage() {
		
		return "index";
	}
	
	@GetMapping(value = {"/about"})
	public String aboutPage() {
		
		return "about";
	}
	
	@GetMapping(value = {"/contact"})
	public String contactPage() {
		
		return "contact";
	}
	
	@GetMapping(value = {"/projects"})
	public String projectsPage() {
		
		return "projects";
	}
	
	

}
