package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, plus, minus, ymn, result, del,
            ster, zap, pm, sk;
    TextView tv1;
    Double ch1;
    String operator;
    int m = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        b0 = (Button) findViewById(R.id.b0);
        plus = (Button) findViewById(R.id.plus);
        ymn = (Button) findViewById(R.id.ymn);
        minus = (Button) findViewById(R.id.minus);
        del = (Button) findViewById(R.id.del);
        ster = (Button) findViewById(R.id.ster);
        zap = (Button) findViewById(R.id.zap);
        pm = (Button) findViewById(R.id.pm);
        sk = (Button) findViewById(R.id.sk);
        result = (Button) findViewById(R.id.res);
        tv1 = (TextView) findViewById(R.id.textView);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText() + "1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText() + "2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText() + "3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText() + "4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText() + "5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText() + "6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText() + "7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText() + "8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText() + "9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText() + "0");
            }
        });
        zap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {tv1.setText(tv1.getText() + ".");}
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operator = "+";
                ch1 = Double.parseDouble((String) tv1.getText());
                tv1.setText("");
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operator = "-";
                ch1 = Double.parseDouble((String) tv1.getText());
                tv1.setText("");
            }

        });
        ymn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operator = "*";
                ch1 = Double.parseDouble((String) tv1.getText());
                tv1.setText("");
            }

        });
        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operator = "/";
                ch1 = Double.parseDouble((String) tv1.getText());
                tv1.setText("");
            }
        });
        ster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operator = "C";
                ch1 = Double.parseDouble((String) tv1.getText());
                tv1.setText("");
            }
        });
        pm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operator = "+-";
                ch1 = Double.parseDouble((String) tv1.getText());
                tv1.setText(String.valueOf(ch1 * -1 ));
            }
        });
        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operator.equals("+")) {
                    tv1.setText(String.valueOf(ch1 + Double.parseDouble((String) tv1.getText())));
                }
                if (operator.equals("-")) {
                    tv1.setText(String.valueOf(ch1 - Double.parseDouble((String) tv1.getText())));
                }
                if (operator.equals("*")) {
                    tv1.setText(String.valueOf(ch1 * Double.parseDouble((String) tv1.getText())));
                }
                if (operator.equals("/")) {
                    tv1.setText(String.valueOf(ch1 / Double.parseDouble((String) tv1.getText())));
                }
                if (operator.equals("C")) {
                    tv1.setText("");
                }
                if (operator.equals("+-")) {
                    tv1.setText(String.valueOf(ch1 * -1 ));
                    }

            }

        });
    }
}





