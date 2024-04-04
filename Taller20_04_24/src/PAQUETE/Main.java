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
    
    
 
    
}import java.time.LocalDate;
import java.time.Period;

class Persona {
    private LocalDate fechaNacimiento;

    public Persona(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Period calcularEdad() {
        LocalDate fechaActual = LocalDate.now();
        return Period.between(fechaNacimiento, fechaActual);
    }
}

class Cuadrado {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double calcularArea() {
        return lado * lado;
    }

    public double calcularPerimetro() {
        return 4 * lado;
    }
}

class Circulo {
    private double radio;
    private final double PI = 3.14159;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return PI * radio * radio;
    }

    public double calcularPerimetro() {
        return 2 * PI * radio;
    }
}

class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double calcularArea() {
        // Usando la fórmula de Herón para calcular el área de un triángulo
        double s = (lado1 + lado2 + lado3) / 2;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }

    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    public double calcularHipotenusa() {
        // Si el triángulo es rectángulo, se puede calcular la hipotenusa usando el teorema de Pitágoras
        if (esTrianguloRectangulo()) {
            if (lado1 > lado2 && lado1 > lado3) {
                return Math.sqrt(lado1 * lado1 - lado2 * lado2 + lado3 * lado3);
            } else if (lado2 > lado1 && lado2 > lado3) {
                return Math.sqrt(lado2 * lado2 - lado1 * lado1 + lado3 * lado3);
            } else {
                return Math.sqrt(lado3 * lado3 - lado1 * lado1 + lado2 * lado2);
            }
        } else {
            return -1; // No se puede calcular la hipotenusa si no es un triángulo rectángulo
        }
    }

    private boolean esTrianguloRectangulo() {
        // Comprobar si se cumple el teorema de Pitágoras
        return lado1 * lado1 == lado2
