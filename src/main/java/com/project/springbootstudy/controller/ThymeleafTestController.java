package com.project.springbootstudy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ThymeleafTestController {
    @GetMapping("/thymeleaf-test")
    public String returnTestPage(Model model) {

        // 1. th:text 예시용 데이터
        model.addAttribute("name", "김나영");
        model.addAttribute("age", 23);

        // 3. th:href 예시용 데이터
        model.addAttribute("siteName", "네이버");
        model.addAttribute("siteUrl", "https://www.naver.com/");

        // 4. th:value 예시용 데이터
        model.addAttribute("inputValue", "로로롤롤라라라");

        // 5. th:if 예시용 데이터
        model.addAttribute("isAdmin", true);  // true이면 관리자, false이면 일반인으로 표시

        // 6. th:switch와 th:case 예시용 데이터
        model.addAttribute("grade", "B");

        // 7. th:each 예시용 데이터 (table 반복)
        List<Map<String, String>> dictionary = new ArrayList<>();

        Map<String, String> row1 = new HashMap<>();
        row1.put("english", "apple");
        row1.put("korean", "사과");

        Map<String, String> row2 = new HashMap<>();
        row2.put("english", "banana");
        row2.put("korean", "바나나");

        Map<String, String> row3 = new HashMap<>();
        row3.put("english", "work");
        row3.put("korean", "일");

        Map<String, String> row4 = new HashMap<>();
        row4.put("english", "red");
        row4.put("korean", "빨간");

        dictionary.add(row1);
        dictionary.add(row2);
        dictionary.add(row3);
        dictionary.add(row4);

        model.addAttribute("dictionary", dictionary);

        return "thymeleaf-test";
    }
}