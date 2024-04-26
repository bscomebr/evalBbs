/**
 * 
 */
package com.green.evalBbs.controller;

import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.green.evalBbs.dao.IEvalBbsDao;
import com.green.evalBbs.dto.EvalBbsDto;

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

	@RequestMapping("/detail")
	public String detail(@RequestParam("bno") String bno, Model model) {
		
		model.addAttribute("list", dao.evaldetail(bno));
		
		return "detail";
	}
	
	@RequestMapping("/write")
	public String writeForm(HttpServletRequest request, String title, String content, String writer,
			String regdate) {

		String title_ = request.getParameter("title");
		String content_ = request.getParameter("content");
		String writer_ = request.getParameter("writer");
		String regdate_ = request.getParameter("regdate");
		System.out.println("날자 :" + regdate_);
		
		dao.evalinsert(title_, content_, writer_, regdate_);
		return "redirect:list";
	}

	
	

}
