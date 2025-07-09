package com.mysite.sbb.question;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mysite.sbb.answer.AnswerForm;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;



@Controller
@RequiredArgsConstructor
@RequestMapping("/question")
public class QuestionController {
	private final QuestionService questionService;
	
	@GetMapping({"/list"})
	public String list(Model model, @RequestParam(value = "page", defaultValue = "0" ) int page ) { // 기본값이 0인 페이지 값 불러오는 코드
	     Page<Question> paging = this.questionService.GetList(page);
	     model.addAttribute("paging", paging);
	     return "question_list";
	   } //0708 수정, paging 기능으로 변경
	
	
	
	@GetMapping({"/detail/{id}"})
	public String detail(Model model, @PathVariable("id") Integer id, AnswerForm answerForm ) {
		Question question = this.questionService.getQuestion(id);
		model.addAttribute("question", question);
		return "question_detail";
		
	}
	
	@GetMapping({"/create"})
	public String questionCreate(QuestionForm questionForm) {
		return "question_form";
	}
	
	@PostMapping({"/create"})
	
	public String questionCreate(@Valid QuestionForm questionForm, BindingResult bindingResult) {
		
		if(bindingResult.hasErrors()) {
			return "question_form";
		}
		this.questionService.create(questionForm.getSubject(), questionForm.getContent());
	      return "redirect:/question/list";
	}
	
	
}


