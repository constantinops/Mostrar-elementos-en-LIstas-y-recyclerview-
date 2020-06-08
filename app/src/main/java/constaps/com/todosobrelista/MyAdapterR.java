package constaps.com.todosobrelista;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MyAdapterR extends RecyclerView.Adapter<MyAdapterR.viewHolder>{

    private int layout;
    private ArrayList<Entidad> listaAlumno;

    public MyAdapterR(int layout,ArrayList<Entidad> listaAlumno){
        this.layout = layout;
        this.listaAlumno = listaAlumno;

    }



    @NonNull
    @Override
    public MyAdapterR.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(layout,parent,false);
        viewHolder viewHolder = new viewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapterR.viewHolder holder, int position) {
            holder.asignarElemento(listaAlumno.get(position));
    }

    @Override
    public int getItemCount() {
        return this.listaAlumno.size();
    }

    public static class viewHolder extends RecyclerView.ViewHolder {
        TextView textAlumno;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            textAlumno = itemView.findViewById(R.id.textv_recicle_alumno);
        }

        public void asignarElemento(Entidad alumno){
            textAlumno.setText(alumno.getAlumno());

        }
    }





    /*

    private ArrayList<Entidad> nombreAlumno;
    private int layout;
    private OnItemClickListenerRecicle listener;

    public MyAdapterR(int layout,ArrayList<Entidad> nombreAlumno,OnItemClickListenerRecicle listener){
        this.layout = layout;
        this.nombreAlumno = nombreAlumno;
        this.listener = listener;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(layout,parent,false);
        viewHolder viewHolder = new viewHolder(v);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

          // Entidad alumno = nombreAlumno.get(position);
          // holder.textNombre.setText(alumno.getAlumno());
            holder.bind(nombreAlumno.get(position), listener );
    }

    @Override
    public int getItemCount() {
        return this.nombreAlumno.size();
    }

    public static class  viewHolder extends RecyclerView.ViewHolder {

        TextView textNombre;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            this.textNombre = itemView.findViewById(R.id.textv_recicle_alumno);


        }

        public void bind( final Entidad nombre, final OnItemClickListenerRecicle listener){

            this.textNombre.setText(nombre.getAlumno());
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onItemClicK(nombre.getAlumno(),getAdapterPosition());
                }
            });



        }

    }
    public interface OnItemClickListenerRecicle{
        void onItemClicK(String name,int position );

    }


     */


}
