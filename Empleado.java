public abstract class Empleado {

    private String nombre;
    private String apellido;
    private int dni;
    protected double sueldo;

    Empleado(String nombre,String apellido,int dni,double sueldo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.sueldo = sueldo;
    }


    String verDatos(){
        return toString();
    }
    
    abstract double calcularSueldo();

    public String toString(){
        return "nombre: "+this.nombre+
        "\napellido: "+this.apellido+
        "\ndni "+this.dni+
        "\nsueldo: "+this.sueldo;
    }
}
