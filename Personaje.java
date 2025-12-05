public class Personaje {
    private String nom;
    private int dinero;

    public Personaje(String nom, int dinero) {
        this.nom = nom;
        this.dinero = dinero;
    }

    public void mostrarInfo() {
        System.out.println(nom + " tiene " + dinero + "$.");
    }

    public void gastarDinero(int Dinero2) {
        dinero = dinero - Dinero2;
        System.out.println("Trevor gastó 100$ en ropa nueva");
        System.out.println("Trevor tiene " + dinero + "$" );

    }

    public static void main(String[] args) {
        Personaje jugador = new Personaje("Trevor", 500);
        jugador.mostrarInfo();
        jugador.gastarDinero(100);
    }
}
