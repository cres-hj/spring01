package com.example.demo.sample2;

import com.example.demo.sample1.*;
import jakarta.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;

import java.util.*;

// 어노테이션: 특별한 클래스. '클래스의 한정판'. 특별한 구조를 가진 클래스. 클래스의 변형이라고 생각해.
// 당연히 필드를 가져야해(=> value라는 클래스를 다들 갖는데 그 의미는 각각 다르지)
// @Component: 스프링 빈을 만들어라 (부모같은친구야) <- @Controller, @Service, @Repository
@Controller
public class Sample2Controller {
  private List<Todo> todos = new ArrayList<>();
  // todos에 값 넣어줄거야. 실행하는 코드는 반든시 함수 안에 들어가 있어야 해
  @PostConstruct
  public void init() {
    todos.add(new Todo(1, "영어 공부", false));
    todos.add(new Todo(2, "수학 공부", true));
    todos.add(new Todo(3, "국어 공부", false));
  }

  @GetMapping("/for/list1")
  public ModelAndView list() {
    return new ModelAndView("sample2/list1").addObject("todos", todos);
  }

}
