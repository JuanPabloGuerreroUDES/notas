/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PAQUETE;

import java.util.Random;

/**
 *
 * @author juang
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona persona =new Persona("Juan",18,generaCedula(),'H',78.3,1.75);
       
        System.out.println(persona.toString());
        System.out.println("su IMC se encuentra en: "+persona.calcularIMC(persona.getPeso(), persona.getAltura()));
        
        System.out.println("Es mayor de edad: "+persona.esMayorDeEdad(persona.getEdad()));
    }
    
    private static String generaCedula() {
        Random random = new Random();
        StringBuilder numeroAleatorio = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            int digito = random.nextInt(10);
            numeroAleatorio.append(digito);
        }
        return numeroAleatorio.toString();
    }
    
    
 
    
}
