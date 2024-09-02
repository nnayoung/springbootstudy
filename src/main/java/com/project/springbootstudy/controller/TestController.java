package com.project.springbootstudy.controller;

import com.project.springbootstudy.service.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

@Controller   //이 클래스는 컨트롤러로 사용자의 요청을 받는 기능을 할거야
@ResponseBody //이 클래스는 응답을 줄때 page가 아니라 입력값 그대로 보내줄거야
public class TestController {

    @Autowired
    DictionaryService dictionaryService;

    @GetMapping("/{name}/{message}") //요청 예시 : ip주소:port번호/김나영/스윽 몰래 들어와본다
    public String helloMan(@PathVariable(name="name") String name , @PathVariable(name="message") String message) {

        System.out.println(name + "님이 접속했습니다. 메세지 : " + message);
        return "반갑습니다." + name + "님!";
    }

    @GetMapping("/dictionary/{word}")
    public String dictionaryTest(@PathVariable(name="word") String word) {

        System.out.println("사용자가 " + word + "를 검색했음");
        String result = dictionaryService.getKoreanWord(word);
        return result;
    }
}