package mx.itson.edu.concretas;

public class Dividir {
    //
    public void dividir(int a, int b) {
        if (a/b == 0) {
            System.out.println("Zero");
            //poner devolucion
        }else {
            a/=b;
            System.out.println(a);
        }
    }
}
