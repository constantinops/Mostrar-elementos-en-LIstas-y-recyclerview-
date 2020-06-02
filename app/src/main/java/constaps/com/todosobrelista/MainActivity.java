package constaps.com.todosobrelista;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listaNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listaNombre = findViewById(R.id.lidta_persona);
        listaPersona();

    }

    public void listaPersona(){
        List<String> listaPersona = new ArrayList<String>(){{
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

    }



}
