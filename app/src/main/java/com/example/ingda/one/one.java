package com.example.ingda.one;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.widget.EditText;

public class one extends AppCompatActivity {

    private EditText cajaPNombre;
    private EditText cajaSNombre;
    private EditText cajaPApellido;
    private EditText cajaSApellido;
    private EditText cajaEdad;
    private EditText cajaSexo;
    private Intent i;
    private Bundle b;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        cajaPNombre = (EditText)findViewById(R.id.txtPNombre);
        cajaSNombre = (EditText)findViewById(R.id.txtSNombre);
        cajaPApellido = (EditText)findViewById(R.id.txtPApellido);
        cajaSApellido = (EditText)findViewById(R.id.txtSApellido);
        cajaEdad = (EditText)findViewById(R.id.txtEdad);
        cajaSexo = (EditText)findViewById(R.id.txtSexo);

        i = new Intent(this,Mostrar.class);

        b = new Bundle();
    }


    public void mostrar(View v){
        String pnomb, snomb, papell, sapell, eda, sex;
        if(validar()){

            pnomb = cajaPNombre.getText().toString();
            snomb = cajaSNombre.getText().toString();
            papell = cajaPApellido.getText().toString();
            sapell = cajaSApellido.getText().toString();
            eda = cajaEdad.getText().toString();
            sex = cajaSexo.getText().toString();

            b.putString("PNombre", pnomb);
            b.putString("SNombre", snomb);
            b.putString("PApellido", papell);
            b.putString("SApellido", sapell);
            b.putString("Edad", eda);
            b.putString("Sexo", sex);

            i.putExtras(b);

            startActivity(i);

        }

    }

    public  boolean validar(){

        if(cajaPNombre.getText().toString().isEmpty()){
            cajaPNombre.setError("Por favor digite su primer nombre");
            return false;
        }
        if(cajaSNombre.getText().toString().isEmpty()){
            cajaSNombre.setError("Por favor digite su segundo nombre");
            return false;
        }
        if(cajaPApellido.getText().toString().isEmpty()){
            cajaPApellido.setError("Por favor digite su primer apellido");
            return false;
        }
        if(cajaSApellido.getText().toString().isEmpty()){
            cajaSApellido.setError("Por favor digite su segundo apellido");
            return false;
        }
        if(cajaEdad.getText().toString().isEmpty()){
            cajaEdad.setError("Por favor digite su edad");
            return false;
        }
        if(cajaSexo.getText().toString().isEmpty()){
            cajaSexo.setError("Digite su sexo");
            return false;
        }
        return true;
    }





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_one, menu);
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
