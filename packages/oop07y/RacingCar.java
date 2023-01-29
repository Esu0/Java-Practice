package oop07y;

public class RacingCar extends Car {
    private int course;

    public RacingCar(int n, double g, int c) {
        super(n ,g);
        course = c;
    }

    public RacingCar() {
        this(0, 0.0, 0);
    }

    public void setCourse(int c) {
        course = c;
        System.out.println("コースを" + course + "にしました。");
    }

    public void RcShow() {
        System.out.println("ナンバーは" + num + "です。");
        System.out.println("ガソリン量は" + gas + "です。");
        System.out.println("コース番号は" + course + "です。");
    }
}
