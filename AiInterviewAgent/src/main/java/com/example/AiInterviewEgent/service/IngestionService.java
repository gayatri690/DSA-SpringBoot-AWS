package com.example.AiInterviewEgent.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.AiInterviewEgent.model.InterviewDocument;

@Service
public class IngestionService {
	private final ChunkingService chunkingService;
    private final EmbeddingService embeddingService;
    private final VectorStoreService vectorStoreService;

    public IngestionService(
    		ChunkingService chunkingService,
			EmbeddingService embeddingService,
			VectorStoreService vectorStoreService) {
    	this.chunkingService = chunkingService;
        this.embeddingService = embeddingService;
        this.vectorStoreService = vectorStoreService;
    }
    
    public void ingest(InterviewDocument document) {

        List<String> chunks = chunkingService.chunkText(document.getContent());

        for (String chunk : chunks) {
            List<Float> embedding = embeddingService.generateEmbedding(chunk);
            InterviewDocument vectorDocument =
                    new InterviewDocument(chunk, document.getTopic(),
                            document.getExperienceLevel(), document.getSource(), embedding
                    );
            vectorStoreService.store(vectorDocument);
        }
    } 
}
