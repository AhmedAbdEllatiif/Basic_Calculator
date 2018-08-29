package com.example.ahmedd.gridlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {


    private Button btnZero;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btnAdd;
    private Button btnSub;
    private Button btnDiv;
    private Button btnMulti;
    private Button btnDot;
    private Button btnClr;
    private Button btnEqual;
    private TextView txtResult;
    private TextView txtClac;
    private Button btnFilp;
    private Button btnModules;

    //operation
    private final char Addtion = '+';
    private final char Subtruction = '-';
    private final char Multiplication = '*';
    private final char Divison = '/';
    private final char mod = '%';
    private final char Equ = 0;
    private  char charOpe;
    private  double num1 = Double.NaN;
    private  double num2;



    //method to setup buttons textArea..
    public void setupViews() {
        btnZero = (Button) findViewById(R.id.btnZero);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btnDot = (Button) findViewById(R.id.btnDot);
        btnMulti = (Button) findViewById(R.id.btnMulti);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        btnSub = (Button) findViewById(R.id.btnSub);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnEqual = (Button) findViewById(R.id.btnEqual);
        btnClr = (Button) findViewById(R.id.btnClr);
        btnFilp = (Button) findViewById(R.id.btnFilp);
        btnModules = (Button) findViewById(R.id.btnModules);

        txtResult = (TextView) findViewById(R.id.txtResult);
        txtClac = (TextView) findViewById(R.id.txtCalc);

    }


    //method to calculate the numbers
    public void compute() {
        if (!Double.isNaN(num1)) {
            num2 = Double.parseDouble(txtClac.getText().toString());

            switch (charOpe) {
                case Addtion : num1 = num1 + num2; break;
                case Subtruction : num1 = num1 - num2; break;
                case Multiplication :  num1 = num1 * num2; break;
                case Divison :  num1 = num1 / num2; break;
                case mod : num1 = num1 % num2; break;
                case Equ : break;

            }
        } else {
            num1 = Double.parseDouble(txtClac.getText().toString());
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupViews();

        //set button on click..

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                txtClac.setText(txtClac.getText().toString() + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                txtClac.setText(txtClac.getText().toString() + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                txtClac.setText(txtClac.getText().toString() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                txtClac.setText(txtClac.getText().toString() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                txtClac.setText(txtClac.getText().toString() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                txtClac.setText(txtClac.getText().toString() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                txtClac.setText(txtClac.getText().toString() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                txtClac.setText(txtClac.getText().toString() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                txtClac.setText(txtClac.getText().toString() + "9");
            }
        });
        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                txtClac.setText(txtClac.getText().toString() + "0");
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                txtClac.setText(txtClac.getText().toString() + ".");
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtClac.getText().toString().equals("")){
                    txtClac.setText(null);
                }
                else {
                    compute();
                    charOpe = Addtion;
                    txtResult.setText(txtClac.getText().toString() + "+");
                    txtClac.setText(null);
                }
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtClac.getText().toString().equals("")){
                    txtClac.setText(null);
                }
                else {

                    compute();
                    charOpe = Subtruction;
                    txtResult.setText(txtClac.getText() + "-");
                    txtClac.setText(null);
                }
            }
        });
        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtClac.getText().toString().equals("")){
                    txtClac.setText(null);
                }
                else{
                    compute();
                    charOpe = Multiplication;
                    txtResult.setText(txtClac.getText().toString() + "*");
                    txtClac.setText(null);
                }
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtClac.getText().toString().equals("")){
                    txtClac.setText(null);
                }else {
                    compute();
                    charOpe = Divison;
                    txtResult.setText(txtClac.getText().toString() + "/");
                    txtClac.setText(null);
                }
            }
        });

        btnClr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Double.NaN;
                num2 = Double.NaN;
                txtClac.setText(null);
                txtResult.setText(null);
            }
        });

        btnFilp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(txtClac.getText().toString().equals("")){
                    txtClac.setText(null);
                }
                else if(txtClac.getText().toString().equals(".")){
                    txtClac.setText(null);
                }
                else if (txtClac.getText().toString().equals("0")){
                    txtClac.setText("0");
                }
                else txtClac.setText(String.valueOf(-Double.parseDouble(txtClac.getText().toString())));
            }
        });

        btnModules.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtClac.getText().toString().equals("")){
                    txtClac.setText(null);
                }
                else{
                    compute();
                    charOpe = mod;
                    txtResult.setText(txtClac.getText().toString() + "%");
                    txtClac.setText(null);
                }
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtClac.getText().toString().equals("")){
                    txtClac.setText(null);
                }else if( (!txtClac.getText().toString().equals(null)) && txtResult.getText().toString().equals(null)  ){
                    compute();
                    charOpe = Addtion;
                    txtResult.setText(    String.valueOf( Double.parseDouble(txtClac.getText().toString())  + num1) );
                }
                else  {
                    compute();
                    charOpe = Equ;
                    txtResult.setText(txtResult.getText().toString() + String.valueOf(num2) + "=" + String.valueOf(num1));
                    txtClac.setText(String.valueOf(num1));
                }
            }
        });


    }

}
