package edu.mum.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/")
public class AdviceController {

    @RequestMapping(method = RequestMethod.GET)
    public String welcome() {
        return "Authenicatate";
    }


    @RequestMapping(method = RequestMethod.GET)
    public String result(Model model) {
        return "Advice";
    }
}
