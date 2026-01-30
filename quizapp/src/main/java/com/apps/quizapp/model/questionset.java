package com.apps.quizapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class questionset {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String questionTitle;
	private String Option1;
	private String Option2;
	private String Option3;
	private String Option4;
	private String rightAnswer;
	private String difficultLevel;
	private String Category;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getQuestionTitle() {
		return questionTitle;
	}
	public void setQuestionTitle(String questionTitle) {
		this.questionTitle = questionTitle;
	}
	public String getOption1() {
		return Option1;
	}
	public void setOption1(String option1) {
		Option1 = option1;
	}
	public String getOption2() {
		return Option2;
	}
	public void setOption2(String option2) {
		Option2 = option2;
	}
	public String getOption3() {
		return Option3;
	}
	public void setOption3(String option3) {
		Option3 = option3;
	}
	public String getOption4() {
		return Option4;
	}
	public void setOption4(String option4) {
		Option4 = option4;
	}
	public String getRightAnswer() {
		return rightAnswer;
	}
	public void setRightAnswer(String rightAnswer) {
		this.rightAnswer = rightAnswer;
	}
	public String getDifficultLevel() {
		return difficultLevel;
	}
	public void setDifficultLevel(String difficultLevel) {
		this.difficultLevel = difficultLevel;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public questionset(Integer id, String questionTitle, String option1, String option2, String option3, String option4,
			String rightAnswer, String difficultLevel, String category) {
		super();
		this.id = id;
		this.questionTitle = questionTitle;
		Option1 = option1;
		Option2 = option2;
		Option3 = option3;
		Option4 = option4;
		this.rightAnswer = rightAnswer;
		this.difficultLevel = difficultLevel;
		Category = category;
	}
	public questionset() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
