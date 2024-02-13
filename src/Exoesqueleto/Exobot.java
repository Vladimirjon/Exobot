package Exoesqueleto;

import EjercitoRuso.IHumanoExtremidad;
import InteligenciaArtificial.IABOT;

public class Exobot extends IABOT implements IHumanoExtremidad {
    //private Boolean inicializado;
    private FuentePoder efuentePoder;
    private TurboReactor eturboReactor;
    private BrazoDerecho ebrazoDerecho;
    private BrazoIzquiedo ebrazoIzquierda;
    private Pierna epiernaDerecha;
    private Pierna epiernaIzqquierda;

    public Exobot(IABOT iabot){
        super(iabot);
        eturboReactor = new TurboReactor();
        ebrazoDerecho = new BrazoDerecho();
        ebrazoIzquierda = new BrazoIzquiedo();
        epiernaDerecha = new Pierna();
        epiernaIzqquierda = new Pierna();

        if(Exobot.brazoDerecho){
            System.out.println("Brazo Derecho");
            boolean habilidadBrazoDerecho=true;

            if(habilidadBrazoDerecho){
                ArmaLaser lz = new ArmaLaser("Metralleta MK61");
                ebrazoIzquierda.setArma(lz);
            }else{
                ArmaLanzafuegos lf = new ArmaLanzafuegos("Bazuca Antitanque");
                ebrazoIzquierda.setArma(lf);
            }
        }
        

        if(Exobot.brazoIzquierdo){
            System.out.println("Brazo Izquierdo");
            boolean habilidadBrazoIzquierdo=true;

            if(habilidadBrazoIzquierdo){
                ArmaMetralleta m = new ArmaMetralleta("Metralleta MK61");
                ebrazoIzquierda.setArma(m);
            }else{
                ArmaBazuca b = new ArmaBazuca("Bazuca Antitanque");
                ebrazoIzquierda.setArma(b);
            }
        }
        if(Exobot.piernaDerecha)
            System.out.println("Pierna Derecha");
        
        if(Exobot.piernaIzquierda)
            System.out.println("Pierna Izquierda");
        
        if(Exobot.tronco)
            System.out.println("Tronco");
        
        if(Exobot.cabeza)
            System.out.println("Cabeza");
    }

    // // public Boolean inicializar(){
    //     if(!inicializado){
    //         System.out.println("Iniciaando exobot...");
    //     }
    // //     return inicializado;
    // // }

}
