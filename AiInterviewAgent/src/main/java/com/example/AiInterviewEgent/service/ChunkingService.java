package com.example.AiInterviewEgent.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ChunkingService {

	public List<String> chunkText(String content){
		List<String> chunks=new ArrayList<>();
		
		int chunkSize=500;
		for(int i=0;i<content.length();i+=chunkSize) {
			int end=Math.min(content.length(), i+chunkSize);
			chunks.add(content.substring(i, end));
		}
		return chunks;
	}
}
