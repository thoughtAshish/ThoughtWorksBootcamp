package org.bootcamp;

import org.bootcamp.day2.Constants;
import org.bootcamp.day2.Temperature;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class TestTemperatureConverter {
    @Test
    public void testCelsiusWithFahrenheit(){
        Temperature temperature1 = new Temperature(BigDecimal.valueOf(0), Constants.UnitType.Celsius);
        Temperature temperature2 = new Temperature(BigDecimal.valueOf(32), Constants.UnitType.Fahrenheit);
        Temperature result = temperature1.convertFromCelciusTo(Constants.UnitType.Fahrenheit);
        Assert.assertEquals(result,temperature2);
    }

    @Test
    public void testCelsiusWithFahrenheit2(){
        Temperature temperature1 = new Temperature(BigDecimal.valueOf(0), Constants.UnitType.Celsius);
        Temperature temperature2 = new Temperature(BigDecimal.valueOf(1), Constants.UnitType.Fahrenheit);
        Temperature result = temperature1.convertFromCelciusTo(Constants.UnitType.Fahrenheit);
        Assert.assertNotEquals(result,temperature2);
    }
    @Test
    public void testCelsiusWithFahrenheit3(){
        Temperature temperature1 = new Temperature(BigDecimal.valueOf(0), Constants.UnitType.Celsius);
        Temperature temperature2 = new Temperature(BigDecimal.valueOf(273.15), Constants.UnitType.Kelvin);
        Temperature result = temperature1.convertFromCelciusTo(Constants.UnitType.Kelvin);
        Assert.assertEquals(result,temperature2);
    }
}
