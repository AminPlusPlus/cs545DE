package edu.mum.controller;


import edu.mum.domain.Calculator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CalculatorController {

    Calculator calculator;
    @RequestMapping(value = "/")
    public String getCalculator(){
        return "Calculate";
    }

    @RequestMapping(value = "/calculator_res", method = RequestMethod.POST)
    public String calculateResult(Calculator calculator, Model model){
        model.addAttribute("result",calculator);
        return "CalculatorResult";
    }

}
