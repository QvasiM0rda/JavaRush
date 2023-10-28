package com.javarush.task.pro.task10.task1010;

import java.util.Objects;

/* 
Два айфона
*/

public class Iphone {
    private String model;
    private String color;
    private int price;

    public Iphone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (!(obj instanceof Iphone)) {
            return false;
        }
        Iphone iphone = (Iphone) obj;

        if (this.price != iphone.price) {
            return false;
        }

        if (this.color != null) {
            if (!this.color.equals(iphone.color)) {
                return false;
            }
        }

        if (this.model != null) {
            if (!this.model.equals(iphone.model)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Iphone iphone1 = new Iphone(null, "Black", 999);
        Iphone iphone2 = new Iphone(null, "as", 2);

        System.out.println(iphone1.equals(null));
    }

}
