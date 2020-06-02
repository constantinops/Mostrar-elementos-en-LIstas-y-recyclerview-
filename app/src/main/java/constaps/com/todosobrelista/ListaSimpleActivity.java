package constaps.com.todosobrelista;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ListaSimpleActivity extends AppCompatActivity {
    ListView listPersonas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_simple);
        listPersonas= findViewById(R.id.lista_simple);
        listaPerdona();


    }
    public void listaPerdona(){

        final List<String> listPersona =  new ArrayList<String>(){{
            add("tinu");
            add("aby");
            add("anita");
            add("ana");
            add("ani");
            add("lau");
            add("remi");
            add("rene");
            add("tinu");
            add("aby");
            add("anita");
            add("ana");
            add("ani");
            add("lau");
            add("remi");
            add("rene");
            add("tinu");
            add("aby");
            add("anita");
            add("ana");
            add("ani");
            add("lau");
            add("remi");
            add("rene");
            add("tinu");
            add("aby");
            add("anita");
            add("ana");
            add("ani");
            add("lau");
            add("remi");
            add("rene");
            add("tinu");
            add("aby");
            add("anita");
            add("ana");
            add("ani");
            add("lau");
            add("remi");
            add("rene");

        }};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,listPersona);
        listPersonas.setAdapter(adapter);
        listPersonas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"Alumn@: "+listPersona.get(position),Toast.LENGTH_SHORT).show();
            }
        });

    }






}
