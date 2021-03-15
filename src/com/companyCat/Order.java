package com.companyCat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Objects;


public class Order {
    public Order(int orderId, Date timeOrder, StatusOrder statusOrder,String... foods) {
        this.orderId = orderId;
        this.timeOrder = timeOrder;
        this.statusOrder = statusOrder;
        this.foods = new ArrayList<String>();
        for (String food : foods) {
            this.foods.add(food);
        }
    }



    int orderId;
    private Date timeOrder;
    private ArrayList<String> foods;
    private StatusOrder statusOrder;


    @Override
    public String toString() {
        return "("+ orderId +
                ", timeOrder=" + timeOrder +
                ", foods=" + foods +
                ", statusOrder=" + statusOrder +
                ')'+"\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return getTimeOrder().equals(order.getTimeOrder()) && getFoods().equals(order.getFoods())
                && getStatusOrder() == order.getStatusOrder();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTimeOrder(), getFoods(), getStatusOrder());
    }




    public Date getTimeOrder() {
        return timeOrder;
    }

    public void setTimeOrder(Date timeOrder) {
        this.timeOrder = timeOrder;
    }

    public ArrayList<String> getFoods() {
        return foods;
    }

    public StatusOrder getStatusOrder() {
        return statusOrder;
    }

    public void setStatusOrder(StatusOrder statusOrder) {
        this.statusOrder = statusOrder;
    }

    private void setFoods(StatusOrder foods) {
    }


}
