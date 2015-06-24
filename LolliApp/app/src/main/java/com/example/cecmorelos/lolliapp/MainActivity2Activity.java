package com.example.cecmorelos.lolliapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class MainActivity2Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2);


        /*Bundle parametros = getIntent().getExtras();

        String s = parametros.getString("Nombre");
        TextView tu_contenido = (TextView) findViewById(R.id.tu_contenido);
        tu_contenido.setText(s);

*/
        TextView tu_contenido = (TextView) findViewById(R.id.tu_contenido);
        TextView ff = (TextView) findViewById(R.id.fecha);
        TextView ee = (TextView) findViewById(R.id.edad);
        TextView ss = (TextView) findViewById(R.id.sexo);

        Bundle parametros = getIntent().getExtras();
        String s = parametros.getString("nombre");
        String fecha = parametros.getString("fecha");
        String edad = parametros.getString("edad");
        String sexo = parametros.getString("sexo");

        tu_contenido.setText(s);
        ff.setText(fecha);
        ee.setText(edad);
        ss.setText(sexo);




    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
