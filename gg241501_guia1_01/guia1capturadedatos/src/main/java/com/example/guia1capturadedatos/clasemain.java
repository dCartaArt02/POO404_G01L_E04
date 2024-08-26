package com.example.guia1capturadedatos;
import javax.swing.*;
import java.util.*;
import javax.swing.JOptionPane;

public class clasemain {
    public static void main(String [] args ){
        Scanner leer = new Scanner(System.in);
        String nombre = "";
        int edad;

        System.out.println("bienvenidos a intelij IDE");
        System.out.print("INGRESE SU NOMBRE:");
        nombre = leer.nextLine();
        System.out.print("INGRESE SU EDAD: ");
        edad = leer.nextInt();

        System.out.println("USTED SE LLAMA "+ nombre+ " Y SU EDAD ES: "+edad);


    }
}
