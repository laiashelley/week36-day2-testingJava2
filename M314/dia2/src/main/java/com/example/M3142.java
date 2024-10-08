// // 2. Copia el codigo de la pagina https://www.geeksforgeeks.org/junit-5-assertions/ (clase java y clase test) e intenta ejecutar el test
// Lo consigues? Que resultados obtienes?

package com.example;

public class M3142 {
    
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public boolean isPositive(int number) {
        return number > 0;
    }

    public boolean isNegative(int number) {
        return number < 0;
    }

    public String getHello() {
        return "Hello";
    }

    public int[] getArray() {
        return new int[]{1, 2, 3};
    }

    public String getHelloString() {
        return new String("Hello");
    }

    public void throwArithmeticException() {
        int result = 1 / 0;
    }

}
