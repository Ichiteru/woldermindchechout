package entity;

import java.util.List;

public class Pimp extends Person{

    private List<Whore> whores;
    private double rate;


    public Pimp() {
    }

    public Pimp(List<Whore> whores, double rate) {
        this.whores = whores;
        this.rate = rate;
    }

    public Pimp(String name, List<Whore> whores, double rate) {
        super(name);
        this.whores = whores;
        this.rate = rate;
    }

    public Pimp(int age,String name, String surname,  List<Whore> whores, double rate) {
        super(age, name, surname);
        this.whores = whores;
        this.rate = rate;
    }

    public List<Whore> getWhores() {
        return whores;
    }

    public void setWhores(List<Whore> whores) {
        this.whores = whores;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
