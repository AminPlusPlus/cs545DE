package mum.edu.controller;

import mum.edu.domain.Calculator;
import mum.edu.framework.annotation.AutoWired;
import mum.edu.framework.annotation.Controller;
import mum.edu.framework.annotation.RequestMapping;
import mum.edu.validator.CalculatorValidator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class CalculatorController {

    @AutoWired
    CalculatorValidator validator;

    @RequestMapping(value = {"/","/calculator"})
    public String calculatorStart(HttpServletRequest request, HttpServletResponse response){

        return "/WEB-INF/jsp/Calculator.jsp";
    }
    @RequestMapping(value = "/calculator_res")
    public String calculatorResult(Calculator calculator,HttpServletRequest request, HttpServletResponse response){

        List<String> errors = validator.validate(calculator);

        if (errors.isEmpty()) {
            // store product in a scope variable for the view
            request.setAttribute("result", calculator);
            return "/WEB-INF/jsp/CalculatorResult.jsp";
        } else {

            // store errors and product in a scope variable for the view
            request.setAttribute("errors", errors);
            request.setAttribute("form", calculator);
            return "/WEB-INF/jsp/Calculator.jsp";
        }
    }
}
