package com.companyCat;

import java.awt.print.Book;
import java.util.ArrayList;

public class Orders {
private ArrayList<Order> orders;


    public ArrayList<Order> getOrders() {
        return (ArrayList<Order>) orders.clone();
        //return orders;
    }

    public Orders() {
        this.orders = new ArrayList<>();
    }


    @Override
    public String toString() {
        return   orders + "\n";

    }

    public void AddOrder(Order order){


        this.orders.add(order);
    }

    public Order DelOrder(int id ) {
            Order temp = null;
        for (Order order:this.orders ) {
            if (order.orderId == id) {
                    temp = orders.remove(id);
            }
            }


        return temp;
    }


}

