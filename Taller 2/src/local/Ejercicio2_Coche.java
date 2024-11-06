
package local;

/**
 *
 * @author Daniel
 */
public class Ejercicio2_Coche {
    private String marca;
    private String modelo;
    private double velocidadMaxima;
    
    public Ejercicio2_Coche(){}
    
    public Ejercicio2_Coche(String marca, String modelo, double velocidadMaxima){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        if (velocidadMaxima >= 0) {
            this.velocidadMaxima = velocidadMaxima;
        } else {
            this.velocidadMaxima = 0;
        }
    }
    
    
}
