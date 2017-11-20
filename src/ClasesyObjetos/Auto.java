package ClasesyObjetos;

import javax.swing.JOptionPane;

public class Auto {

    //atributos (caracteristicas)
    String marca;
    String modelo;
    int km;
    
    //metodos 
    public static void main(String[] args)
    {
        Auto auto1 = new Auto();
        auto1.marca= "BMW";
        auto1.modelo = "AA2017";
        auto1.km = 100;
        
        System.out.println("Auto 1");
        System.out.println("La marca de auto1 es " + auto1.marca);
        System.out.println("El modelo de auto1 es " + auto1.modelo);
        System.out.println("El km de auto1 es " + auto1.km + " KMS/Hora");
        
        Auto auto2 = new Auto();
        
        auto2.marca = "Mercedez Benz";
        auto2.modelo = "Q20-2018";
        auto2.km = 80;
        
        System.out.println("\nAuto 2");
        System.out.println ("La marca de auto2 es " + auto2.marca);
        System.out.println("El modelo de auto2 es " + auto2.modelo);
        System.out.println("El km de auto2 es " + auto2.km + " KMS/Hora");
        
        
        
        
        
        
    }
    
}
