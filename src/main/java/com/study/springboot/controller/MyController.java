package com.study.springboot.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.study.springboot.entity.Movie;
import com.study.springboot.jdbc.MovieMapper;


@Controller
public class MyController {

	@Autowired
	private MovieMapper mMapper;

	@GetMapping("/")
	public String root() {
		return "view/index";
	}

	@GetMapping("/list") 
	public String ListMapper(Model model) {
		List<Movie> mlist = mMapper.selectAll();
		model.addAttribute("mlist", mlist);
		return "view/list";
	}

	@GetMapping("/insert")
	public String insert() {
		return "view/insert";
	}

	@PostMapping("/insert")
	public String insert(Movie movie) {
		mMapper.insert(movie);
		return "redirect:list";
	}
	
	@GetMapping("/update")
	public String update(Model model, int did) {
		List<Movie> mlist = mMapper.getDid(did);
		model.addAttribute("mlist", mlist);
		return "view/update";
	}
	
	@PostMapping("/update.do")
	public String update2(Movie movie){
		mMapper.update(movie);
		return "redirect:/list";
	}
	
	@GetMapping("/delete")
	public String delete() {
		return "view/delete";
	}
	
	@GetMapping("/delete.do")
	public String delete(int did) {
	mMapper.delete(did);
	return "redirect:/list";
	}
	
	


}
