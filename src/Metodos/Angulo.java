package Metodos;


import java.util.Scanner;

public class Angulo {
    //Atributos
    double  seno, coceno;
    double numero;
    
    //Declarando Metodos
    
    //Primir Metodo
    public void entradaNumero(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("------------------------------------------------");
        System.out.println("Ingresa el angulo");
        numero = entrada.nextDouble();
    }
    
    //Segundo Metodo
    public void calcularSeno(){
        seno = Math.sin(numero);
    }
    
    //Tercer Metodo
    public void calcularCoceno(){
        coceno = Math.cos(numero);
    }
    
    //Cuarto Metodo
    public void mostrarResultados(){
        System.out.println("\n----------------------------------------------");
        System.out.println("El seno de: " + numero + " es: " + seno);
        System.out.println("El coceno de: " + numero + " es: " + coceno);
    }
}
