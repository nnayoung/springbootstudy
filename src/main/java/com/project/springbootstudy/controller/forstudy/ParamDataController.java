package com.project.springbootstudy.controller.forstudy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ParamDataController {

    @GetMapping("/forstudy/search")
    public String search(@RequestParam(name="query" , required = true) String query
            , @RequestParam(name="page" , required = false , defaultValue = "1") String page) {

        System.out.println("name은 URL 안에 들어있는 쿼리스트링의 key를 의미하며 해당하는 value가 query변수에 저장됩니다.");
        System.out.println("required 옵션은 true이면 해당 쿼리스트링은 필수로 입력하라는 의미입니다. 안쓰면 오류 발생");
        System.out.println("defaultValue : 따로 입력을 안했을 때 세팅해줄 기본 값입니다.");

        return query + "라고 입력하셨고 검색할 페이지는 " + page + "페이지 입니다" ;

    }

    @GetMapping("/forstudy/search-test")
    public String testSearch(@RequestParam(name="category", required = true) String category
            , @RequestParam(name="page", required = false, defaultValue = "1") String page) {

        System.out.println(category + "에 대한 " + page + "의 요청이 들어왔습니다");

        return category + "라고 입력하셨고 검색할 페이지는 " + page + "페이지 입니다" ;
    }

    @GetMapping("/forstudy/find-my-pet-data")
    public List<String> findByPetData(@RequestParam(name="userId") String userId)  {
        List<String> pets = List.of("펫1" , "펫2" , "펫3");
        return pets;
    }
}
