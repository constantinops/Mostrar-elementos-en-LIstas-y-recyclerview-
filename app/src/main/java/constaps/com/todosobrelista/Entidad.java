package constaps.com.todosobrelista;

import android.widget.ScrollView;

import java.io.Serializable;

public class Entidad implements Serializable {

    private int imgPersona;
    private String profesor;
    private String alumno;
    private String descripcion;
    private String calificacion;

    public Entidad(int imgPersona, String profesor, String alumno, String descripcion, String calificacion){
        this.imgPersona = imgPersona;
        this.profesor = profesor;
        this.alumno = alumno;
        this.descripcion = descripcion;
        this.calificacion = calificacion;

    }

    public Entidad(){

    }

    public int getImgPersona(){
        return imgPersona;
    }
    public String getProfesor(){
        return profesor;
    }
    public String getAlumno(){
        return alumno;
    }
    public String getDescripcion(){return descripcion;}
    public  String getCalificacion(){return  calificacion;}



}
