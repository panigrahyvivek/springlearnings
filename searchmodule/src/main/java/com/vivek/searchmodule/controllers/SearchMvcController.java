package com.vivek.searchmodule.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vivek.searchmodule.models.Search;

@Controller
@RequestMapping("search")
public class SearchMvcController{
	
	@GetMapping
	public String renderServerSideSearchPage(Model model) {
		model.addAttribute("title", "Welcome to Vivek Search!!");
		model.addAttribute("newSearch", new Search());
		return "searchpage";
	}
}