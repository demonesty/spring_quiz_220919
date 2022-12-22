package com.quiz.lesson01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Lesson01Quiz03 {
	
	// http://localhost:8080/lesson01/quiz03
	@RequestMapping("/lesson01/quiz03")
	public String quiz03() {
		 
		// ViewResolver - @ResponseBody 없을 떄 뷰의 경로를 찾는다.
		// /WEB-INF/jsp/             .jsp
		return "lesson01/quiz03";
	}
}
