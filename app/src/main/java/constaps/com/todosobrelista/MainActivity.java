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

        btnListaPersona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ListaPersonalizadaActivity.class);
                startActivity(intent);
            }
        });

    }

}
