package com.cherkasov.gen_alg_real_numbers;

import java.util.ArrayList;
import java.util.List;

public class Recombination {
    public List recombinate(List<List<Double>> population){
        //Creating of additionl list to create second parent using random elements of the main list
        List<List<Double>> temp_parent = new ArrayList<>();
        int k;
        int size=population.size();
        for(int i = 0;i<population.size();i++){
            k=(int)(Math.random()*(population.size()));
            temp_parent.add(population.get(k));
        }
        //Recombination itself
        double alpha;
        for(int i = 0;i<size;++i){
            population.add(new ArrayList<>());
                    for(int j = 0;j<population.get(i).size();j++){
                        alpha=Math.random()*1.5 - 0.25;
                        population.get(population.size()-1).add(population.get(i).get(j)+alpha*
                                (population.get(i).get(j)-temp_parent.get(i).get(j)));
                    }
        }
        return population;
    }
}
