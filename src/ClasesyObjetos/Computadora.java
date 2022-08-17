
package ClasesyObjetos;


public class Computadora {
   //Atributos
    String Color;
    String Marca;
    String Tamaño;
    String SO;
    
    //Metodo Main (Codigo a ejecutar)
    public static void main(String[] args) {
      //Creacion de un objeto
      Computadora computadora = new Computadora();
      Computadora computadora2 = new Computadora();
      
      //Llenando atributos
      computadora.Color = "Blanco";
      computadora.Marca = "Asus";
      computadora.Tamaño = "16 pulgadas";
      computadora.SO = "Windows";
      
      //Llenando atributos
      computadora2.Color = "Negra";
      computadora2.Marca = "Hp";
      computadora2.Tamaño = "14 pulgadas";
      computadora2.SO = "Windows";
      
        System.out.println("------------------------------------------");
        System.out.println("               Computadora1               ");
        System.out.println("Color: " + computadora.Color);
        System.out.println("Marca: " + computadora.Marca);
        System.out.println("Tamaño: " + computadora.Tamaño);
        System.out.println("Sistema Operativo: " + computadora.SO);
        System.out.println("------------------------------------------");
        
        System.out.println("------------------------------------------");
        System.out.println("               Computadora2               ");
        System.out.println("Color: " + computadora2.Color);
        System.out.println("Marca: " + computadora2.Marca);
        System.out.println("Tamaño: " + computadora2.Tamaño);
        System.out.println("Sistema Operativo: " + computadora2.SO);
        System.out.println("------------------------------------------");
        
    }
}
