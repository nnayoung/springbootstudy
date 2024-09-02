package com.project.springbootstudy.controller.forstudy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorViewController {

/*    @GetMapping("/forstudy/calculator")
    public String calculator() {
        return "/forstudy/calculator";
    }*/

    @GetMapping("/forstudy/calculator")
    public String calculator(@RequestParam(value="number1", required = false, defaultValue = "0.0") Double number1
            , @RequestParam(value="number2", required = false, defaultValue = "0.0") Double number2
            , @RequestParam(value="operation", required = false, defaultValue = "add") String operation
            , Model model) {

        System.out.println(number1 + "와 " + number2 + "를 " + operation + "하는 연산을 입력받았습니다");

        model.addAttribute("number1", number1);
        model.addAttribute("number2", number2);
        model.addAttribute("operation", operation);

        double result = 0.0;
        switch (operation) {
            case "add" : result = number1 + number2; break;
            case "subtract" : result = number1 - number2; break;
            case "multiply" : result = number1 * number2; break;
            case "divide" : result = number1 / number2; break;
        }

        model.addAttribute("result", result);
        return "/forstudy/calculator";
    }
}
