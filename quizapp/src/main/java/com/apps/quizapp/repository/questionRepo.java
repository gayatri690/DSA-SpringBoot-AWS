package com.apps.quizapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apps.quizapp.model.questionset;

import org.springframework.stereotype.*;
@Repository
public interface questionRepo extends JpaRepository<questionset,Integer>{

	
}
