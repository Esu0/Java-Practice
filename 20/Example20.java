/* メソッドの基本 */

class CarEx20 {
    int num;
    double gas;

    //メソッドの宣言
    void show() {
        System.out.println("ナンバーは" + num + "です。");
        System.out.println("ガソリン量は" + gas + "です。");
    }

    //他のメソッドを利用するメソッド
    void showCar() {
        System.out.println("車の情報");
        show();
    }
}

public class Example20 {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        CarEx20 car1 = new CarEx20();

        car1.num = 1234;
        car1.gas = 20.05;

        car1.show();

        System.out.print("\n");

        car1.showCar();
    }
}
