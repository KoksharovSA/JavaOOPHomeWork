package org.example.jobagency;

public class Middle implements Observer{
    String name;
    int salary;

    public Middle(String name){
        this.name = name;
        salary = 0;
    }
    @Override
    public void receiveOffer(String nameCompany, int salary) {
        if (this.salary < 20) {
            System.out.println(String.format("Middle %s: I need this work! (company, salary) = %s, %d", name, nameCompany, salary));
            this.salary = salary;
        }
        else{
            System.out.println(String.format("Middle %s: I got better job! (company, salary) = %s, %d", name, nameCompany, salary));
        }
    }
}
