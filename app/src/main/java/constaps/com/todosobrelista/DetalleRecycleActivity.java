package constaps.com.todosobrelista;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class DetalleRecycleActivity extends AppCompatActivity {
    private ImageView imgDetalleAtras;
    private TextView textDetalleAlumno,textDetalleProfe,textCalificacion,textDetalleDescripcion;
    private Entidad objetoAlumno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_recycle);
        imgDetalleAtras = findViewById(R.id.img_detalle_recycle);
        imgDetalleAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });


        textDetalleAlumno = findViewById(R.id.text_detalle_alumno);
        textDetalleProfe = findViewById(R.id.text_detalle_profe);
        textCalificacion = findViewById(R.id.text_calificacion_detalles);
        textDetalleDescripcion = findViewById(R.id.text_detalle_descripcion);

        objetoAlumno = (Entidad) getIntent().getSerializableExtra("detalleprofe");

        textDetalleDescripcion.setText(objetoAlumno.getDescripcion());
        textCalificacion.setText(objetoAlumno.getCalificacion());
        textDetalleProfe.setText(objetoAlumno.getProfesor());
        textDetalleAlumno.setText(objetoAlumno.getAlumno());


    }
}
