package entity;

import java.io.*;

public class Whore extends Person implements Serializable {

    private String alias;
    private double price;

    public void suck() {
        System.out.println("SUCKING");
    }

    public void fuck() {
        System.out.println(this.getAlias() +  " is FUCKING");
    }

    public boolean doIWantMore() {
        if (!(this.price < 100)) {
            return false;
        }
        System.out.println("I want more money");
        return true;
    }

    public Whore(String name, String alias, double price) {
        super(name);
        this.alias = alias;
        this.price = price;
    }

    public Whore(String alias, double price) {
        this.alias = alias;
        this.price = price;
    }

    public Whore(int age, String name, String surname, String alias, double price) {
        super(age, name, surname);
        this.alias = alias;
        this.price = price;
    }

    public Whore() {
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Whore{" +
                "alias='" + alias + '\'' +
                ", price=" + price +
                '}';
    }
}
