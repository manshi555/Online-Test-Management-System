package com.capgemini.onlinetestmanagementsystem.service;


import org.springframework.stereotype.Service;

import com.capgemini.onlinetestmanagementsystem.entity.Question;


@Service
public interface QuestionService {

	public Question addQuestionDetils(Question question);

}
