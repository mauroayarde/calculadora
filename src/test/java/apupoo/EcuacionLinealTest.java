package apupoo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EcuacionLinealTest {
    @Test
    public void testResolverEcuacion(){
        EcuacionLineal a = new EcuacionLineal(2.0,2.0);
        assertEquals(4.0, a.resolverEcuacion(1.0));
    }
}
