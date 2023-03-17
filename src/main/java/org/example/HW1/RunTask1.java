package org.example.HW1;

import java.util.ArrayList;

public final class RunTask1 {
    public static void Run() {
        Commodity bread = new Commodity("Хлеб", 30, 5, 10);
        Commodity oil = new Commodity("Масло", 130, 3, 15);
        Commodity Milk = new Commodity("Молоко", 69, 4, 20);

        ArrayList<Commodity> commodities_foodstuffs = new ArrayList<>();
        commodities_foodstuffs.add(bread);
        commodities_foodstuffs.add(oil);
        commodities_foodstuffs.add(Milk);

        Category foodstuffs = new Category("Продукты", commodities_foodstuffs);

        Commodity shampoo = new Commodity("Шампунь", 300, 5, 7);
        Commodity soap = new Commodity("Мыло", 30, 3, 50);
        Commodity toothpaste = new Commodity("Зубная паста", 169, 4, 15);

        ArrayList<Commodity> commodities_household = new ArrayList<>();
        commodities_household.add(shampoo);
        commodities_household.add(soap);
        commodities_household.add(toothpaste);

        Category household_goods = new Category("Хозяйственные товары", commodities_household);

        ArrayList<Category> categories = new ArrayList<Category>();
        categories.add(foodstuffs);
        categories.add(household_goods);

        PrintCommodities(categories);

        ArrayList<Commodity> basket_commodities = new ArrayList<>();
        basket_commodities.add(soap);
        Basket basket = new Basket(basket_commodities);

        System.out.println();
        for (Commodity com: basket_commodities) {
            System.out.println("Добавили в корзину " + com.getName() + " - " + com.getCount() + " шт.");
        }
        System.out.println();

        basket.Buy(categories);

        PrintCommodities(categories);
    }

    public static void PrintCommodities(ArrayList<Category> categories){
        for (Category cat: categories) {
            System.out.println(cat.getName());
            for (Commodity com: cat.getCommodities()) {
                System.out.println("(" + com.getRating() + ")" + com.getName() + " - " + com.getPrice() + "руб. - "
                        + com.getCount() + " шт.");
            }
        }
    }
}
