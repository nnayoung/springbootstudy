package com.project.springbootstudy.controller.forstudy;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ParamViewController {

    @GetMapping("/forstudy/find-my-pet")
    public String findMyPet() {
        return "/forstudy/find-my-pet";  //find-my-pet 화면 반환
    }

    @GetMapping("/forstudy/find-my-pet-result")
    public String findMyPetView(@RequestParam(name="userId") String userId , Model model) {

        model.addAttribute("name" , userId);
        model.addAttribute("pets" , List.of("펫1" , "펫2" , "펫3"));

        return "/forstudy/find-my-pet-view";  //find-my-pet-view 결과 화면 반환
    }
}