package com.example.dsa_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

/*------------------DEFINIR VARIABLES PARA CADA UNO DE LOS WIDGETS-----------------*/

    private Button btn_one;
    private Button btn_two;
    private Button btn_three;
    private Button btn_four;
    private Button btn_five;
    private Button btn_six;
    private Button btn_seven;
    private Button btn_eight;
    private Button btn_nine;
    private Button btn_zero;
    private Button btn_add;
    private Button btn_subtract;
    private Button btn_multiply;
    private Button btn_divide;
    private Button btn_result;
    private Button btn_clear;

    private TextView txtview_resultview;

    /*----------------------------------------------------------------------------*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUIViews();

        btn_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtview_resultview.setText(txtview_resultview.getText().toString() + "1");
            }
        });

        btn_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtview_resultview.setText(txtview_resultview.getText().toString() + "2");
            }
        });

        btn_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtview_resultview.setText(txtview_resultview.getText().toString() + "3");
            }
        });

        btn_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtview_resultview.setText(txtview_resultview.getText().toString() + "4");
            }
        });

        btn_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtview_resultview.setText(txtview_resultview.getText().toString() + "5");
            }
        });

        btn_six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtview_resultview.setText(txtview_resultview.getText().toString() + "6");
            }
        });

        btn_seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtview_resultview.setText(txtview_resultview.getText().toString() + "7");
            }
        });

        btn_eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtview_resultview.setText(txtview_resultview.getText().toString() + "8");
            }
        });

        btn_nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtview_resultview.setText(txtview_resultview.getText().toString() + "9");
            }
        });

        btn_zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtview_resultview.setText(txtview_resultview.getText().toString() + "0");
            }
        });

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtview_resultview.setText(txtview_resultview.getText().toString() + "+");
            }
        });

        btn_subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtview_resultview.setText(txtview_resultview.getText().toString() + "-");
            }
        });

        btn_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtview_resultview.setText(txtview_resultview.getText().toString() + "*");
            }
        });

        btn_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtview_resultview.setText(txtview_resultview.getText().toString() + "/");
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
