package jp.techacademy.son.fibonaccinumbers;

import android.util.Log;

/**
 * Created by taiso on 2018/06/03.
 */

class Fibonacci {

    //フィボナッチ数
    String number;

    //コンストラクタ
    public Fibonacci(String number){
        this.number = number;
    }

    //メソッド
    public void show(){
        Log.d("aaa",number);
    }
}
