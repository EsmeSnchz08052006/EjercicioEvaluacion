public class Main {
    public static void main(String[] args) {
        Futbolista jugador = new Futbolista();
        jugador.nombre = "Messi";
        jugador.viajar();
        jugador.concentrarse();

        Entrenador tecnico = new Entrenador();
        tecnico.nombre = "anchelotti";
        tecnico.viajar();
        tecnico.dirigirPartido();

        Masajista masajista = new Masajista();
        masajista.nombre = "Ronaldo";
        masajista.viajar();
        masajista.darMasaje();
    }
}

