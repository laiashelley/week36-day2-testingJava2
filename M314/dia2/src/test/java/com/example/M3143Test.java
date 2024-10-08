package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class M3143Test {
    
    @Test
    public void testPar(){
        
        assertTrue(M3143.par(2));
        assertTrue(M3143.par(4));
        assertTrue(M3143.par(6));
        assertTrue(M3143.par(8));

        assertFalse(M3143.par(7));

    }

}
