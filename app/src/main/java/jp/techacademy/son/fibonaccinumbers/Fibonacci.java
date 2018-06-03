package jp.techacademy.son.fibonaccinumbers;

import android.util.Log;

/**
 * Created by taiso on 2018/06/03.
 */

class Fibonacci {

    //何番目か
    String number;
    //n番目のフィボナッチ数
    String fibonacciNumber;
    //n番目までのフィボナッチ数列
    String fibonacciNumbers;

    //コンストラクタ
    public Fibonacci(String number,String fibonacciNumber,String fibonacciNumbers){
        this.number = number;
        this.fibonacciNumber = fibonacciNumber;
        this.fibonacciNumbers = fibonacciNumbers;
    }

    //メソッド
    public void show(){
        Log.d("aaa",number+"番目のフィボナッチ数:"+fibonacciNumber);
        Log.d("aaa",number+"番目のフィボナッチ数列:"+fibonacciNumbers);
    }
}
