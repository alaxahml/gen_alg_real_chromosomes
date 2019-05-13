package com.cherkasov.gen_alg_real_numbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Initialization of classes that will be used
        Scanner in = new Scanner(System.in);
        RulesChecking rulesChecking = new RulesChecking();
        Recombination recombination = new Recombination();
        Mutation mutation=new Mutation();
        IndvidualSelection selection = new IndvidualSelection();
        //Initialization of list-population
        List<List<Double>> population = new ArrayList<>();
        int size;
        //Input of initial population
        System.out.println("Number of individuals: ");
        size=in.nextInt();
        System.out.println("Enter initial population: ");
        for (int i = 0; i < size; ++i) {
            population.add(new ArrayList<>());
            System.out.println(i+" individual: ");
            for(int j = 0;j<2;++j){
                population.get(i).add(in.nextDouble());
                while(!rulesChecking.check(population.get(i).get(population.get(i).size()-1))){
                    System.out.println("Wrong gen!");
                    population.get(i).set(population.get(i).size()-1,in.nextDouble());
                }
            }
        }

        //Making steps of algorithm  using counter to control precision
        int counter=0;
         do {
             population = recombination.recombinate(population);
             population = mutation.operate(population);
             population = selection.select(size, population);
             ++counter;
         }while (counter!=100000);

         //output of final population
        System.out.println("The result:");
         for(int i = 0;i<population.size();++i  ){
             System.out.println("Individual " + i);
             for(int j = 0;j<2;++j) {
                 System.out.println(population.get(i).get(j));
             }
         }
    }
}
