package PAQUETE;

import java.util.Scanner;

public class MetodoSimplex {
    private double [][]Tabla;
    private int fila, columna;
    private int restricciones;
    private int cantidadx;

    public MetodoSimplex(double[][] Tabla, int fila, int columna) {
        this.Tabla = Tabla;
        this.fila = fila;
        this.columna = columna;
    }

    public MetodoSimplex() {
    }
    
    private void TomarDatos(){
        Scanner entradra =new Scanner(System.in);
        System.out.println("Ingrese la cantidad de restricciones");
        this.restricciones=entradra.nextInt();
        System.out.println("Ingrese la cantidad de x");
        this.cantidadx=entradra.nextInt();
        
    }
    public static void main(String[] args) {
        MetodoSimplex metodo = new MetodoSimplex();
        metodo.TomarDatos();
        System.out.println(metodo.restricciones);
        
    }
    
  
}
