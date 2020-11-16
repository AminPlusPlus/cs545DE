package edu.mum.service.impl;

import org.springframework.stereotype.Service;

import edu.mum.domain.Calculator;
import edu.mum.service.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService  {

 	public void add(Calculator calculator){
		calculator.add();
		
		/*
		 * Possible "externalized" Logic/notification
		 * Is this the right place?
		 * [Thin .vs. rich domain model]
		  if calculator.getSum() <= minLimit
		  	register warning
		  	notify warning processor
		 */
		return ;
	}
	
	public void mult(Calculator calculator){
		calculator.mult();
		
		/*
		  if calculator.getProduct() >  maxLimit
		  	register over allowance
		  	notify overflow processor
		 */

		
		return ;
	}

}
