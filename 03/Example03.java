import java.io.*;

public class Example03 {
    public static void main(String[] args) throws IOException {
        //文字の入力
        System.out.println("文字列を入力してください。");

        //バッファの定義
        BufferedReader br = 
            //BufferedReader:文字、配列、行をバッファリング
            //InputStreamReader:バイトストリームを文字ストリームへ変換
            //System.in:標準入力。ここではキーボード
            new BufferedReader(new InputStreamReader(System.in));
        
        /*
         * BufferedReader.readLine():バッファ内のテキストを返す。
         * readLine()はI/O関連の例外IOExceptionを発生する可能性があるため、
         * 本来はtry/catchで処理すべきである。しかし、教科書の処理に近づけるため、
         * ここでは上記のthrow IOExceptionjを使う。つまり、実質的に例外処理は行わない。
         */

        String str = br.readLine();

        System.out.println(str + "が入力されました。");

        //数値の入力

        System.out.println("整数と実数を入力してください。");

        String str1 = br.readLine();
        String str2 = br.readLine();

        int num1 = Integer.parseInt(str1);
        double num2 = Double.parseDouble(str2);

        System.out.println(num1 + "と" + num2 + "が入力されました。");
    }
}