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

    public void DelOrder(int id ) {
            Order temp = null;
        for (Order order:this.orders ) {
            if (order.orderId == id) {

        this.orders.remove(order);
            }
            }

    }
    public void ChangeStatusOrder(int id,StatusOrder statusOrder ) {
        Order temp = null;
        for (Order order:this.orders ) {
            if (order.orderId == id) {

                order.setStatusOrder(statusOrder);
            }
        }

    }
}

