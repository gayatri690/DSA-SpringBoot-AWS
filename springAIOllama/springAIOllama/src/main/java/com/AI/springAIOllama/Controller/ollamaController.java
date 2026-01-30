package com.AI.springAIOllama.Controller;

import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.ollama.api.OllamaChatOptions;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ai")
public class ollamaController {

	ChatModel chatmodel;
	public ollamaController(ChatModel chatmodel) {
		this.chatmodel=chatmodel;
	}
	@GetMapping("ask")
	public ChatResponse askAI(@RequestParam String prompt) {
		ChatResponse response = chatmodel.call(
			    new Prompt(
			        prompt,
			        OllamaChatOptions.builder()
			        	//.model(OllamaModel.LLAMA3_1)
		            	.temperature(0.4)
			            .build()
			    ));
			return response;
	}
}
