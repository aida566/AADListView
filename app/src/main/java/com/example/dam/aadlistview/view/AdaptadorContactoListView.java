package com.example.dam.aadlistview.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.dam.aadlistview.R;
import com.example.dam.aadlistview.data.Contacto;

import java.util.List;

public class AdaptadorContactoListView extends ArrayAdapter<Contacto> {

    private List<Contacto> data;
    private Context contexto;
    private int layout;


    public AdaptadorContactoListView(@NonNull Context context, List<Contacto> data) {

        this(context, R.layout.item, data);

    }

    public AdaptadorContactoListView(@NonNull Context context, int layout, List<Contacto> data) {

        super(context, layout, data);

        this.data = data;


    }

    /*
     */

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Log.v("MITAG", position + "");

        Contacto c = data.get(position);

        //Inflador: objeto que sabe inflar
        LayoutInflater i = (LayoutInflater) contexto.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        //Con el inflador, inflamos el layout
        View v = i.inflate(layout, null);

        //Creamos un textView que asociamos con los componentes de nombre y telefono y le ponemos
        //los valores correspodientes del contacto en dicha posicion

        TextView tv = v.findViewById(R.id.tvNombre);
        tv.setText(c.getNombre());

        TextView tv2 = v.findViewById(R.id.tvTelefono);
        tv.setText(c.getTelefono());

        //Devolvemos la vista del elemento situado en la posicion que nos ha llegado
        return v;

    }



}
