package oop07y;

public class Car {
    protected int num;
    protected double gas;

    // private int num;
    // private double gas;

    public Car(int n, double g) {
        num = n;
        gas = g;
    }

    public Car() {
        this(0, 0.0);
    }

    public void setCar(int n, double g) {
        num = n;
        gas = g;
        System.out.println("ナンバーを" + num + "にガソリン量を" + gas + "にしました。");
    }

    public void show() {
        System.out.println("ナンバーは" + num + "です。");
        System.out.println("ガソリン量は" + gas + "です。");
    }
}
