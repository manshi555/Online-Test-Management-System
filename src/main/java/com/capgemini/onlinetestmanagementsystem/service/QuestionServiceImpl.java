package com.capgemini.onlinetestmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.onlinetestmanagementsystem.Repo.QuestionRepo;
import com.capgemini.onlinetestmanagementsystem.entity.Question;


@Service
public class QuestionServiceImpl implements QuestionService {
	
	@Autowired
	private QuestionRepo questionRepo;

	@Override
	public Question addQuestionDetils(Question question) {
		return questionRepo.save(question);
	}

	@Override
	public List<Question> getAllQuestionDetils() {
		return questionRepo.findAll();
	}

}
