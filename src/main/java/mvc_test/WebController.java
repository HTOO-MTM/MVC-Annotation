package mvc_test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class WebController {

	@GetMapping("home")
	public ModelAndView getHome() {
		return new ModelAndView("home");
	}
	
	@GetMapping("hello")
	public ModelAndView getHello() {
		return new ModelAndView("hello");
	}
	
	@GetMapping("menu")
	public ModelAndView getMenu() {
		return new ModelAndView("menu");
	}
	
}

