package com.mysite.sbb.question;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.mysite.sbb.DataNotFoundException;

import groovy.transform.Generated;

@Service

public class QuestionService {
	private final QuestionRepository questionRepository;
	
	public List<Question> GetList(){
		return this.questionRepository.findAll();
	}
	
	public Question getQuestion(Integer id) {
		Optional<Question> question = this.questionRepository.findById(id);
		if(question.isPresent()) {
			return (Question)question.get();
			}else {
				throw new DataNotFoundException("질문을 찾을 수 없습니다");
			}
	}
	
	public void create(String Subject, String Content) {
		Question q = new Question();
		q.setSubject(Subject);
		q.setContent(Content);
		q.setCreateDate(LocalDateTime.now());
		this.questionRepository.save(q);
	}
	
	@Generated
	public QuestionService (QuestionRepository questionRepository) {	
		this.questionRepository = questionRepository;
	}
}
