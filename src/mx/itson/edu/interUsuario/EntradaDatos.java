package mx.itson.edu.interUsuario;

import mx.itson.edu.numero.Numero;

import java.util.Scanner;

public class EntradaDatos {
    Scanner sc = new Scanner(System.in);
    //
    Numero num = new Numero();
    Calculadora calculadora = new Calculadora();

    public void entrada() {
        System.out.println("Ingrese un numero: ");
        num.setNumero1(sc.nextInt());
        System.out.println("Ingrese el segundo numero: ");
        num.setNumero2(sc.nextInt());
    }
    public void opcionCalcular() {
        System.out.println("Seleccione una opcion:\n[1] Dividir\n[2] Multiplicar\n[3] Restar\n[4] Sumar\n==[5] Salir");
        try {
            int opcion = sc.nextInt();
            calculadora.menu(opcion);
        }catch (Exception e) {
            System.out.println("Opcion no valida\n");
        }
    }
}
