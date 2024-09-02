package com.project.springbootstudy.service;

import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class DictionaryService {

    public String getKoreanWord(String word) {

        HashMap<String, String> dict = new HashMap<>();
        dict.put("apple" , "사과");
        dict.put("book" , "책");
        dict.put("star" , "별");
        dict.put("doghoney" , "개꿀");

        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i) >= 48 && word.charAt(i) <= 57) {
                return "숫자는 안됨";
            }
        }

        if (dict.get(word) != null) {
            return dict.get(word);
        } else {
            return "그런 단어 없음";
        }
    }
}
