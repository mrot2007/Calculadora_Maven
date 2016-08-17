package br.ufjf.calculadora;

import br.ufjf.calculadora.Calculadora;
import static junit.framework.Assert.assertEquals;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

//import org.junit.Test;
//import static org.junit.Assert.*;

/**
 *
 * @author marcelo
 */
public class CalculadoraTest {
    Calculadora calc = new Calculadora();
    public CalculadoraTest() {
    }

    /**
     * Test of somar method, of class Calculadora.
     */
    
    public void testSomar() {
         assertEquals(20, calc.somar(10,20), 0);
    }

    /**
     * Test of subtrair method, of class Calculadora.
     */
   
    public void testSubtrair() {
        assertEquals(20, calc.subtrair(50,30), 0);
    }

    /**
     * Test of multiplicar method, of class Calculadora.
     */
   
    public void testMultiplicar() {
        assertEquals(40, calc.multiplicar(10,4), 0);
    }

    /**
     * Test of dividir method, of class Calculadora.
     */
   
    public void testDividir() {
        assertEquals(5, calc.dividir(10,2), 0);
    }
    
}
