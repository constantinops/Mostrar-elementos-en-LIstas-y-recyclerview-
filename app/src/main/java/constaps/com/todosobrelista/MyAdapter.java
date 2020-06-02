package constaps.com.todosobrelista;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends BaseAdapter{

    private Context context;
    private ArrayList<Entidad> listaPersona;

    public MyAdapter(Context context,ArrayList<Entidad> listaPersona){
        this.context = context;
        this.listaPersona = listaPersona;
    }



    @Override
    public int getCount() {
        return this.listaPersona.size();
    }

    @Override
    public Object getItem(int position) {
        return this.listaPersona.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        Entidad iteLista = (Entidad)getItem(position);

        View v = convertView;
        LayoutInflater layoutInflater = LayoutInflater.from(this.context);
        v = layoutInflater.inflate(R.layout.layaut_lista_personalizada,null);
        //de esta manera igual se puede inflar la vista pero el primero es mas legible
      //  convertView = LayoutInflater.from(this.context).inflate(R.layout.layaut_lista_personalizada,null);
        ImageView img = v.findViewById(R.id.img_alumno);
        TextView profe = v.findViewById(R.id.text_profe);
        TextView alumno = v.findViewById(R.id.text_alumno);
        img.setImageResource(iteLista.getImgPersona());
        profe.setText(iteLista.getProfesor());
        alumno.setText(iteLista.getAlumno());

        return v;
    }
}
