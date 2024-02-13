package Exoesqueleto;

public class Pierna {
    private String piernaIzquierda;
    private String piernaDerecha;
    private String habilidad;

    public Pierna(String piernaIzquierda, String piernaDerecha, String hanilidad){

    
        this.piernaIzquierda = piernaIzquierda;
        this.piernaDerecha = piernaDerecha;
    }
    //Metodos getter y setter para las variables de la clase
    public String getPiernaIzquierda() {
        return piernaIzquierda;
    }
    public String  getPiernaDerecha() {
        return piernaDerecha;
    }
    public String  getHabilidad() {
        return habilidad;
    }
    public void habilidad(){
        System.out.println("Las piernas ahora pueden correr a grandes velocidades y dar saltos muy altos");
    }
}