package com.spring.orm;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Answer {
@Id
@Column(name = "answer_id")
private int answerId;
private String answer;
@OneToOne
@JoinColumn(name = "question_id")
private Question question;
public Answer(int answerId, String answer,Question question) {
	super();
	this.answerId = answerId;
	this.answer = answer;
	this.question=question;
}

public Answer() {
	// TODO Auto-generated constructor stub
}
public int getAnswerId() {
	return answerId;
}
public void setAnswerId(int answerId) {
	this.answerId = answerId;
}
public String getAnswer() {
	return answer;
}
public void setAnswer(String answer) {
	this.answer = answer;
}

public Question getQuestion() {
	return question;
}

public void setQuestion(Question question) {
	this.question = question;
}
	

}
