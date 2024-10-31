package org.example;

import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Examen {
    public void ejercicio1(){

        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();


        int ronda =0;
        for (int i=0; i<3;i++){

            System.out.println("Ronda "+(i+1));
            System.out.println("¿Piedra, papel o tijera? (p/a/t)");
            String opcion = teclado.next();
            
        }
    }
    public void ejercicio2(){


        Scanner teclado = new Scanner(System.in);
        int anyo = 0;

        LocalDateTime hoy = LocalDateTime.now();
        int anyo_actual = hoy.getYear();

        try{
            System.out.println("Dime tu año de nacimiento: ");
            anyo = teclado.nextInt();
        }catch (InputMismatchException err){
            System.out.println("Error:el valor introducido no es valido.");
            return;
        }

        if (anyo <= 1900 || anyo>=anyo_actual || anyo <=0){
            System.out.println("Error: el año introducido no es válido");
            return;
        }

        int edad =0;
        for (int i=anyo; i<=anyo_actual;i++){

            System.out.println(anyo+ "-"+ "edad:"+ edad);
            edad++;
            anyo++;
        }

    }
}
