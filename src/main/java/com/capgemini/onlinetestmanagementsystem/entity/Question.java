package com.capgemini.onlinetestmanagementsystem.entity;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="questions")
public class Question {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="questionId")
	private int questionId;
	
	@Column(name="questionTitle")
	private String questionTitle;
	
	@Column(name="questionAnswer")
	private int questionAnswer;
	
	@Column(name="questionMarks")
	private int questionMarks;
	
	@Column(name="chosenAnswer")
	private int chosenAnswer;
	
	@Column(name="markScored")
	private int markScored;
	
	@Column(name="questionOptions")
	private String [] questionOptions;
	
	public Question()
	{
		
	}
	
	public int getQuestionId() {
		return questionId;
	}
	
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	
	public String getQuestionTitle() {
		return questionTitle;
	}
	
	public void setQuestionTitle(String questionTitle) {
		this.questionTitle = questionTitle;
	}
	
	public int getQuestionAnswer() {
		return questionAnswer;
	}
	
	public void setQuestionAnswer(int questionAnswer) {
		this.questionAnswer = questionAnswer;
	}
	
	public double getQuestionMarks() {
		return questionMarks;
	}
	
	public void setQuestionMarks(int questionMarks) {
		this.questionMarks = questionMarks;
	}
	
	public int getChosenAnswer() {
		return chosenAnswer;
	}
	
	public void setChosenAnswer(int chosenAnswer) {
		this.chosenAnswer = chosenAnswer;
	}
	
	public double getMarkScored() {
		return markScored;
	}
	
	public void setMarkScored(int markScored) {
		this.markScored = markScored;
	}
	
	public String[] getQuestionOptions() {
		return questionOptions;
	}
	
	public void setQuestionOptions(String[] questionOptions) {
		this.questionOptions = questionOptions;
	}
	
	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", questionTitle=" + questionTitle + ", questionAnswer="
				+ questionAnswer + ", questionMarks=" + questionMarks + ", chosenAnswer=" + chosenAnswer
				+ ", markScored=" + markScored + ", questionOptions=" + Arrays.toString(questionOptions) + "]";
	}
	
}
