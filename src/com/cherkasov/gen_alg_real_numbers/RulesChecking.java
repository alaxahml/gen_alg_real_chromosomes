package com.cherkasov.gen_alg_real_numbers;

import java.util.List;

public class RulesChecking {
    public boolean check(Double gen){
        //checking for beloning to the domain of the definition
        if(gen < -50 || gen > 50){
            return false;
        }
        return true;
    }
}
