package constaps.com.todosobrelista;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listaNombre;
    private MyAdapter myAdapter;
    Button btnListaSimpl,btnListaPersona;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnListaSimpl = findViewById(R.id.btn_lista_simple);
        btnListaPersona = findViewById(R.id.btn_lista_persona);

        btnListaSimpl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,ListaSimpleActivity.class);
                startActivity(intent);

            }
        });





    }
/*
    private  ArrayList<Entidad> getArray (){
        ArrayList<Entidad> listaItem = new ArrayList<>();
        listaItem.add(new Entidad(R.drawable.ic_add_location_black_24dp,"Constantino","omar"));
        listaItem.add(new Entidad(R.drawable.ic_movie_black_24dp,"Abigail","tinu"));
        return listaItem;
    }
*/


    /*

    public void listaPersona(){
        final List<String> listaPersona = new ArrayList<String>(){{
            add("tinu");
            add("andrrea");
            add("calu");
            add("remi");
            add("omar");
            add("tinu");
            add("andrrea");
            add("calu");
            add("remi");
            add("omar");
        }};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,listaPersona);
        listaNombre.setAdapter(adapter);

        listaNombre.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"Alumno: "+listaPersona.get(position),Toast.LENGTH_SHORT).show();
            }
        });

    }

     */



}
