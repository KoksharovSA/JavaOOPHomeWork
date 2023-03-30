package org.example.FinalProject;

import org.example.FinalProject.Controller.Controller;

import java.awt.*;
import java.util.Scanner;

public class StartCalculate {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите действительную часть первого числа: ");
//        String num1real = sc.next();
//        System.out.println("Введите мнимую часть первого числа(ni): ");
//        String num1image = sc.next();
//        System.out.println("Введите действительную часть второго числа: ");
//        String num2real = sc.next();
//        System.out.println("Введите мнимую часть второго числа(ni): ");
//        String num2image = sc.next();
//        System.out.println("Введите знак операции( + | - | * | / ): ");
//        String operation = sc.next();
//        Controller.Calculate(num1real, num1image, num2real, num2image, operation);

//      TEST

        Controller.Calculate("-1.2","3.1i","4.3","-6.5i","+");
        Controller.Calculate("-7","5.1i","4.9","-3.5i","-");
        Controller.Calculate("-5.2","3.7i","3","5i","*");
        Controller.Calculate("-4","7.1i","9.7","-9i","/");
        Controller.Calculate("-1.9","3.5i","0","0i","/");
        Controller.Calculate("0","0i","4.3","-6.5i","/");
    }
}
