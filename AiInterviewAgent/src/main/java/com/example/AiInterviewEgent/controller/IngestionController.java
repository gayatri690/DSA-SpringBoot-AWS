package com.example.AiInterviewEgent.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.AiInterviewEgent.model.InterviewDocument;
import com.example.AiInterviewEgent.service.IngestionService;

@RestController
public class IngestionController {

	private final IngestionService ingestionService;
	public IngestionController(IngestionService ingestionService) {
		this.ingestionService = ingestionService;
	}
	
	public String ingest(@RequestBody InterviewDocument document) {
		ingestionService.ingest(document);
		return "Ingestion successful";
	}
}
