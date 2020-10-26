package apupoo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    @Test
    public void testDividir(){
        Calculadora a = new Calculadora();
        assertEquals(3.0,a.dividir(9, 3) );
    }

    @Test
    public void testMultiplicar(){
        Calculadora a = new Calculadora();
        assertEquals(-25,a.multiplicar(5, -5));
    }

}
