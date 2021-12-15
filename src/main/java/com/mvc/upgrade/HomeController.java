package com.mvc.upgrade;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mvc.upgrade.model.dto.SampleDto;
import com.mvc.upgrade.model.service.SampleService;
import com.mvc.upgrade.model.service.SampleServiceImpl;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	//service를 상속받는 serviceImpl의 객체를 따로 생성하지 않아도 어노테이션을 사용하여 처리
		@Autowired
		private SampleService service;
		
		@RequestMapping("/list.do")
		public String list(Model model) {
			logger.info("SELECT LIST");
			model.addAttribute("list",service.selectList());
			
			
			return "mvcList";
		}
		
		@RequestMapping("selectOne.do")
		public String selectOne(Model model,int spNo) {
			logger.info("SELECT ONE");
			model.addAttribute("list2",service.selectOne(spNo));
			
			return "mvcOne";
		}
		
		@RequestMapping("insertForm.do")
		public String insertForm(Model model) {
				logger.info("INSERT FORM");
			return "insertForm";
		}
		
		@RequestMapping("insert.do")
		public String insert(Model model,SampleDto dto) {
			logger.info("INSERT");
			
			int res = 0;
			
			res = service.insert(dto);
			
			if(res>0) {
				System.out.println("게시글 작성 성공");
				return "redirect:list.do";
			}else {
				System.out.println("작성실패");
				return "redirect:list.do";
			}
		}
		
		@RequestMapping("updateForm.do")
		public String updateForm(Model model,int spNo) {
				logger.info("UPDATE FORM");
				 model.addAttribute("dto",service.selectOne(spNo));
			return "updateForm";
		}
		
		@RequestMapping("update.do")
		public String update(Model model, SampleDto dto) {
			int res = 0;
			
			res = service.update(dto);
			
			if(res>0) {
				System.out.println("업데이트 성공!!");
				return "redirect:selectOne.do?spNo="+dto.getSpNo();
			}else {
				System.out.println("업데이트 실패!!");
				return "redirect:updateForm.dospNo="+dto.getSpNo();
			}
			
			 
		}
		
		@RequestMapping("delete.do")
		public String delete(int spNo,SampleDto dto) {
			
			int res= 0;
			
			res = service.delete(spNo);
			
			if(res>0) {
				System.out.println("삭제 성공");
				return "redirect:list.do";
			}else {
				System.out.println("삭제 실패");
				return "redirect:selectOne.do?spNo="+dto.getSpNo();
			}
			
			
		}
		
		
		
		
	}
	

