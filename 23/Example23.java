/*
 * クラスのカプセル化の1例
 * 
 * 保護したいメンバ(フィールドとメソッド)を「private」とし、
 * (また、内部データ操作するメソッドを「public」として特別に用意することで、)
 * 誤りの起きにくいプログラムを作成する。
 */

class CarEx23 {
    //保護したいフィールド:「private」修飾子=クラス外からアクセス不可
    private int num;
    private double gas;

    public void setNumGas(int n, double g) {
        //ガソリンの量の範囲を限定する。
        if (g > 0 && g < 1000) {
            num = n;
            gas = g;

            System.out.println("ナンバーを" + num + "にガソリン量を" + gas + "にしました。");
        }
        else {
            System.out.println(g + "は正しいガソリン量ではありません。");
            System.out.println("ガソリン量を変更できませんでした。");
        }
    }

    public void show() {
        System.out.println("車のナンバーは" + num + "です。");
        System.out.println("ガソリン量は" + gas + "です。");
    }
}

public class Example23 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        CarEx23 car1 = new CarEx23();

        //以下は実行不可
        //car1.num = 1234;
        //car1.gas = -10.0;

        //範囲外のガソリン量は入力できない。
        car1.setNumGas(1234, -10.0);
        System.out.print("\n");

        car1.setNumGas(1234, 10.0);
    }
}
