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

        ArrayList<Commodity> basket_commodities1 = new ArrayList<>();
        basket_commodities1.add(soap.Take(25));
        Basket basket1 = new Basket(basket_commodities1);

        User user1 = new User("User1", "password", basket1);

        System.out.println();
        PrintUsersBasket(user1);

        ArrayList<Commodity> basket_commodities2 = new ArrayList<>();
        basket_commodities2.add(toothpaste.Take(10));
        Basket basket2 = new Basket(basket_commodities2);

        User user2 = new User("User1", "password", basket2);

        PrintUsersBasket(user2);
        System.out.println();

        PrintCommodities(categories);
    }

    public static void PrintUsersBasket(User user){
        for (Commodity com: user.getBasket().getBasketCommodities()) {
            System.out.println("В корзину покупателя " + user.getLogin() + " добавили " + com.getName() + " - " + com.getCount() + " шт.");
        }
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
