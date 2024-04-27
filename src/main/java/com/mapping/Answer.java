package com.mapping;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Answer {
	@Id
	@Column(name="answerId")
	private int id;
	private String answer;
	@OneToOne(mappedBy = "answer")
	private Question question;
	
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Answer(int id, String answer) {
		super();
		this.id = id;
		this.answer = answer;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	
	
}
