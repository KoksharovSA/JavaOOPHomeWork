package org.example.ControlWork.View;

import org.apache.commons.lang3.math.NumberUtils;
import org.example.ControlWork.Model.BuildingBlocks;
import org.example.ControlWork.Model.Car;
import org.example.ControlWork.Model.Doll;
import org.example.ControlWork.Model.Toy;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ViewMenu {
    private List<String> menu = new ArrayList<String>(Arrays.asList("1.Вывести список игрушек", "2.Добавить игрушку",
            "3.Удалить игрушку", "4.Разыграть игрушку", "5.Выход"));

    private String[] ViewAddToy() {
        System.out.println("Введите тип игрушки(1.Конструктор; 2.Кукла; 3.Машинка):");
        String[] inputToy = new String[3];
        while (true) {
            System.out.println("Введите тип игрушки(1.Конструктор; 2.Кукла; 3.Машинка):");
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();
            if (!answer.isEmpty() && NumberUtils.isDigits(answer)
                    && Integer.parseInt(answer) <= 3 && Integer.parseInt(answer) > 0) {
                switch (Integer.parseInt(answer)) {
                    case 1:
                        inputToy[0] = "Конструктор";
                        break;
                    case 2:
                        inputToy[0] = "Кукла";
                        break;
                    case 3:
                        inputToy[0] = "Машинка";
                        break;
                }
                inputToy[0] = answer;
                break;
            } else {
                System.out.println("Неправильный ввод.");
            }
        }
        System.out.println("Введите название игрушки:");
        inputToy[1] = new Scanner(System.in).nextLine();
        while (true) {
            System.out.println("Введите шанс выпадения игрушки от 1 до 10:");
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();
            if (!answer.isEmpty() && NumberUtils.isDigits(answer)
                    && Integer.parseInt(answer) <= 10 && Integer.parseInt(answer) > 0) {
                inputToy[2] = answer;
                break;
            } else {
                System.out.println("Неправильный ввод.");
            }
        }
        return inputToy;
    }

    public void RunMenu() {
        System.out.println("Вас приветствует магазин игрушек!");
        for (String item : menu) {
            System.out.println(item);
        }
        while (true) {
            System.out.println("Выберите пункт меню:");
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();
            if (!answer.isEmpty() && NumberUtils.isDigits(answer)
                    && Integer.parseInt(answer) <= menu.size() && Integer.parseInt(answer) > 0) {
                System.out.println(answer);
                break;
            } else {
                System.out.println("Неправильный ввод.");
            }
        }
    }
}
