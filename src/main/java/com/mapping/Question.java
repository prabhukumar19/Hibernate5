package com.mapping;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Question {
	@Id
	@Column(name="questionId")
	private int id;
	private String question; 
	@OneToOne
	@JoinColumn(name="answerId")
	private Answer answer;
	
	
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Question(int id, String question, Answer answer) {
		super();
		this.id = id;
		this.question = question;
		this.answer = answer;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public Answer getAnswer() {
		return answer;
	}
	public void setAnswer(Answer answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "Question [id=" + id + ", question=" + question + ", answer=" + answer + "]";
	}
	
	
}
