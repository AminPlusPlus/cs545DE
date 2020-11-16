package edu.mum.controller;



/*import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.mum.domain.Calculator;
import edu.mum.service.CalculatorService;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@SessionAttributes("calculator")
public class CalculatorController {
 
	  @Autowired
	  CalculatorService calculatorService;
	  
  @RequestMapping(value={"/","/Calculator"} , method = RequestMethod.GET)
  public String inputCalc(Calculator calculator ) throws Exception {
          return  "CalculatorForm" ;    
}
   
  @RequestMapping(value= "/Calculator" , method = RequestMethod.POST)
  public String handleCalc( Calculator calculator, Model model ) throws Exception {

  	   calculatorService.add(calculator);
  	   calculatorService.mult(calculator);
	  System.out.println(calculator.getProduct());
  	   model.addAttribute("calculator",calculator);
       return  "redirect:Calculator" ;
   }
   
 
}
