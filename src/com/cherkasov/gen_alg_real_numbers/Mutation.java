package com.cherkasov.gen_alg_real_numbers;

import java.util.List;

public class Mutation {
    public List operate(List<List<Double>> population){
        //the less size of the population, the bigger chance for the population to be mutated
        double chance = 1.0/population.size();
        double chance1 = Math.random()*1,chance2;
        int ind_num;
        if(chance1 <= chance){
            double alpha = 0.5*(300);//0.5*(domain of definition mentioned in RulesChecking class)
            double beta;
            ind_num = (int)(Math.random()*population.size());
            for(int i=0;i<population.get(ind_num).size();++i){
                beta = 0;
                for(int i1 = 0;i1 < 20;++i1){
                   double ai1;
                   chance2 = (Math.random()*1);
                   if(chance2 <= (1.0/20.0)){
                       ai1 = 1;
                   }
                   else{
                       ai1 = 0;
                   }
                   beta += ai1*Math.pow(2,-i1);
                }
                double temp = population.get(ind_num).get(i);
                chance2 = (Math.random()*1);
                if(chance2 <= 0.5) {
                    population.get(ind_num).set(i, temp + (alpha*beta));
                }
                else{
                    population.get(ind_num).set(i, temp - (alpha*beta));
                }
            }
        }
        return population;
    }
}
