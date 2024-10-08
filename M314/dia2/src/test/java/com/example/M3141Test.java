package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class M3141Test {
    
    @Test

    public void testSuma(){
        int numero1 = 5;
        int numero2 = 9;

        int resultado = 14;

        int resultadoM3141 = M3141.sumar(numero1, numero2);

        assertEquals(resultado, resultadoM3141, "La suma deberia ser 14");

    }
    
}
