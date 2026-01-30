package com.apps.quizapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apps.quizapp.model.questionset;
import com.apps.quizapp.service.questionService;

@RestController
@RequestMapping("/quiz")
public class quizController {

	@Autowired
	questionService qs;
	
	@GetMapping("questions")
	public List<questionset> getAllQuestions() {
		return qs.getAllQuestions();
	}
}
