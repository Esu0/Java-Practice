/*
 * 「this.」の利用
 * 
 * 自分自身(現在のオブジェクト)のフィールドやメソッドを明示的に示すために、
 * 「this.」を用いることができる。
 */

class CarEx22 {
    int num;
    double gas;

    //フィールドのnumにアクセスできない。
    //・ローカル変数(ここでは引数)をフィールドと異なる文字にすればよいのだが。
    void setNumGasBad(int num, double gas) {
        num = num;
        gas = gas;
        System.out.println("ナンバーを" + num + "、ガソリン量を" + gas + "に設定");
    }

    //「this」を用いて、フィールドとローカル変数を区別。
    void setNumGasGood(int num, double gas) {
        this.num = num;
        this.gas = gas;
        System.out.println("ナンバーを" + num + "、ガソリン量を" + gas + "に設定");
    }
    
    void show() {
        System.out.println("ナンバーは" + num + "です。");
        System.out.println("ガソリン量は" + gas + "です。");
    }

    //「this」を用いて他のメソッドを明示的に指定
    void showCar() {
        System.out.println("車の情報");
        this.show();
    }
}

public class Example22 {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        CarEx22 car1 = new CarEx22();

        car1.setNumGasBad(1234, 20.5);
        System.out.println("setNumGasBadの結果:");
        car1.showCar();

        System.out.print("\n");

        car1.setNumGasGood(1234, 20.5);
        System.out.println("setNumGasGootの結果");
        car1.showCar();
    }
}
