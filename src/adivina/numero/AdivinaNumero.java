package adivina.numero;

import java.util.Scanner;

/**
 *
 * @author mattias
 */
public class AdivinaNumero {

    public static void main(String[] args) {
        int numeroA;
        double numeroJ;
        int bien = 0;
        int mal = 0;
        
        boolean adivino = false;

        numeroJ = Math.random() * 10000;
        int numero = (int) numeroJ;
        
        System.out.println("El numero aleatorio es: " + numero);
        while (adivino == false) {

            Scanner entradaScanner = new Scanner(System.in);
            numeroA = entradaScanner.nextInt();
            if (numeroA == numero) {
                adivino = true;
                System.out.println("respuesta 4 bien, 0 regular. JUEGO TERMINADO!");
            } else {
                int numeroJAux = numero;
                for (int i = 0; i < 4; i++) {
                    int numeroAuxjuego = numeroJAux % 10;
                    int numeroAuxadv = numeroA % 10;
                    if (numeroAuxjuego == numeroAuxadv) {
                        bien++;
                    } else {
                        mal++;
                    }
                    numeroJAux = numeroJAux / 10;
                    numeroA = numeroA / 10;
                }
                System.out.println("respuesta " + bien + " bien, " + mal + " regular");
            }
            
            bien =0;
            
            mal =0;
        }
    }

}
