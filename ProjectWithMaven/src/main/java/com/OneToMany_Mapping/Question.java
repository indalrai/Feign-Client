package com.OneToMany_Mapping;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.OneToMany_Mapping.Answer;

@Entity
public class Question {
	
	@Id
	@Column(name="question_id")
	private int questionId;
	
	private String question;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="question",fetch=FetchType.EAGER)
	private List<Answer> answers;

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

	@OneToMany
	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

	public Question(int questionId, String question, List<Answer> answers) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answers = answers;
	}

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
//	@OneToOne(cascade = CascadeType.ALL )
//	@JoinColumn(name="a_id")
//	private Answer answer;

	
	
	
	
	
	

}