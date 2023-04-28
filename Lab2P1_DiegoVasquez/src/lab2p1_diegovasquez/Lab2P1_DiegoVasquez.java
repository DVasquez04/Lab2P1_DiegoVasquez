/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p1_diegovasquez;

import java.util.Scanner;

/**
 *
 * @author Diego Vasquez
 */
public class Lab2P1_DiegoVasquez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);

        boolean seguir = true;

        while (seguir) {
            System.out.println("1.Clasificando numeros");
            System.out.println("2.Aproximando PI");
            System.out.println("3.MCD");
            System.out.println("4.Salir");
            int opcion = lea.nextInt();
            switch (opcion) {
                case 1: {
                    System.out.println("Ingrese el numero que desea evaluar: ");
                    int numero_xcali = lea.nextInt();
                    while (numero_xcali <= 0) {
                        System.out.println("Su numero tiene que ser mayor que 0: ");
                        System.out.println("Ingrese el numero que desea evaluar: ");
                        numero_xcali = lea.nextInt();
                    }//fin while
                    if (numero_xcali % 2 != 0) {
                        int cont_c = 1;
                        int acum_0 = 0;
                        while (cont_c <= numero_xcali) {
                            if (numero_xcali % cont_c == 0) {
                                acum_0++;
                            }
                            cont_c = cont_c + 1;
                        }
                        if (acum_0 == 2) {
                            System.out.println("Su numero es impar y primo");
                        } else {
                            System.out.println("su numero es impar");
                        }

                    } else {
                        int cont_c = 1;
                        int acum_0 = 0;
                        while (cont_c <= numero_xcali) {
                            if (numero_xcali % cont_c == 0) {
                                acum_0++;
                            }
                            cont_c = cont_c + 1;
                        }
                        if (acum_0 == 2) {
                            System.out.println("Su numero es par y primo");
                        } else {
                            System.out.println("su numero es par");
                        }

                    }//fin else
                }//fin case 1
                break;
                case 2: {
                    System.out.println("Ingrese la precisión del calculo: ");
                    double N = lea.nextInt();
                    while(N <= 0){
                        System.out.println("N tiene que ser mayor a 0...");
                        N = lea.nextInt();
                    }//fin while
                    double I = 1;
                    double Mult = 1;
                    while (I <= N){
                        double divi = (4*(Math.pow(I, 2)))/(4*(Math.pow(I, 2))-1);
                        Mult = Mult * divi;
                        I++;
                        //i = i +2
                        //i+= 2     
                    }//fin while
                    System.out.println(" PI: "+ Mult*2);
                }//fin case 2
                break;
                case 3: {
                    System.out.println("Ingrese un numero mayor a 0: ");
                    int A = lea.nextInt();
                    while (A < 0){
                        System.out.println("Su numero tiene que ser positivo: ");
                        A = lea.nextInt();
                    }//fin while
                    System.out.println("Ingrese otro numero mayor a 0");
                    int B = lea.nextInt();
                    while (B < 0){
                        System.out.println("Su numero tiene que ser positivo: ");
                        B = lea.nextInt();
                    }//fin while
                    if ((A == 0)||(B == 0)){
                        System.out.println("Sus numeros no pueden ser 0...");
                    }else {
                        System.out.print("El MCD de "+A +" y " + B +" Es: ");
                        while (A != B){
                        if (A < B){
                            B = B - A;
                        }else{
                            A = A - B;
                        }//fin else
                        }//fin while
                    }//fin else
                    if (A == B){
                    int MCD = B;
                    System.out.print(MCD);
                    System.out.println("");
                    }
                    
                }//Fin case 3
                break;
                case 4: {
                    seguir = false;
                }//fin case 4
                break;
                default: {
                    System.out.println("Numero invalido...");
                }//fin default
                break;
            }//fin switch
        }//fin while
    }//fin main

}//fin class
