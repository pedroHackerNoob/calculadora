package mx.itson.edu.interUsuario;

import mx.itson.edu.concretas.*;
import mx.itson.edu.numero.Numero;

public class Calculadora {
    Dividir dividir = new Dividir();
    Multiplicar multiplicar = new Multiplicar();
    Restar restar = new Restar();
    Sumar sumar = new Sumar();
    Numero numero = new Numero();

    //menu
    public void menu(int opcion) {
        switch(opcion) {
                // dividir
            case 1:
                dividir.dividir(numero.getNumero1(), numero.getNumero2());
                break;
                //multiplicar
            case 2:
                multiplicar.multiplicar(numero.getNumero1(), numero.getNumero2());
                break;
                //restar
            case 3:
                 restar.restar(numero.getNumero1(), numero.getNumero2());
                 break;
                //sumar
            case 4:
                sumar.sumar(numero.getNumero1(), numero.getNumero2());
                break;
        }
    }
    //banner
    public void tylerTools() {
        System.out.println(
                "  ::::::::::::::   ::::::       :::::::::::::::::::          :::::::::::::::::::  :::::::: :::       :::::::: \n" +
                "     :+:    :+:   :+::+:       :+:       :+:    :+:             :+:   :+:    :+::+:    :+::+:      :+:    :+: \n" +
                "    +:+     +:+ +:+ +:+       +:+       +:+    +:+             +:+   +:+    +:++:+    +:++:+      +:+         \n" +
                "   +#+      +#++:  +#+       +#++:++#  +#++:++#:              +#+   +#+    +:++#+    +:++#+      +#++:++#++   \n" +
                "  +#+       +#+   +#+       +#+       +#+    +#+             +#+   +#+    +#++#+    +#++#+             +#+    \n" +
                " #+#       #+#   #+#       #+#       #+#    #+#             #+#   #+#    #+##+#    #+##+#      #+#    #+#     \n" +
                "###       ###   #######################    #############   ###    ########  ######## ##################      ");
    }

}
