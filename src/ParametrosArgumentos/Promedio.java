
package ParametrosArgumentos;

public class Promedio {
    //Atributos
    double Promedio;
    
    //Metodos
    
    //Primer Metodo
    public void primerSemestre(double algebra, double fisica, double programacion){
        Promedio = (algebra + fisica + programacion) / 3;
    }
    
    //Segundo Metodo
    public void salidaDatos(){
        System.out.println("------------------------------------------------");
        System.out.println("El promedio del primer semestre es: "
                + String.format("%.2f", Promedio));
    }
    
    
}
