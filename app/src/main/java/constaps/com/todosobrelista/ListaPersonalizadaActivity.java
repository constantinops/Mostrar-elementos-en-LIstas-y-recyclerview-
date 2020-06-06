package constaps.com.todosobrelista;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListaPersonalizadaActivity extends AppCompatActivity {
    private ListView listViewPersonalizado;
    private ArrayList<Entidad>itemArray;
    private ImageButton btnImgAtras;

    private EditText textBuscar;
    private  ImageView imgBuscar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_personalizada);
        listViewPersonalizado = findViewById(R.id.lista_personalizada);
        btnImgAtras =  findViewById(R.id.btn_imh_atras);
        textBuscar = findViewById(R.id.edit_buscar);
        imgBuscar = findViewById(R.id.img_buscar);
        textBuscar.setSelected(false);

        textBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        imgBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textBuscar.setText("");
            }
        });


        btnImgAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });

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
            add(new Entidad(R.drawable.ic_account_circle_black_24dp,"constantino","tinu","es un alumno malo","5"));
            add(new Entidad(R.drawable.ic_account_circle_black_24dp,"Abigail","consta","es un alumno bueno","9"));
            add(new Entidad(R.drawable.ic_account_circle_black_24dp,"rene","leni","es un alumno regular","8"));
            add(new Entidad(R.drawable.ic_account_circle_black_24dp,"constantino","tinu","es un alumno malo","5"));
            add(new Entidad(R.drawable.ic_account_circle_black_24dp,"Abigail","consta","es un alumno bueno","9"));
            add(new Entidad(R.drawable.ic_account_circle_black_24dp,"rene","leni","es un alumno regular","8"));
            add(new Entidad(R.drawable.ic_account_circle_black_24dp,"constantino","tinu","es un alumno malo","5"));
            add(new Entidad(R.drawable.ic_account_circle_black_24dp,"Abigail","consta","es un alumno bueno","9"));
            add(new Entidad(R.drawable.ic_account_circle_black_24dp,"rene","leni","es un alumno regular","8"));
            add(new Entidad(R.drawable.ic_account_circle_black_24dp,"constantino","tinu","es un alumno malo","5"));
            add(new Entidad(R.drawable.ic_account_circle_black_24dp,"Abigail","consta","es un alumno bueno","9"));
            add(new Entidad(R.drawable.ic_account_circle_black_24dp,"rene","leni","es un alumno regular","8"));
            add(new Entidad(R.drawable.ic_account_circle_black_24dp,"constantino","tinu","es un alumno malo","5"));
            add(new Entidad(R.drawable.ic_account_circle_black_24dp,"Abigail","consta","es un alumno bueno","9"));
            add(new Entidad(R.drawable.ic_account_circle_black_24dp,"rene","leni","es un alumno regular","8"));
            add(new Entidad(R.drawable.ic_account_circle_black_24dp,"constantino","tinu","es un alumno malo","5"));
            add(new Entidad(R.drawable.ic_account_circle_black_24dp,"Abigail","consta","es un alumno bueno","9"));
            add(new Entidad(R.drawable.ic_account_circle_black_24dp,"rene","leni","es un alumno regular","8"));
            add(new Entidad(R.drawable.ic_account_circle_black_24dp,"constantino","tinu","es un alumno malo","6"));
            add(new Entidad(R.drawable.ic_account_circle_black_24dp,"Abigail","consta","es un alumno bueno","9"));
            add(new Entidad(R.drawable.ic_account_circle_black_24dp,"rene","leni","es un alumno regular","8"));
            add(new Entidad(R.drawable.ic_account_circle_black_24dp,"constantino","tinu","es un alumno malo","5"));
            add(new Entidad(R.drawable.ic_account_circle_black_24dp,"Abigail","consta","es un alumno bueno","9"));
            add(new Entidad(R.drawable.ic_account_circle_black_24dp,"rene","leni","es un alumno regular","8"));

        }};

        return iteLista;

    }
}
