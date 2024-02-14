import EjercitoRuso.Soldado;
import Exoesqueleto.Exobot;
import InteligenciaArtificial.IABOT;

public class WhiteRun {
    // for (int i = 0; i < 20; i++) {
    //     System.out.println(" - - - CYBERBOT " + (i + 1) + " - - -");
    //     System.out.println("Soldado: " + nombresSoldado.get(i+1));
    //     Exobot exobot = exobots[i];
    //     exobot.vaMostrarInformacion();

    //     System.out.println("Enseñado ingles: "+exobot.pjenseniarIngles());
    //     System.out.println("Enseñado español: "+exobot.pjensenaEspanol());
    //     System.out.println();
    //     System.out.println("Brazo derecha");
    //     System.out.println("Equipado Metralleta: "+ TJomecatronico.get(i).oMetralleta.ispjMetralletaeqquiped());
    //     System.out.println("Bazuca: "+ TJomecatronico.get(i).oBazuca.ispjBazucaequipped());
    //     System.out.println();
    //     System.out.println("Brazo izquierdo");
    //     System.out.println("Equipado Lanzafuego: " + TJomecatronico.get(i).oLanzafuegos.ispjLanzafuegoequipped());
    //     System.out.println("Equipado Laser: "+ TJomecatronico.get(i).oLaser.ispjLaserequipped());
    //     System.out.println();
    //     System.out.println("Piernas");
    //     TJomecatronico.get(i).pjBotas.pjCorrer();
    //     TJomecatronico.get(i).pjBotas.pjSupersalto();
    //     System.out.println();
    // }

    public static void main(String[] args) throws Exception {
        IABOT iabot = IABOT.getInstance("IA-RUSA");
        for(int i=0;i<20;i++){
            System.out.println(" - - - EXOBOT "+(i+1)+" - - - ");
            Exobot  exobot = new Exobot(iabot);
            // expertoEspanol.traducirEspanolTecnico();
            System.out.println();
        }
        // Exobot e1 = new Exobot(iabot);
        // Exobot e3 = new Exobot(iabot);

        // System.out.println(e1.getNombre());
        // System.out.println(e3.getNombre());
        
    }
}
