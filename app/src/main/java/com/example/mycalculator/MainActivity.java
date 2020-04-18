package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,add,sub,multiply,divide,equal,bc,dot;
    TextView text;

    boolean addition=false;
    boolean subtraction=false;
    boolean multiplication=false;
    boolean division=false;

    double first,second;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.tv);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        b0 = findViewById(R.id.b0);
        bc = findViewById(R.id.bc);
        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        multiply = findViewById(R.id.multiply);
        divide = findViewById(R.id.divide);
        equal = findViewById(R.id.equal);
        dot = findViewById(R.id.dot);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.append("1");


            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                text.append("2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                text.append("3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                text.append("4");

            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                text.append("5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                text.append("6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                text.append("7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                text.append("8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                text.append("9");
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                text.append("0");
            }
        });

    //    b0.setOnLongClickListener(new View.OnLongClickListener() {
        //      @Override
        //    public boolean onLongClick(View view) {
        //      numberClick(c0);
        //    return false;
//            }
  //      });
        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text1 = "" + text.getText();
                try {
                    text.setText(text1.substring(0, text1.length() - 1));
                } catch (Exception e) {
                    // Toast.makeText(MainActivity.this, "Nothing to clear", Toast.LENGTH_SHORT).show();
                }
            }
        });


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first = Double.valueOf("" + text.getText());
                addition = true;
                text.setText("");


            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                first = Double.valueOf("" + text.getText());
                subtraction = true;
                text.setText("");
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                first = Double.valueOf("" + text.getText());
                multiplication = true;
                text.setText("");
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                first = Double.valueOf("" + text.getText());
                division = true;
                text.setText("");
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                second = Double.valueOf("" + text.getText());
                if (addition == true) {
                    text.setText("" + (first + second));
                } else if (subtraction == true) {
                    text.setText("" + (first - second));

                } else if (multiplication == true) {
                    text.setText("" + (first * second));
                } else if (division == true) {
                    text.setText("" + (first / second));
                }

                addition = false;
                subtraction = false;
                multiplication = false;
                division = false;



            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                text.append(".");
            }
        });

    }
}
