package com.sesoc.web2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ResourceController {
	
	@RequestMapping(value = "/res", method = RequestMethod.GET)
	public String resource() {
		return "res";
	}
}
