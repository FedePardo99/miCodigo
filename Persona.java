
public class Persona {
    
    private String nombre;
    private String apellido;
    private int edad;
    private Fecha fechaDeNacimiento;

    Persona() {
        nombre = "";
        apellido = "";
        edad = 0;
        fechaDeNacimiento = new Fecha();
    }
    Persona(String nombre,String apellido,int edad,Fecha fechaDeNacimiento){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    String getNombre(){
        return this.nombre;
    }
    String getApellido(){
        return this.apellido;
    }
    
    int getEdad() {
        return this.edad;
    }
   
    Fecha getFechaDeNacimiento(){
        return this.fechaDeNacimiento;
    }
}
