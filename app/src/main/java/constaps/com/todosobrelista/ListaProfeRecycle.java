package constaps.com.todosobrelista;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListaProfeRecycle extends AppCompatActivity {

    private RecyclerView recycleListaAlumno;
    private RecyclerView.Adapter myAdapter;
    private RecyclerView.LayoutManager vistaLista;
    private ArrayList<Entidad> aregloContenedor;
    private ImageView imgAtras;

    private EditText textBuscar;
    private  ImageView imgBuscar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_profe_recycle);
        recycleListaAlumno = findViewById(R.id.lista_profe_recycle);
        imgAtras = findViewById(R.id.btn_recycle_atras);
        textBuscar = findViewById(R.id.edit_buscar);
        textBuscar.setSelected(false);

        textBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });


        imgAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });



        aregloContenedor = getAlumno();
        vistaLista = new LinearLayoutManager(this);
        myAdapter = new MyAdapterRecycle(R.layout.layaut_lista_personalizada, aregloContenedor, new MyAdapterRecycle.OnItemClick() {
            @Override
            public void onItemClic(String nombreAlumno, int position) {
                Toast.makeText(getApplicationContext(),"alumno"+nombreAlumno,Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(),DetalleRecycleActivity.class);
                intent.putExtra("detalleprofe",aregloContenedor.get(position));
                startActivity(intent);
            }
        });
        recycleListaAlumno.setAdapter(myAdapter);
        recycleListaAlumno.setLayoutManager(vistaLista);


    }

    public ArrayList<Entidad> getAlumno(){
        return new ArrayList<Entidad>(){{

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
    }
}
