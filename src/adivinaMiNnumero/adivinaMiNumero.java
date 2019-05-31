package adivinaMiNnumero;

import java.util.Scanner;

/**
 *
 * @author mattias
 */
public class adivinaMiNumero {
    int numeroA;
    double numeroJ;
    int bien = 0;
    int mal = 0;
    boolean adivino = false;
    
    public void adivina(){
        //Ingreso del numero a adivinar
        System.out.println("Ingresa un numero de 4 digitos");
        Scanner entradaScanner = new Scanner(System.in);
        numeroA = entradaScanner.nextInt();
        
        //seleccion de numero por la computadora
        numeroJ = Math.random()*10000;
        int numeroComp = (int) numeroJ;
        
        if(numeroA == numeroComp){
        adivino = true;
        System.out.println("respuesta 4 bien, 0 regular. JUEGO TERMINADO!");
        }else{
            int numeroJAux = numeroComp;
        for(int i =0; i<4; i++){
            int numeroAuxJuego = numeroJAux % 10;
            int numeroAuxUsu = numeroA % 10;
            if(numeroAuxJuego == numeroAuxUsu){
            bien++;
            }else{
            mal++;
            }
            numeroJAux = numeroJAux /10;
            numeroA = numeroA /10;
        }
        System.out.println("respuesta " + bien + " bien, " + mal + " regular");
        }

    }
    
    
}
