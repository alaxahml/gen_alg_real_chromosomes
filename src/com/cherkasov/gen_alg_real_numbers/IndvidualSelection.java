package com.cherkasov.gen_alg_real_numbers;

import java.util.ArrayList;
import java.util.List;

public class IndvidualSelection {
     public List select(int initial_size,List<List<Double>> population){
         //Initializing of two helping lists
         List<List<Double>> temp_population = new ArrayList<>();
         List<List<Double>> new_population = new ArrayList<>();
         //filling of the temp_population with elements of population sorted according to the value of function
         Function function = new Function();
         int size = population.size();
         for(int i = 0;i < size;++i){
             double max = function.value(population.get(0));
             int maxind = 0;
             for(int j = 1;j < size-i;++j){
                 if(function.value(population.get(j)) > max){
                     max = function.value(population.get(j));
                     maxind = j;
                 }
             }
             temp_population.add(population.get(maxind));
             population.remove(maxind);
         }
         new_population.add(temp_population.get(0));//this step helps not to lose the best solution
         //random selection from elite half of the sorted population made from the one came to input
         int k;
         for(int i=0;i < initial_size-1;++i){
             k = (int)(Math.random()*(population.size()/2));
             new_population.add(temp_population.get(k));
         }
         return new_population;
     }
}
