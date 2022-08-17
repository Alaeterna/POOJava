package ParametrosArgumentos;

import java.util.Scanner;

public class mainPromedio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //Declarando Variables
        double algebra, fisica, programacion;
        
        System.out.println("************************************************");
        System.out.println("Algebra: ");
        algebra = entrada.nextDouble();
        System.out.println("Fisica: ");
        fisica = entrada.nextDouble();
        System.out.println("Programacion: ");
        programacion = entrada.nextDouble();
        
        //Creando Objeto
        Promedio promedio = new Promedio();
        
        //Instanciando Metodos con parametros
        promedio.primerSemestre(algebra, fisica, programacion);
        
        //Instanciando Metodos sin parametros
        promedio.salidaDatos();
        
    }
}
