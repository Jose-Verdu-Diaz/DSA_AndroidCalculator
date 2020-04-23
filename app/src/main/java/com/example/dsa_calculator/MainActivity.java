package com.example.dsa_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

/*------------------DEFINIR VARIABLES PARA CADA UNO DE LOS WIDGETS-----------------*/

    private Button btn_one, btn_two, btn_three, btn_four, btn_five, btn_six, btn_seven, btn_eight,
            btn_nine, btn_zero, btn_add, btn_subtract, btn_multiply, btn_divide, btn_result, btn_clear;

    private TextView txtview_resultview;

    private boolean addition, subtraction, multiplication, division;

    /*----------------------------------------------------------------------------*/

    private float  value1, value2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUIViews();

        btn_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtview_resultview.setText(txtview_resultview.getText() + "1");
            }
        });

        btn_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtview_resultview.setText(txtview_resultview.getText() + "2");
            }
        });

        btn_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtview_resultview.setText(txtview_resultview.getText() + "3");
            }
        });

        btn_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtview_resultview.setText(txtview_resultview.getText() + "4");
            }
        });

        btn_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtview_resultview.setText(txtview_resultview.getText() + "5");
            }
        });

        btn_six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtview_resultview.setText(txtview_resultview.getText() + "6");
            }
        });

        btn_seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtview_resultview.setText(txtview_resultview.getText() + "7");
            }
        });

        btn_eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtview_resultview.setText(txtview_resultview.getText()+ "8");
            }
        });

        btn_nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtview_resultview.setText(txtview_resultview.getText() + "9");
            }
        });

        btn_zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtview_resultview.setText(txtview_resultview.getText() + "0");
            }
        });

        /*Internamente, un cálculo se realiza cada vez que se pulsa una tecla de operación*/

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtview_resultview == null) {
                    txtview_resultview.setText("");
                } else {
                    value1 = Float.parseFloat(txtview_resultview.getText() + "");
                    addition = true;
                    txtview_resultview.setText(null);
                }
            }
        });

        btn_subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1 = Float.parseFloat(txtview_resultview.getText() + "");
                subtraction = true;
                txtview_resultview.setText(null);
            }
        });

        btn_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1 = Float.parseFloat(txtview_resultview.getText() + "");
                multiplication = true;
                txtview_resultview.setText(null);
            }
        });

        btn_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1 = Float.parseFloat(txtview_resultview.getText() + "");
                division = true;
                txtview_resultview.setText(null);
            }
        });

        btn_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value2 = Float.parseFloat(txtview_resultview.getText() + "");

                if (addition == true) {
                    txtview_resultview.setText(value1 + value2 + "");
                    addition = false;
                }

                if (subtraction == true) {
                    txtview_resultview.setText(value1 - value2 + "");
                    subtraction = false;
                }

                if (multiplication == true) {
                    txtview_resultview.setText(value1 * value2 + "");
                    multiplication = false;
                }

                if (division == true) {
                    txtview_resultview.setText(value1 / value2 + "");
                    division = false;
                }
            }
        });

        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtview_resultview.setText("");
            }
        });
    }

    private void setupUIViews(){
        btn_one=(Button)findViewById(R.id.btn_one);
        btn_two=(Button)findViewById(R.id.btn_two);
        btn_three=(Button)findViewById(R.id.btn_three);
        btn_four=(Button)findViewById(R.id.btn_four);
        btn_five=(Button)findViewById(R.id.btn_five);
        btn_six=(Button)findViewById(R.id.btn_six);
        btn_seven=(Button)findViewById(R.id.btn_seven);
        btn_eight=(Button)findViewById(R.id.btn_eight);
        btn_nine=(Button)findViewById(R.id.btn_nine);
        btn_zero=(Button)findViewById(R.id.btn_zero);
        btn_add=(Button)findViewById(R.id.btn_add);
        btn_subtract=(Button)findViewById(R.id.btn_subtract);
        btn_multiply=(Button)findViewById(R.id.btn_multiply);
        btn_divide=(Button)findViewById(R.id.btn_divide);
        btn_result=(Button)findViewById(R.id.btn_result);
        btn_clear=(Button)findViewById(R.id.btn_clear);

        txtview_resultview=(TextView)findViewById(R.id.txtview_resultview);
    }
}
