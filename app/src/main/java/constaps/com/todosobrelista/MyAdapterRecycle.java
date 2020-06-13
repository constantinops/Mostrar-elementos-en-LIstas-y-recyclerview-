package constaps.com.todosobrelista;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapterRecycle extends RecyclerView.Adapter<MyAdapterRecycle.viewHolder>{

    private int layout;
    private ArrayList<Entidad> alumno;
    private OnItemClick itemClick;

    public MyAdapterRecycle(int layout,ArrayList<Entidad> alumno,OnItemClick listener){
        this.layout = layout;
        this.alumno = alumno;
        this.itemClick = listener;
    }


    @NonNull
    @Override
    public MyAdapterRecycle.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(layout,parent,false);
        viewHolder viewHolder = new viewHolder(v);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapterRecycle.viewHolder holder, int position) {
                holder.asignarElementos(alumno.get(position),itemClick);
    }

    @Override
    public int getItemCount() {
        return this.alumno.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        private TextView textAlumno,textProfe;
        private ImageView imgAlumno;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            textAlumno  = itemView.findViewById(R.id.text_alumno);
            textProfe =  itemView.findViewById(R.id.text_profe);
            imgAlumno = itemView.findViewById(R.id.img_alumno);
        }

        public void asignarElementos(final Entidad alumno, final OnItemClick lister){
            textAlumno.setText(alumno.getAlumno());
            textProfe.setText(alumno.getProfesor());
            imgAlumno.setImageResource(alumno.getImgPersona());
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    lister.onItemClic(alumno.getAlumno(),getAdapterPosition());
                }
            });
        }
    }

    public interface OnItemClick{
        void onItemClic(String nombreAlumno,int position);

    }
}
