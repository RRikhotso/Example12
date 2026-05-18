package com.mycompany.example12;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClassBTest 
{    
    public ClassBTest() 
    {
    }

    @org.junit.jupiter.api.Test
    public void testAdd() 
    {
        ClassB gg = new ClassB();
        int expected = 3;
        int actual = gg.Add(1, 2);
        
        assertEquals(expected, actual);
    }
    
}
