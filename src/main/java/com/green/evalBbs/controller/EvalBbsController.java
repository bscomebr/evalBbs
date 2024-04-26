/**
 * 
 */
package com.green.evalBbs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EvalBbsController {

	@RequestMapping("/")
	public@ResponseBody  String index() {
		
		return "check";
	}
	
	
}
