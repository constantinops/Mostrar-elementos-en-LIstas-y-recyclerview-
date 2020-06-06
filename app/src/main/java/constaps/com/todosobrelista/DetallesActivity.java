package constaps.com.todosobrelista;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetallesActivity extends AppCompatActivity {

    private  Entidad objetoData;
    private TextView texDetalleProfe,textDetalleAlumno,texDetalleDescripcion;
    private ImageView imgDetalleAlumno;
    private ImageView imgBtnAtras;
    private  TextView textCalificacion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_detalle_item);
        objetoData = (Entidad)getIntent().getSerializableExtra("objetoData");
        texDetalleProfe = findViewById(R.id.text_detalle_profe);
        textDetalleAlumno = findViewById(R.id.text_detalle_alumno);
        texDetalleDescripcion = findViewById(R.id.text_detalle_descripcion);
        imgDetalleAlumno = findViewById(R.id.img_detalle_alumno);
        imgBtnAtras = findViewById(R.id.img_detalle);
        textCalificacion = findViewById(R.id.text_calificacion_detalles);

        imgBtnAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),ListaPersonalizadaActivity.class);
                startActivity(intent);
            }
        });

        texDetalleProfe.setText(objetoData.getProfesor());
        textDetalleAlumno.setText(objetoData.getAlumno());
        texDetalleDescripcion.setText(objetoData.getDescripcion());
        imgDetalleAlumno.setImageResource(objetoData.getImgPersona());
        textCalificacion.setText(objetoData.getCalificacion());





    }



}
