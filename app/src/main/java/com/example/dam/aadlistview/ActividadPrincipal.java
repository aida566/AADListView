package com.example.dam.aadlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.dam.aadlistview.data.Contacto;
import com.example.dam.aadlistview.view.AdaptadorContactoListView;

import java.util.ArrayList;
import java.util.List;

public class ActividadPrincipal extends AppCompatActivity {

    private List<Contacto> data;
    private ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_principal);

        init();
    }

    public void init(){

        setData();

        lv = findViewById(R.id.lvLista);

        //Creamos el adaptador
        AdaptadorContactoListView adaptador = new AdaptadorContactoListView(this, data);

        //Y lo asociacmos al listView
        lv.setAdapter(adaptador);

    }

    public void setData(){

        data = new ArrayList<>();

        for(int i = 0; i < 30; i++){

            data.add(new Contacto("nombre: " + i, "9996669" + i));

        }

    }
}
