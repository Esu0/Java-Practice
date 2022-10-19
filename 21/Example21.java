/* 引数と戻り値を持つメソッド */

class CarEx21 {
    int num;
    double gas;

    //引数なし、戻り値あり
    int getNum() {
        System.out.println("ナンバーを取得");
        return num;
    }

    //引数なし、戻り値あり
    double getGas() {
        System.out.println("ガソリン量を取得");
        return gas;
    }

    //引数2つ、戻り値なし
    void setNumGas(int n, double g) {
        num = n;
        gas = g;
        System.out.println("ナンバーを" + num + "ガソリン量を" + gas + "に設定");
    }

    //引数なし、戻り値なし
    void show() {
        System.out.println("ナンバーは" + num + "です。");
        System.out.println("ガソリン量は" + gas + "です。");
    }
}

public class Example21 {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        CarEx21 car1 = new CarEx21();

        //引数の利用
        car1.setNumGas(1234, 20.5);

        //戻り値の利用
        int number = car1.getNum();
        double gasoline = car1.getGas();

        System.out.print("\n");

        System.out.println("オブジェクトの値:");
        car1.show();

        System.out.print("\n");

        System.out.println("オブジェクトから取得した値:");

        System.out.println("ナンバーは" + number + "です。");
        System.out.println("ガソリン量は" + gasoline + "です。");
    }
}
