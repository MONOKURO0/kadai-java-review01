
public class Review01 {

    public static void main(String[] args) {
        // 税込み価格を計算したい金額（税抜価格、単位は円）
        int price = 1500;

        // taxメソッドを呼び出し、処理結果をint型変数に代入
        int salesTax= tax(price);

        // 演算結果を表示する
        System.out.println(price + "円の商品の税込価格は" + (price + salesTax) + "円（消費税は" + salesTax + "円）です。");

    }

    // 金額を表すint型変数1つを受け取り、
    // 入力された金額に対する消費税額を計算し、int型で返すtaxメソッド
    // （返される結果の消費税額は少数点以下切り捨て）
    public static int tax(int price) {

        // 消費税率(%)
        int taxRate = 10;
        // 処理結果
        int result;

        // 消費税額の演算結果をdouble型変数に代入
        double taxCalculation = price * ((double) taxRate / 100);

        // double型の消費税額をint型にキャストし、int型の処理結果変数に代入
        result = (int) taxCalculation;

        return result;
    }

}
