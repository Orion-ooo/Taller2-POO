
package local;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class NewMain {

    public static void main(String[] args) {
        Scanner entradaTexto = new Scanner(System.in);
        Scanner entradNum = new Scanner(System.in);
        
        //estudiante
        
        Ejercicio1_Estudiante estudiante = new Ejercicio1_Estudiante();

        System.out.println("ingrese el nombre del estudiante:");
        estudiante.setNombre(entradaTexto.nextLine());
        System.out.println("ingrese la edad del estudiante:");
        estudiante.setEdad(entradNum.nextInt());
        System.out.println("ingrese la nota promedio del estudiante:");
        estudiante.setNotaPromedio(entradNum.nextDouble());

        System.out.println("nombre del estudiante: " + estudiante.getNombre());
        System.out.println("edad del estudiante: " + estudiante.getEdad());
        System.out.println("nota promedio del estudiante: " + estudiante.getNotaPromedio());
        
        //coche
        
        Ejercicio2_Coche coche = new Ejercicio2_Coche();

        System.out.println("ingrese la marca del coche:");
        coche.setMarca(entradaTexto.nextLine());
        System.out.println("ingrese el modelo del coche:");
        coche.setModelo(entradaTexto.nextLine());
        System.out.println("ingrese una velocidad para acelerar:");
        coche.acelerar(entradNum.nextDouble());

        System.out.println("marca: " + coche.getMarca());
        System.out.println("modelo: " + coche.getModelo());
        System.out.println("acelarando: " + coche.getVelocidadMaxima());
        
        //Forma incorrecta:
        
//        System.out.println("ingrese la marca del coche:");
//        coche.marca(entradaTexto.nextLine());
//        System.out.println("ingrese el modelo del coche:");
//        coche.modelo(entradaTexto.nextLine());
//        System.out.println("ingrese la nota promedio del estudiante:");
//        coche.velocidadMaxima(entradNum.nextDouble());
//
//        System.out.println("nombre del estudiante: " + coche.marca());
//        System.out.println("edad del estudiante: " + coche.modelo());
//        System.out.println("nota promedio del estudiante: " + coche.velocidadMaxima());



        //Mala implementacion de una clase con atributo privado y sin metodos getter y setter
        
//        Ejercicio3_ClaseMala claseMala = new Ejercicio3_ClaseMala();
//        claseMala.propiedad = "propiedad";
    }
    
}
