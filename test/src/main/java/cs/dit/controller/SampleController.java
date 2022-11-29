package cs.dit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/sample/*")
@Log4j
public class SampleController {
	
	// GetMapping -> 요청할 view page
	// return type을 String으로 할 경우
	@GetMapping("/basic")
	public String basic() {
		log.info("basic................................");
		
		return "sample/basic";
	}
	
	@GetMapping
	public String basic2(String name) {
		log.info("basic................................");
		log.info("name = " + name);
		
		return "sample/basic2";
	}
}
