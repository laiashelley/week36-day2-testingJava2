// 3.Comprobar si un numero que le pasas a un metodo es par. puedes probar a usar assertTrue o / y assertFalse en vez de assertEquals.

package com.example;

public class M3143 {
    
    public static void main(String[] args){
        System.out.println("2 es par: " + par(2));
        System.out.println("4 es par: " + par(4));
        System.out.println("4 es par: " + par(6));
        System.out.println("4 es par: " + par(8));
        System.out.println("4 es par: " + par(5));
    }

    public static boolean par(int numeroPar){
        return numeroPar % 2 == 0;
    }

}
