/*
En un nuevo proyecto crear una clase de nombre Cuadrilatero con los atributos largo y alto, un
constructor que permita inicializar dichos atributos, sus respectivos getter y setter y los siguientes
métodos adicionales:
 calcularPerimetro(): este método retornará el perímetro del cuadrilátero.
 calcularArea(): este método retornará la superficie del cuadrilátero.
 esUnCuadrado(): este método retornará true si este cuadrilátero es un cuadrado, caso
contrario retornará false.
Luego desde la clase principal del proyecto (la que contiene el método main) se pide:
a) Crear un objeto Cuadrilatero con largo 70 y altura 50;
Luego utilizando sus métodos:
a) Mostrar por consola su perímetro
b) Mostrar por consola su superficie.
c) Mostrar por consola si es un cuadrado o no.
d) Cambiar el estado de uno de sus atributos para que sea un cuadrado.
 */
package ejer2;


public class Cuadrilatero {
    private int largo;
    private int alto;
    
    public Cuadrilatero(int largo, int alto) {
        this.largo = largo;
        this.alto = alto;
    }
    
    public int getLargo() {
        return largo;
    }
    
    public void setLargo(int largo) {
        this.largo = largo;
    }
    
    public int getAlto() {
        return alto;
    }
    
    public void setAlto(int alto) {
        this.alto = alto;
    }
    
    public int calcularPerimetro() {
        return 2 * (largo + alto);
    }
    
    public int calcularArea() {
        return largo * alto;
    }
    
    public boolean esUnCuadrado() {
        return largo == alto;
    }
}

/*
La clase Cuadrilatero tiene dos atributos largo y alto que representan la longitud de los 
lados del cuadrilátero. Tiene un constructor que toma como parámetros los valores iniciales de 
estos atributos, así como los getters y setters correspondientes. Además, tiene tres métodos adicionales: 
calcularPerimetro(), calcularArea() y esUnCuadrado(), que calculan el perímetro, la superficie y si el 
cuadrilátero es un cuadrado o no, respectivamente.

En la clase Main, creé un objeto Cuadrilatero con largo 70 y alto 50. Luego, utilizando sus métodos, 
imprimimos el perímetro, la superficie y si es un cuadrado o no. Luego, cambiamos el estado de uno de sus
atributos para que sea un cuadrado y comprobamos si lo es o no.

*/