package constaps.com.todosobrelista;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ListaPersonalizadaActivity extends AppCompatActivity {
    ListView listViewPersonalizado;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_personalizada);
        listViewPersonalizado = findViewById(R.id.lista_personalizada);
        MyAdapter  myAdapter = new MyAdapter(this,getLista());
        listViewPersonalizado.setAdapter(myAdapter);


    }

    public ArrayList<Entidad> getLista(){

        ArrayList<Entidad> iteLista = new ArrayList<Entidad>(){{
            add(new Entidad(R.drawable.ic_network_wifi_black_24dp,"constantino","tinu"));
            add(new Entidad(R.drawable.ic_add_location_black_24dp,"Abigail","consta"));
            add(new Entidad(R.drawable.ic_launcher_background,"rene","leni"));
        }};

        return iteLista;

    }
}
