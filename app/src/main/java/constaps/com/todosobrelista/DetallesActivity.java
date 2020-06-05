package constaps.com.todosobrelista;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetallesActivity extends AppCompatActivity {

    private  Entidad objetoData;
    private TextView texDetalleProfe,textDetalleAlumno,texDetalleDescripcion;
    private ImageView imgDetalleAlumno;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_detalle_item);
        objetoData = (Entidad)getIntent().getSerializableExtra("objetoData");
        texDetalleProfe = findViewById(R.id.text_detalle_profe);
        textDetalleAlumno = findViewById(R.id.text_detalle_alumno);
        texDetalleDescripcion = findViewById(R.id.text_detalle_descripcion);
        imgDetalleAlumno = findViewById(R.id.img_detalle_alumno);

        texDetalleProfe.setText(objetoData.getProfesor());
        textDetalleAlumno.setText(objetoData.getAlumno());
        texDetalleDescripcion.setText(objetoData.getDescripcion());
        imgDetalleAlumno.setImageResource(objetoData.getImgPersona());



    }



}
