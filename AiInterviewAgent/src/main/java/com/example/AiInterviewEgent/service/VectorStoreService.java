package com.example.AiInterviewEgent.service;

import org.springframework.stereotype.Service;

import com.example.AiInterviewEgent.model.InterviewDocument;
import com.example.AiInterviewEgent.repository.InterviewVectorRepository;

@Service
public class VectorStoreService {
	private final InterviewVectorRepository repository;
	public VectorStoreService(InterviewVectorRepository repository) {
		this.repository = repository;
	}

	public void store(InterviewDocument document) {
		repository.save(document);
	}
}
