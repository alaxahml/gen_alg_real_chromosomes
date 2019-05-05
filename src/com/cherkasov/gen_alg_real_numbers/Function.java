package com.cherkasov.gen_alg_real_numbers;

import java.util.List;

public class Function {
    public double value(List<Double> individual){
        // values of some mathematical functions
        //return (-((Math.pow(individual.get(1),2)*2.0)+(Math.pow(individual.get(0),2))*2.0));
         return -(Math.sqrt(4*(Math.pow(individual.get(0),2)/2 + Math.pow(individual.get(1)-5,2)/2)));
    }
}
