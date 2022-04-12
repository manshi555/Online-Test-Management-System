package com.capgemini.onlinetestmanagementsystem.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.capgemini.onlinetestmanagementsystem.entity.Question;
import com.capgemini.onlinetestmanagementsystem.service.QuestionService;



@RestController
@RequestMapping("/api/v1")
public class QuestionController {
	
	   @Autowired
	   private QuestionService questionService;
	    
	   @PostMapping(path="/addQuestion")
	   public Question addQuestions(@RequestBody Question question) {
		 
	        return questionService.addQuestionDetils(question);
	    }
	   @GetMapping(path="/getAllQuestion")
	   public List<Question> getAllQuestions() {
		 
	        return questionService.getAllQuestionDetils();
	    }
}
