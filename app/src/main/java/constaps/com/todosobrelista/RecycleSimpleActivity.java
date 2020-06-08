package constaps.com.todosobrelista;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class RecycleSimpleActivity extends AppCompatActivity {

    private RecyclerView listaAlumno;
    private RecyclerView.Adapter myAdaptador;
    private RecyclerView.LayoutManager layoutVista;
    private ArrayList<Entidad> alumno;
    private ImageButton btnImgAtras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_simple);
        listaAlumno =  findViewById(R.id.recycle_alumno);
        btnImgAtras = findViewById(R.id.img_boton_atras);
        btnImgAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecycleSimpleActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });


        alumno = getAlumno();

        layoutVista = new LinearLayoutManager(this);
        myAdaptador = new MyAdapterR(R.layout.item_recycleview,alumno);
        listaAlumno.setAdapter(myAdaptador);
        listaAlumno.setLayoutManager(layoutVista);
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
