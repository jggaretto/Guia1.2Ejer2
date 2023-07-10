/*

 */
package ejer2;


public class Ejer2 {

  
    public static void main(String[] args) {
     
    // Crear un objeto Cuadrilatero con largo 70 y altura 50
        Cuadrilatero c1 = new Cuadrilatero(70, 50);

        // Mostrar el perímetro del cuadrilátero
        System.out.println("Perímetro: " + c1.calcularPerimetro());

        // Mostrar la superficie del cuadrilátero
        System.out.println("Superficie: " + c1.calcularArea());

        // Mostrar si es un cuadrado o no
        System.out.println("¿Es un cuadrado?: " + c1.esUnCuadrado());

        // Cambiar el estado de uno de sus atributos para que sea un cuadrado
        c1.setLargo(50);

        // Mostrar de nuevo si es un cuadrado o no
        System.out.println("¿Es un cuadrado?: " + c1.esUnCuadrado());

    }
    
}

/*
En este código creé un objeto Cuadrilatero con un largo de 70 y una altura de 50, y luego 
utilizamos los métodos que definimos en la clase Cuadrilatero para mostrar su perímetro, su 
superficie y si es un cuadrado o no. Luego cambiamos el valor del largo para que sea igual
a la altura y volvemos a mostrar si es un cuadrado o no.
*/