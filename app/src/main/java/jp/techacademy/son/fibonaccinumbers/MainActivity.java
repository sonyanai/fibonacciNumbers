package jp.techacademy.son.fibonaccinumbers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button button;
    long t;
    long a1;
    long a2;
    String n;
    long fibonacciNumber;
    String fn;
    String fns;
    Fibonacci fibonacci;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        editText = (EditText)findViewById(R.id.editText);
        button = (Button)findViewById(R.id.button);

//        long ti=1000000000+1500000000;
//        String rt = String.valueOf(ti);
//        Log.d("bbb",rt);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                n = editText.getText().toString();

                //exitで終了するようにfor文を使う？




                //文字か数字かの確認
                try{
                    t = Integer.parseInt(n);
                }catch (NumberFormatException e){
                    if (n.equals("exit") || n.equals("quit")){
                        button.setEnabled(false);
                        editText.setText("入力不可");
                        //ボタンを背無いようにする
                    }
                    return ;
                }



                a1 =0;
                a2 =1;
                if (0<t && t<=70){
                    if (t==1){
                        fn="0";
                        fns="0";
                        fibonacci = new Fibonacci(n,fn,fns);
                        fibonacci.show();
                    }else if(t==2){
                        fn="1";
                        fns="0 1";
                        fibonacci = new Fibonacci(n,fn,fns);
                        fibonacci.show();
                    }else{
                        fns = "0 1 ";
                        for (int s=3;s<=t;s++){
                            fibonacciNumber = a1+a2;
                            fn =String.valueOf(fibonacciNumber);
                            fns =fns + fn+" ";

                            a1=a2;
                            a2=fibonacciNumber;

                        }
                        fibonacci = new Fibonacci(n,fn,fns);
                        fibonacci.show();
                    }
                }
            }
        });
    }
}
