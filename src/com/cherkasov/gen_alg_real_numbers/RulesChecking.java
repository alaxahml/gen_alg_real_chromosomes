package com.cherkasov.gen_alg_real_numbers;

import java.util.List;

public class RulesChecking {
    public boolean check(List<List<Double>> population){
        //checking for beloning to the domain of the definition
        for(int i=0;i<population.size();i++){
            for(int j=0;j<population.get(i).size();++j) {
                if (population.get(i).get(j) < -150 || population.get(i).get(j) >150) {
                    return false;
                }
            }
        }
        return true;
    }
}
