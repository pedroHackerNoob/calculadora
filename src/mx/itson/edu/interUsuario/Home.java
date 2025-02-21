package mx.itson.edu.interUsuario;

public class Home {
    Calculadora calculadora = new Calculadora();
    EntradaDatos entradaDatos = new EntradaDatos();

    public void runCalculadora() {
        calculadora.tylerTools();
        entradaDatos.entrada();
        entradaDatos.opcionCalcular();
    }
}
