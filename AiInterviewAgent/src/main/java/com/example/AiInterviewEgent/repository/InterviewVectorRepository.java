package com.example.AiInterviewEgent.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.AiInterviewEgent.model.InterviewDocument;

public interface InterviewVectorRepository extends MongoRepository<InterviewDocument, String> {

	List<InterviewDocument> findByTopicAndExperiencelevel(String topic,String experienceLevel);
	
}
