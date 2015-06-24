package com.example.cecmorelos.lolliapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;


public class MainActivity extends Activity {



    EditText nombre;
    TextView textView;
    EditText fecha;
    RadioButton mas,fem;
    Spinner edad;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClic(View view){
        String sexo="";
        nombre = (EditText) findViewById(R.id.txtNombre);
        fecha = (EditText) findViewById(R.id.editText);
        mas = (RadioButton) findViewById(R.id.rdSexo);
        fem = (RadioButton) findViewById(R.id.rdSexo2);

        if(mas.isChecked() == true){
            sexo="Masculino";
        }

        if(fem.isChecked() == true){
            sexo="Femenino";
        }



        edad = (Spinner) findViewById(R.id.spinner1);

        textView = (TextView) findViewById(R.id.textView);


        String s = nombre.getText().toString();
        String ed = edad.getSelectedItem().toString();
        String fech = fecha.getText().toString();

        //textView.setText("Hola "+s);

        /*Intent i = new Intent(this,MainActivity2Activity.class);
        i.putExtra(EXTRA_MESSAGE, s);
        startActivity(i);*/

        Intent i = new Intent(this, MainActivity2Activity.class);
        i.putExtra("nombre", s);
        i.putExtra("fecha", fech);
        i.putExtra("edad", ed);
        i.putExtra("sexo", sexo);
        startActivity(i);

    }




}
