/**
 * 
 */
package com.green.evalBbs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.green.evalBbs.dao.IEvalBbsDao;

@Controller
public class EvalBbsController {

	@Autowired
	private IEvalBbsDao dao;
	
	@RequestMapping("/")
	public String index() {
		
		return "index";
	}
	
	@RequestMapping("/list")
	public String list(Model model) {
	
		model.addAttribute("list", dao.evallist());
		
		return "list";
	}
	
	@RequestMapping("/writeForm")
	public String writeForm() {
		
		return "writeForm";
	}
}
