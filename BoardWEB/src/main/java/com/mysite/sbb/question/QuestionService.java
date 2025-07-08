package com.mysite.sbb.question;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.mysite.sbb.DataNotFoundException;

import groovy.transform.Generated;

@Service

public class QuestionService {
	private final QuestionRepository questionRepository;
	
	public Page<Question> GetList(int page){
		List<Sort.Order> sorts = new ArrayList<>(); //Sorts - 정렬 기준이 담길 컬렉션
		sorts.add(Sort.Order.desc("createDate")); //createDate를 기준으로 내림차순 정렬
		Pageable pageable = PageRequest.of(page, 10, Sort.by(sorts));
		return this.questionRepository.findAll(pageable);
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
