package constaps.com.todosobrelista;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListaPersonalizadaActivity extends AppCompatActivity {
    private ListView listViewPersonalizado;
    private ArrayList<Entidad>itemArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_personalizada);
        listViewPersonalizado = findViewById(R.id.lista_personalizada);
        itemArray = getLista();
        MyAdapter  myAdapter = new MyAdapter(this,itemArray);
        listViewPersonalizado.setAdapter(myAdapter);
        listViewPersonalizado.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(),DetallesActivity.class);
                intent.putExtra("objetoData",itemArray.get(position));
                startActivity(intent);
            }
        });


    }

    public ArrayList<Entidad> getLista(){

        ArrayList<Entidad> iteLista = new ArrayList<Entidad>(){{
            add(new Entidad(R.drawable.ic_network_wifi_black_24dp,"constantino","tinu","es un alumno malo"));
            add(new Entidad(R.drawable.ic_add_location_black_24dp,"Abigail","consta","es un alumno bueno"));
            add(new Entidad(R.drawable.ic_launcher_background,"rene","leni","es un alumno regular"));
            add(new Entidad(R.drawable.ic_network_wifi_black_24dp,"constantino","tinu","es un alumno malo"));
            add(new Entidad(R.drawable.ic_add_location_black_24dp,"Abigail","consta","es un alumno bueno"));
            add(new Entidad(R.drawable.ic_launcher_background,"rene","leni","es un alumno regular"));
            add(new Entidad(R.drawable.ic_network_wifi_black_24dp,"constantino","tinu","es un alumno malo"));
            add(new Entidad(R.drawable.ic_add_location_black_24dp,"Abigail","consta","es un alumno bueno"));
            add(new Entidad(R.drawable.ic_launcher_background,"rene","leni","es un alumno regular"));
            add(new Entidad(R.drawable.ic_network_wifi_black_24dp,"constantino","tinu","es un alumno malo"));
            add(new Entidad(R.drawable.ic_add_location_black_24dp,"Abigail","consta","es un alumno bueno"));
            add(new Entidad(R.drawable.ic_launcher_background,"rene","leni","es un alumno regular"));
            add(new Entidad(R.drawable.ic_network_wifi_black_24dp,"constantino","tinu","es un alumno malo"));
            add(new Entidad(R.drawable.ic_add_location_black_24dp,"Abigail","consta","es un alumno bueno"));
            add(new Entidad(R.drawable.ic_launcher_background,"rene","leni","es un alumno regular"));
            add(new Entidad(R.drawable.ic_network_wifi_black_24dp,"constantino","tinu","es un alumno malo"));
            add(new Entidad(R.drawable.ic_add_location_black_24dp,"Abigail","consta","es un alumno bueno"));
            add(new Entidad(R.drawable.ic_launcher_background,"rene","leni","es un alumno regular"));
            add(new Entidad(R.drawable.ic_network_wifi_black_24dp,"constantino","tinu","es un alumno malo"));
            add(new Entidad(R.drawable.ic_add_location_black_24dp,"Abigail","consta","es un alumno bueno"));
            add(new Entidad(R.drawable.ic_launcher_background,"rene","leni","es un alumno regular"));
            add(new Entidad(R.drawable.ic_network_wifi_black_24dp,"constantino","tinu","es un alumno malo"));
            add(new Entidad(R.drawable.ic_add_location_black_24dp,"Abigail","consta","es un alumno bueno"));
            add(new Entidad(R.drawable.ic_launcher_background,"rene","leni","es un alumno regular"));

        }};

        return iteLista;

    }
}
