package mum.edu.validator;

import mum.edu.domain.Calculator;

import java.util.ArrayList;
import java.util.List;

public class CalculatorValidatorImpl implements CalculatorValidator {

    public List<String> validate(Object  object ) {
        List<String> errors = new ArrayList<String>();

        Calculator product = (Calculator) object;
        Integer add1 = product.getAdd1();
        Integer add2 = product.getAdd2();
        Integer mult1 = product.getMult1();
        Integer mult2 = product.getMult2();
        if (add1 == null || add2 == null || mult1 == null || mult2 == null ) {
            errors.add("Should not be null");
        }

        return errors;
    }
}
