/*
 * メソッドのオーバーロード(多重定義)
 * 
 * メソッドは *引数の型と個数* を異にする *同名* の宣言が可能である。
 * ただし、戻り値の型で区別することはできない。
 */

class CarEx24 {
    private int num;
    private double gas;

    //引数がint1つの「setCar()」
    public void setCar(int n) {
        num = n;

        System.out.println("ナンバーを" + num + "にしました。");
    }

    //引数がdouble1つの「setCar()」
    public void setCar(double g) {
        gas = g;

        System.out.println("ガソリン量を" + gas + "にしました。");
    }

    //引数がint1つとdouble1つの「setCar()」
    public void setCar(int n, double g) {
        num = n;
        gas = g;

        System.out.println("ナンバーを" + num + "にガソリン量を" + gas + "にしました。");
    }

    public void show() {
        System.out.println("車のナンバーは" + num + "です。");
        System.out.println("ガソリン量は" + gas + "です。");
    }
}

public class Example24 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        CarEx24 car1 = new CarEx24();

        //以下、引数の型と個数でメソッドを区別できている。

        car1.setCar(1234, 20.5);
        car1.show();

        System.out.print("\n");
        car1.setCar(5678);
        car1.show();

        System.out.print("\n");
        car1.setCar(10.5);
        car1.show();
    }
}
