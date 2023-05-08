package org.example.ControlWork.View;

import org.apache.commons.lang3.math.NumberUtils;
import org.example.ControlWork.Controller.Draws;
import org.example.ControlWork.Controller.Roulette;
import org.example.ControlWork.Controller.Settings;
import org.example.ControlWork.Controller.WorkingWithData;
import org.example.ControlWork.Model.*;

import java.util.*;

public class ViewMenu {
    private List<String> menu = new ArrayList<String>(Arrays.asList("1.Вывести список игрушек", "2.Добавить игрушку",
            "3.Удалить игрушку", "4.Разыграть игрушку", "5.Выход"));

    private String[] ViewAddToy() {
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

    private void ViewRemoveToy() {
        while (true) {
            System.out.println("Введите ID удаляемой игрушки(введите 0 для отмены):");
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();
            if (!answer.isEmpty() && NumberUtils.isDigits(answer)) {
                if (Integer.parseInt(answer) == 0) {
                    break;
                } else {
                    if (new WorkingWithData().RemoveToy(Integer.parseInt(answer))) {
                        System.out.println("Игрушка удалена.");
                    } else {
                        System.out.println("Нет такой игрушки.");
                    }
                }
            } else {
                System.out.println("Неправильный ввод.");
            }
        }
    }

    public void RunMenu(ToyMarket market) {

        Comparator<Roulette> idComparator = new Comparator<Roulette>() {
            @Override
            public int compare(Roulette c1, Roulette c2) {
                return (int) (c1.getLastTry() - c2.getLastTry());
            }
        };

        System.out.println("Вас приветствует магазин игрушек!");
        boolean isMoveOn = true;
        while (isMoveOn) {
            for (String item : menu) {
                System.out.println(item);
            }
            System.out.println("Выберите пункт меню:");
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();
            if (!answer.isEmpty() && NumberUtils.isDigits(answer)
                    && Integer.parseInt(answer) <= menu.size() && Integer.parseInt(answer) > 0) {
                switch (Integer.parseInt(answer)) {
                    case 1:
                        System.out.println(market.toString());
                        break;
                    case 2:
                        new WorkingWithData().AddToy(ViewAddToy());
                        market.setToys(new WorkingWithData()
                                .Fill(Settings.dirDb));
                        break;
                    case 3:
                        ViewRemoveToy();
                        break;
                    case 4:
                        Queue<Roulette> draws = new PriorityQueue<Roulette>(10, idComparator);
                        for (int i = 0; i < 10; i++) {
                            draws.add(new Roulette());
                        }
                        System.out.println("По заданию будет разыграно 10 игрушек.");
                        for (int i = 0; i < 10; i++) {
                            Toy toy = draws.poll().RunDraw(market.getToys());
                            System.out.println("Розыгрыш №" + i + ": " + toy.toString());
                        }
                        break;
                    case 5:
                        isMoveOn = false;
                }
            } else {
                System.out.println("Неправильный ввод.");
            }
        }
    }
}
