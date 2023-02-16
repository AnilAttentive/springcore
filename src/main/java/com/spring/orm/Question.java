package com.spring.orm;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "q")
public class Question {
@Id
@Column(name = "question_id")
private int questionId;
private String question;

@OneToOne
@JoinColumn(name="answer_id")
private Answer answer;
public Question() {
	// TODO Auto-generated constructor stub
}
public Question(int questionId, String question, Answer answerId) {
	super();
	this.questionId = questionId;
	this.question = question;
	this.answer = answerId;
}
public int getQuestionId() {
	return questionId;
}
public void setQuestionId(int questionId) {
	this.questionId = questionId;
}
public String getQuestion() {
	return question;
}
public void setQuestion(String question) {
	this.question = question;
}
public Answer getAnswerId() {
	return answer;
}
public void setAnswerId(Answer answerId) {
	this.answer = answerId;
}
}

