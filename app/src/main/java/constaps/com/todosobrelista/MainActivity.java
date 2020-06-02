package constaps.com.todosobrelista;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

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



}
