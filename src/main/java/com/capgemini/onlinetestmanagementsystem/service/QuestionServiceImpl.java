package com.capgemini.onlinetestmanagementsystem.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.capgemini.onlinetestmanagementsystem.Repo.QuestionRepo;
import com.capgemini.onlinetestmanagementsystem.entity.Question;


public class QuestionServiceImpl implements QuestionService {
	
	@Autowired
	private QuestionRepo questionRepo;

	@Override
	public Question addQuestionDetils(Question question) {
		return questionRepo.save(question);
	}

}
