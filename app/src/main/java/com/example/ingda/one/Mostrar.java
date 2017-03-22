package com.example.ingda.one;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.res.Resources;
import android.widget.TextView;

public class Mostrar extends AppCompatActivity {

    private TextView mostrar;
    private Bundle b;
    private String aux, pnomb, snomb, papell, sapell, eda, sex;
    private Resources res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar);

        mostrar = (TextView)findViewById(R.id.txtMostrar);
        b = getIntent().getExtras();
        pnomb = b.getString("PNombre");
        snomb = b.getString("SNombre");
        papell = b.getString("PApellido");
        sapell = b.getString("SApellido");
        eda = b.getString("Edad");
        sex = b.getString("Sexo");
        res = this.getResources();

        aux = getResources().getString(R.string.saludo_p1)+" "+pnomb+" "+snomb+" "+papell+" "+sapell+" "+getResources().getString(R.string.saludo_p2)+" "+eda+" "+getResources().getString(R.string.saludo_p3)+" "+sex+", "+getResources().getString(R.string.registro_p);
        mostrar.setText(aux);

    }
}
