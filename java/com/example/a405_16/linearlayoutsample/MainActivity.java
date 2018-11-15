package com.example.a405_16.linearlayoutsample;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Context ctx = MainActivity.this;
        final EditText num = findViewById(R.id.num);
        final TextView result = findViewById(R.id.result);
        class Calc{
            private int num,res;
            String op;
           /* public void exe(){
                switch(op){
                    case "+": res = num1 + num2; break;
                    case "-": res = num1 - num2; break;
                    case "*": res = num1 * num2; break;
                    case "/": res = num1 / num2 ; break;
                }
            }*/
            public void setNum(int num){this.num=num;}
            public int getNum(){return this.num;}
            public void setRes(int res){this.res=res;}
            public int getRes(){return this.res;}
            public void setOp(String op){this.op=op;}
            public String getOp(){return this.op;}

        }
        final Calc calc = new Calc();

        findViewById(R.id.plusBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(num.getText().toString());
                calc.setNum(a);
                calc.setOp("+");
                //calc.exe();
            }
        });
        findViewById(R.id.minusBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(num.getText().toString());
                calc.setNum(a);
                int b = Integer.parseInt(num.getText().toString());
                calc.setOp("-");
                calc.exe();
                }
        });
        findViewById(R.id.multiBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int a = Integer.parseInt(num.getText().toString());
                calc.setNum(a);
                final int b = Integer.parseInt(num.getText().toString());
                calc.setOp("*");
                calc.exe();
            }
        });
        findViewById(R.id.divisionBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int a = Integer.parseInt(num.getText().toString());
                calc.setNum(a);
                final int b = Integer.parseInt(num.getText().toString());
                calc.setNum(b);
                int c = a / b;
                calc.setOp("/");
                calc.exe();
            }
        });
        findViewById(R.id.equalBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ctx, ""+calc.getRes(), Toast.LENGTH_SHORT).show();

            }
        });

        }
}
