package entornos;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TesterDeConvertidor {
    @Test
    public void testFahrenheitACelsius() {
        assertEquals(-20.5556, ConviertidorDeTemperatura.fahrenheitToCelsius(-5), 0.001);
        assertEquals(-17.7778, ConviertidorDeTemperatura.fahrenheitToCelsius(0), 0.001);
        assertEquals(-9.4444, ConviertidorDeTemperatura.fahrenheitToCelsius(15), 0.001);
    }

    @Test
    public void testCelsiusAFahrenheit() {
        assertEquals(104, ConviertidorDeTemperatura.celsiusToFahrenheit(40), 0.001);
        assertEquals(140, ConviertidorDeTemperatura.celsiusToFahrenheit(60), 0.001);
        assertEquals(176, ConviertidorDeTemperatura.celsiusToFahrenheit(80), 0.001);
    }
}
