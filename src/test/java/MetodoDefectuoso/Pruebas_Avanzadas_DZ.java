/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package MetodoDefectuoso;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class Pruebas_Avanzadas_DZ {
    
    public Pruebas_Avanzadas_DZ() {
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

   @Test(timeout = 1)
    public void testMenoraMayor(){
        int [] Matriz1 = new int [200];
         
         for (int i = 0; i < Matriz1.length; i++) {
            Matriz1[i]= (int)(Math.random() * 101);
        }
        Metodo.menoraMayor(Matriz1);
    }
}
