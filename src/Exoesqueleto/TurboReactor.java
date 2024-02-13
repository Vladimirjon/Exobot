package Exoesqueleto;

public class TurboReactor {
    private int carga;
    private boolean vuelo;

    public TurboReactor(){
        this.carga= 0;
        this.vuelo= false;
    }
    public void cargarCombustible(int cantidad){
        carga += cantidad;
        System.out.println("Se ha cargado "+ cantidad+"%.");
    }
    public void activarVuelo() {
        if (carga>0) {
            vuelo = true;
            System.out.println("El exoesqueleto puede volar");
            } else{
                System.out.println("El exoesqueleto  no tiene combustible suficiente para el vuelo");
}

}
}
