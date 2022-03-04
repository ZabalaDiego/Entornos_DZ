/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package MetodoDefectuoso;

import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Alumno Tarde
 */
@RunWith(value = Parameterized.class)

public class Pruebas_Simples_DZ {
    
    @Parameters
    public static Iterable<Object[]> dameDatos() {
        return Arrays.asList(new Object[][]{
            {3, 2, 4}, {-3,-2,-5}, {-1, 3, 4}
        });
    }
    private int a, b, c;
    public Pruebas_Simples_DZ(int a, int b, int c) {
        this.a=a;
        this.b=b;
        this.c=c;
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    

    @Test
    public void testMenoraMayor() {
        System.out.println("menoraMayor");
        int i=0;
        int[] Matriz1 = {a,b,c};
        
        Metodo.menoraMayor(Matriz1);
         for (int elemento: Matriz1) {
            
            System.out.print("Posicion: " + i +": "+ elemento + ". ");
            i++;
        }
         System.out.println("");
       //fail("The test case is a prototype.");
    }
    
}
