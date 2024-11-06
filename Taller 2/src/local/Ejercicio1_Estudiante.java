
package local;

/**
 *
 * @author Daniel
 */
public class Ejercicio1_Estudiante {
    private String nombre;
    private int edad;
    private double notaPromedio;
    
    public Ejercicio1_Estudiante(){}
    
    public Ejercicio1_Estudiante(String nombre, int edad, double notaPromedio){
        this.nombre = nombre;
        this.edad = edad;
        this.notaPromedio = notaPromedio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getNotaPromedio() {
        return notaPromedio;
    }

    public void setNotaPromedio(double notaPromedio) {
        if (notaPromedio >= 0 ) {
            this.notaPromedio += notaPromedio;
        }else{
            this.notaPromedio = 0;
        }
    }
    
}