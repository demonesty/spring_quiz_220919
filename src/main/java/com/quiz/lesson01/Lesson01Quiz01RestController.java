package com.quiz.lesson01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lesson01/quiz02")
public class Lesson01Quiz01RestController {

	// http://localhost:8080/lesson01/quiz02/1
	@RequestMapping("/1")
	public List<Map<String, Object>> quiz02_1() {
		// @ResponseBody + String 리턴 => HttpMessageConverter String 내용을 response body에
		// 담아 HTML로 내린다.
		// @ResponseBOdy + 객체 리턴 => HttpMessageConverter jackson 라이브러리 => JSON 응답 - API

		List<Map<String, Object>> list = new ArrayList<>();
		Map<String, Object> map = new HashMap<>();
		map.put("rate", 15);
		map.put("director", "봉준호");
		map.put("time", 131);
		map.put("title", "기생충");
		list.add(map);

		map = new HashMap<>();
		map.put("rate", 0);
		map.put("director", "로베르트 베니니");
		map.put("time", 116);
		map.put("title", "인생은 아름다워");
		list.add(map);

		map = new HashMap<>();
		map.put("rate", 12);
		map.put("director", "크리스토퍼 놀란");
		map.put("time", 147);
		map.put("title", "인셉션");
		list.add(map);

		map = new HashMap<>();
		map.put("rate", 19);
		map.put("director", "윤종빈");
		map.put("time", 133);
		map.put("title", "범죄와의 전쟁: 나쁜놈들 전성시대");
		list.add(map);

		map = new HashMap<>();
		map.put("rate", 15);
		map.put("director", "프란시스 로렌스");
		map.put("time", 137);
		map.put("title", "헝거게임");
		list.add(map);

		return list;

	}

	// http://localhost:8080/lesson01/quiz02/2
	@RequestMapping("/2")
	public List<Cafe> quiz02_2() {
		List<Cafe> list = new ArrayList<>();
		
		Cafe cafe = new Cafe();
		cafe.setTitle("가입인사 드립니다");
		cafe.setUesr("hangulu");
		cafe.setContent("안녕하세요 가입했어요");
		list.add(cafe);
		
		cafe = new Cafe();
		cafe.setTitle("헐 대박");
		cafe.setUesr("bada");
		cafe.setContent("아 오늘 목요일이네");
		list.add(cafe);
		
		cafe = new Cafe();
		cafe.setTitle("오늘 데이트 한 이야기 해드립니다");
		cafe.setUesr("edward");
		cafe.setContent("...");
		list.add(cafe);
		
		return list; // jackson 라이브러리에 의해 JSON 변환
		
	}
	
	@RequestMapping("/3")
	public ResponseEntity<Cafe> quiz02_3() {
		Cafe cafe = new Cafe();
		cafe.setTitle("가입인사 드립니다");
		cafe.setUesr("hangulu");
		cafe.setContent("안녕하세요 가입했어요");
		
		return new ResponseEntity<>(cafe, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
