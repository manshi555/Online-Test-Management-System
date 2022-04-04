package com.capgemini.onlinetestmanagementsystem.entity;

import java.util.Arrays;

public class Question {
	
	private int questionId;
	private String questionTitle;
	private int questionAnswer;
	private double questionMarks;
	private int chosenAnswer;
	private double markScored;
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
	
	public void setQuestionMarks(double questionMarks) {
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
	
	public void setMarkScored(double markScored) {
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
