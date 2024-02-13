package Exoesqueleto;

import java.util.Random;
import EjercitoRuso.IHumanoExtremidad;
import InteligenciaArtificial.IABOT;

public class Exobot extends IABOT implements IHumanoExtremidad {
    // private Boolean inicializado;
    private FuentePoder efuentePoder;
    private TurboReactor eturboReactor;
    private BrazoDerecho ebrazoDerecho;
    private BrazoIzquierdo ebrazoIzquierdo;
    private Pierna epiernaDerecha;
    private Pierna epiernaIzqquierda;

    public Exobot(IABOT iabot) {
        //Parte de Alex
        super(iabot);
        eturboReactor = new TurboReactor();
        ebrazoDerecho = new BrazoDerecho();
        ebrazoIzquierdo = new BrazoIzquierdo();
        epiernaDerecha = new Pierna();
        epiernaIzqquierda = new Pierna();

        if (Exobot.brazoIzquierdo) {
            ebrazoIzquierdo = new BrazoIzquierdo();
            boolean habilidadBrazoIzquierdo = new Random().nextBoolean();
            System.out.println("Equipando arma en el Brazo Izquierdo...");
            if (habilidadBrazoIzquierdo)
                ebrazoIzquierdo.setArma(new ArmaMetralleta("Metralleta MK61 equipada "));
            else
                ebrazoIzquierdo.setArma(new ArmaBazuca("Bazuca antitanque equipada "));

        }

        if (Exobot.brazoDerecho) {
            ebrazoDerecho = new BrazoDerecho();
            boolean habilidadBrazoDerecho = new Random().nextBoolean();
            System.out.println("Equipando arma en el Brazo Derecho...");
        
            if (habilidadBrazoDerecho) {
                ebrazoDerecho.equiparArma(new ArmaLaser(10));
                System.out.println("Arma láser equipada ");
            } else {
                ebrazoDerecho.equiparArma(new ArmaLanzafuegos("Lanzallamas"));
                System.out.println("Lanzallamas equipado ");
            }
        
            // Luego de equipar el arma, activarla con el tiempo adecuado
            ebrazoDerecho.activarArma(5);
        }
        

        if (Exobot.piernaDerecha)
            System.out.println("Pierna Derecha");

        if (Exobot.piernaIzquierda)
            System.out.println("Pierna Izquierda");

        if (Exobot.tronco)
            System.out.println("Tronco");

        if (Exobot.cabeza)
            System.out.println("Cabeza");

    }

}
