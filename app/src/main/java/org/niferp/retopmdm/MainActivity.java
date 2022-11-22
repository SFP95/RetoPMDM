package org.niferp.retopmdm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
    private Button punto;
    private Button igual;
    private Button resta;
    private Button suma;
    private Button divi;
    private Button multi;
    private Button limpiar;
    private TextView mostrar, concatenar;
    private String operador;
    double n1,n2,res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AsoBotones();
        accionesClickListener();

    }

    private void accionesClickListener() {
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                concatenar=findViewById(R.id.mostrar);
                mostrar.setText(concatenar.getText().toString()+0);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                concatenar=findViewById(R.id.mostrar);
                mostrar.setText(concatenar.getText().toString()+1);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                concatenar=findViewById(R.id.mostrar);
                mostrar.setText(concatenar.getText().toString()+2);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                concatenar=findViewById(R.id.mostrar);
                mostrar.setText(concatenar.getText().toString()+3);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                concatenar=findViewById(R.id.mostrar);
                mostrar.setText(concatenar.getText().toString()+4);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                concatenar=findViewById(R.id.mostrar);
                mostrar.setText(concatenar.getText().toString()+5);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                concatenar=findViewById(R.id.mostrar);
                mostrar.setText(concatenar.getText().toString()+6);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                concatenar=findViewById(R.id.mostrar);
                mostrar.setText(concatenar.getText().toString()+7);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                concatenar=findViewById(R.id.mostrar);
                mostrar.setText(concatenar.getText().toString()+8);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                concatenar=findViewById(R.id.mostrar);
                mostrar.setText(concatenar.getText().toString()+9);
            }
        });
        punto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                concatenar=findViewById(R.id.mostrar);
                mostrar.setText(concatenar.getText().toString()+'.');
            }
        });
        igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                concatenar=findViewById(R.id.mostrar);
                n2=Double.parseDouble(concatenar.getText().toString());
                if(mostrar.equals("+")){
                    concatenar.setText("");
                    res= n1+n2;
                }else if(mostrar.equals("-")){
                    concatenar.setText("");
                    res=n1-n2;
                }else if(mostrar.equals("*")){
                    concatenar.setText("");
                    res=n1*n2;
                }else if(mostrar.equals("/")){
                    concatenar.setText("");
                    if (n2 != 0){
                        res=n1/n2;
                    }else{
                        concatenar.setText("Infinito");
                    }
                }
                concatenar.setText(String.valueOf(res));
            }
        });
        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operador="+";
                concatenar=findViewById(R.id.mostrar);
                n1=Double.parseDouble(concatenar.getText().toString()+"+");
                mostrar.setText("");
            }
        });
        resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operador="-";
                concatenar=findViewById(R.id.mostrar);
                n1=Double.parseDouble(concatenar.getText().toString()+"-");
                mostrar.setText("");
            }
        });
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operador="*";
                concatenar=findViewById(R.id.mostrar);
                n1=Double.parseDouble(concatenar.getText().toString()+"*");
                mostrar.setText("");
            }
        });
        divi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operador="/";
                concatenar=findViewById(R.id.mostrar);
                n1=Double.parseDouble(concatenar.getText().toString()+"/");
                mostrar.setText("");
            }
        });
        limpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1 = 0;
                n2 = 0;
                mostrar.setText("");
            }
        });
    }

    private void AsoBotones() {
        this.mostrar=findViewById(R.id.mostrar);
        this.punto=findViewById(R.id.punto);
        this.suma=findViewById(R.id.suma);
        this.resta=findViewById(R.id.resta);
        this.igual=findViewById(R.id.bIgual);
        this.multi=findViewById(R.id.multi);
        this.divi=findViewById(R.id.divi);
        this.limpiar=findViewById(R.id.limpiar);
        this.b0=findViewById(R.id.b0);
        this.b1=findViewById(R.id.b1);
        this.b2=findViewById(R.id.b2);
        this.b3=findViewById(R.id.b3);
        this.b4=findViewById(R.id.b4);
        this.b5=findViewById(R.id.b5);
        this.b6=findViewById(R.id.b6);
        this.b7=findViewById(R.id.b7);
        this.b8=findViewById(R.id.b8);
        this.b9=findViewById(R.id.b9);
    }

}