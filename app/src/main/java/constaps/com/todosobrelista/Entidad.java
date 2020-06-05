package constaps.com.todosobrelista;

import java.io.Serializable;

public class Entidad implements Serializable {

    private int imgPersona;
    private String profesor;
    private String alumno;
    private String descripcion;

    public Entidad(int imgPersona,String profesor,String alumno,String descripcion){
        this.imgPersona = imgPersona;
        this.profesor = profesor;
        this.alumno = alumno;
        this.descripcion = descripcion;

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



}
