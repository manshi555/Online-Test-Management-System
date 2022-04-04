package com.capgemini.onlinetestmanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.capgemini.onlinetestmanagementsystem.entity.Question;
import com.capgemini.onlinetestmanagementsystem.service.QuestionService;


//@CrossOrigin("*")
@RestController
public class QuestionController {
	
	   @Autowired
	   private QuestionService questionService;
	    
       @PostMapping("/employees")
	   public Question addQuestions(@RequestBody Question question) {
		 
	        return questionService.addQuestionDetils(question);
	    }


}
