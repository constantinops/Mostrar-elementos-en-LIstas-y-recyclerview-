package constaps.com.todosobrelista;

public class Entidad {

    private int imgPersona;
    private String profesor;
    private String alumno;

    public Entidad(int imgPersona,String profesor,String alumno){
        this.imgPersona = imgPersona;
        this.profesor = profesor;
        this.alumno = alumno;

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


}
