// // 1 Prueba a instalar j unit en tu nuevo proyecto vscode, e intenta realizar alguna comprobación sencilla, por ejemplo,
// sumar dos numeros. 

package com.example;

public class M3141 {
    public static void main(String[] args) {

        int numero1 = 5;
        int numero2 = 9;
        int resultado = sumar(numero1, numero2);

        System.out.println("La suma de " + numero1 + " y " + numero2 + ": " + resultado);
        
    }

    public static int sumar(int a, int b){
        return a + b;
    }
    
}