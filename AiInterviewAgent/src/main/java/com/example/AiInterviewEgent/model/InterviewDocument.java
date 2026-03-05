package com.example.AiInterviewEgent.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "interview_documents")
public class InterviewDocument {

	@Id	
	private String id;
	private String content;
	private String topic;
	private String experienceLevel;
	private String source;
	private List<Float> embedding;
	 public InterviewDocument() {}

	    public InterviewDocument(String content, String topic, String experienceLevel,
	            String source, List<Float> embedding) {
	        this.content = content;
	        this.topic = topic;
	        this.experienceLevel = experienceLevel;
	        this.source = source;
	        this.embedding = embedding;
	    }
	public List<Float> getEmbedding() {
			return embedding;
		}

		public void setEmbedding(List<Float> embedding) {
			this.embedding = embedding;
		}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getExperienceLevel() {
		return experienceLevel;
	}
	public void setExperienceLevel(String experienceLevel) {
		this.experienceLevel = experienceLevel;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	
	
}
