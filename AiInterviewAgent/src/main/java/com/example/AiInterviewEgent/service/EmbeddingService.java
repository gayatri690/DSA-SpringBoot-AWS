package com.example.AiInterviewEgent.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.ai.embedding.EmbeddingModel;
import org.springframework.stereotype.Service;

@Service
public class EmbeddingService {
	private final EmbeddingModel embeddingModel;
	
	public EmbeddingService(EmbeddingModel embeddingModel) {
		this.embeddingModel = embeddingModel;
	}
	
    public List<Float> generateEmbedding(String text) {
    	float[] embedding=embeddingModel.embed(text);
    	List<Float> floatList = IntStream.range(0, embedding.length)
                .mapToObj(i -> embedding[i])
                .collect(Collectors.toList());
    	return floatList;
    }
}
