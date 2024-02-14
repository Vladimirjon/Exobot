import EjercitoRuso.Soldado;
import Exoesqueleto.Exobot;
import InteligenciaArtificial.IABOT;

public class WhiteRun {
    public static void main(String[] args) throws Exception {
        IABOT iabot = IABOT.getInstance("IA-RUSA");
         Exobot e1 = new Exobot(iabot);
         Exobot e2 = new Exobot(iabot);
         Exobot e3 = new Exobot(iabot);

       Soldado s1 = new Soldado("Pepe");

         System.out.println(e1.getNombre());
         System.out.println(e3.getNombre());

    }
}
