package com.companyCat;

import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// Создать класс Ингредиент блюда (название,  кол-во, единица измерения, краткое описание)
        //Создать класс Блюдо (название, список ингредиентов, краткое описание, кол-во калорий,
        // время приготовления).
        //Создать класс Заказ (id, время заказа, безразмерный список блюд (экземпляров класса Блюдо),
        // отметка о выполнении).
        //Создать класс Заказы, содержащий безразмерный список заказов (экземпляров класса Заказ).
        //Для классов Заказ реализовать возможность добавления, удаления, изменения состояния).
        //Для класса Заказы реализовать возможность поиска (по времени, по наличию блюд с частичным совпадением
        // названия, невыполненных заказов).
        //Использовать обработку исключительных ситуаций при работе с классами.
        //Реализовать проверки корректности значений для всех Setter'ов.

        Ingridient egg = new Ingridient("egg", 1, Measure.piece,"");
        Ingridient cheese = new Ingridient("cheese", 100, Measure.gram,"");
        Ingridient milk = new Ingridient("milk", 100, Measure.millilitre,"");
        Ingridient flour = new Ingridient("flour", 50, Measure.gram,"");
        Ingridient sugar = new Ingridient("sugar",20,Measure.gram,"");
        Ingridient waterHot = new Ingridient("waterHot", 80, Measure.millilitre,"");
        Ingridient teaGreen = new Ingridient("teaGreen", 5, Measure.gram,"");
        Ingridient coffee = new Ingridient("coffee", 22, Measure.gram,"");

        Food omelette = new Food("omelette",  "",200,10,"egg",
                "cheese","milk","flour");
        Food eggsWithCheese = new Food("eggs with cheese", "very testy",
                300, 5, "egg","cheese");

        Food pancake = new Food("pancake","",500,15,"egg",
                "milk","sugar");
        Food espresso = new Food("espresso","",0,2,"coffee","water");
        Food teaGreenWithMilk = new Food("teaGreenWithMilk","",50,3,"teaGreen",
                "milk");

        System.out.println();


        Order order = new Order(1,new Date(),StatusOrder.accepted,"espresso","pancake" );
        Order order1 = new Order(2,new Date(),StatusOrder.processed,"TaeGreenMilk","omelette");
        Order order3 = new Order(3, new Date(), StatusOrder.accepted,"espresso","eggs with cheese");

        Orders orders = new Orders();


        orders.AddOrder(order);
        orders.AddOrder(order1);
        orders.AddOrder(order3);
        System.out.println(orders);
        //orders.DelOrder(2);
        orders.ChangeStatusOrder(3, StatusOrder.cancelled);
        System.out.println(orders);





    }
}
