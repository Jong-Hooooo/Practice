package com.mysite.sbb;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import com.mysite.sbb.answer.Answer;
import com.mysite.sbb.answer.AnswerRepository;
import com.mysite.sbb.question.Question;
import com.mysite.sbb.question.QuestionRepository;

@SpringBootTest
class BoardWebApplicationTests {
   
   @Autowired
   private QuestionRepository questionRepository;

   @Autowired
   private AnswerRepository answerRepository;
   
   @Test
   @Transactional
   void contextLoads() {
      
//      Question q1 = new Question();
//      q1.setSubject("sbb란 무엇인가요");
//      q1.setContent("sbb에 대해서 알고 싶습니다");
//      q1.setCreateDate(LocalDateTime.now());  
//      //데이터 베이스에 insert 기능을 실행
	   
//      this.questionRepository.save(q1);
//      
	   
//      Question q2 = new Question();
//      q2.setSubject("스프링 부트 모델 질문입니다");
//      q2.setContent("id는 자동으로 생성되나요?");
//      q2.setCreateDate(LocalDateTime.now());
	   //DB에 insert 사용
//      this.questionRepository.save(q2);

//		검색 select 쿼리문 실행 메소드 : findAll() 전체검색 select 문일 경우 select * from question
	   
	   
//      List<Question> all = this.questionRepository.findAll();
//      assertEquals(2, all.size()); //주어진 값이랑 검색 결과값이 동일한지
//      System.out.println(all.size());
//      
//      Question q = all.get(0);
//      System.out.println(q);   //주소
//      System.out.println(q.getContent());
//      System.err.println(q.getSubject());
//      System.out.println(q.getCreateDate());
//      
//      //Select * from question where id = ?
//      Optional<Question> oq = questionRepository.findById(1);
//      Question q = oq.get();
//      System.out.println(q.getSubject());
//      System.out.println(q.getContent());
//      System.out.println(q.getCreateDate());
//      
	 //select * from question where id = ?
	 		//select * from question where subject = ? 
	 		//select * from question where subject = ? and content = ?
	 		//findBy필드명 findBySubject = ?
	 		//findBySubjectOrContent
	 		//findBySubjectLike
	 		//findBySubjectOrderByCreateDataAsc
	 		//select * from question where subject = ? order By createDate Asc
	   
	   
//      if(oq.isPresent()) {
//         Question q1 = oq.get();
//         assertEquals("sbb란 무엇인가요", q1.getSubject());
//      }
//      
//      Question q2 = oq.get();
//      assertEquals("sbb란 무엇인가요", q2.getSubject());
//      
//      
//      //Select * from question where subject = ?
//      //find필드명 findBySubject() 메소드
//      
//      Question q = this.questionRepository.findBySubject("sbb란 무엇인가요");
//      assertEquals(1, q.getId());
//      
//      //select * from question subject = ? and content = ?
//      
//      Question q = this.questionRepository.findBySubjectAndContent("sbb란 무엇인가요", "sbb에 대해서 알고 싶습니다"   );
//      System.out.println(q.getSubject());
//      System.out.println(q.getContent());
//      System.out.println(q.getId());
//      
//      //findBySubjectAndContent
//      
//      
//      //findBySubjectOrContent
//      
//      
//      //findBySubjectLike
//      
//      List<Question> qList = this.questionRepository.findBySubjectLike("%sbb%");
//      Question q1 = qList.get(0);
//      System.out.println(q1.getSubject());
//      System.out.println(q1.getContent());
//      
//      //findBySubjectOrderByCreateDateASC
//      
//      
//      //수정
//      Optional<Question> oq = this.questionRepository.findById(1);
//      Question q = oq.get();
//      q.setSubject("수정된 제목");
//      q.setContent("내용도 수정");
//      this.questionRepository.save(q);
//      
//      //삭제
//      Optional<Question> oq = this.questionRepository.findById(1);
//      Question q = oq.get();
//      this.questionRepository.delete(q);
      
      Optional<Question> oq = this.questionRepository.findById(2);
      Question q = oq.get();
      
      Answer a = new Answer();
      a.setContent("답변은 여러개 등록 가능합니다.");
      a.setQuestion(q);
      a.setCreateDate(LocalDateTime.now());
      this.answerRepository.save(a);
   }

}