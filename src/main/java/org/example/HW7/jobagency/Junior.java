package org.example.jobagency;

import java.util.Random;

public class Junior implements Observer{
    String name;
    int salary;

    public Junior(String name){
        this.name = name;
        salary = 0;
    }
    @Override
    public void receiveOffer(String nameCompany, int salary) {
        if (new Random().nextBoolean()) {
            System.out.println(String.format("Junior %s: I need this work! (company, salary) = %s, %d", name, nameCompany, salary));
            this.salary = salary;
        }
        else{
            System.out.println(String.format("Junior %s: I got better job! (company, salary) = %s, %d", name, nameCompany, salary));
        }
    }
}
