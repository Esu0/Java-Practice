/* 配列の宣言と確保 */

public class Example12 {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        //int[] test:配列の宣言
        //C言語と同様にint test[]でもOKだが、Javaでは上記が一般的。
        //new int[5]:配列の確保
        int[] test = new int[5];

        //配列への値の代入:インデックスは0から
        test[0] = 80;
        test[1] = 60;
        test[2] = 22;
        test[3] = 50;
        test[4] = 75;

        //配列の宣言確保と初期化を同時に行う場合
        //上記と同じ結果となる。
        //int[] test = {80, 60, 22, 50, 75};

        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + "番目の人の点数は" + test[i] + "です。");
        }
    }
}
