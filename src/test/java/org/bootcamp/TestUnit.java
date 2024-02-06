package org.bootcamp;

import org.bootcamp.day2.Constants;
import org.bootcamp.day2.Unit;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class TestUnit {
    @Test
    public void shouldCompareAndEquate(){
        Unit unit1 = new Unit(Constants.UnitType.Centimeter, BigDecimal.valueOf(100));
        Unit unit2 = new Unit(Constants.UnitType.Meter,BigDecimal.valueOf(1));
        Assert.assertTrue(unit1.compareTo(unit2));
    }
    @Test
    public void shouldCompareAndEquateForKm(){
        Unit unit1 = new Unit(Constants.UnitType.Centimeter, BigDecimal.valueOf(100));
        Unit unit2 = new Unit(Constants.UnitType.Kilometer,BigDecimal.valueOf(0.001));
        Assert.assertTrue(unit1.compareTo(unit2));
    }
    @Test
    public void should_add_units_meter_Output()
    {
        Unit unit1 = new Unit(Constants.UnitType.Meter, BigDecimal.ONE);
        Unit unit2 = new Unit(Constants.UnitType.Centimeter, BigDecimal.valueOf(100));
        Unit unit3 = new Unit(Constants.UnitType.Meter, BigDecimal.valueOf(2));
        Unit result = unit1.Add(unit2);
        assertEquals(result, unit3);
    }

    @Test
    public void should_add_units_centimeter_Output()
    {
        Unit unit1 = new Unit(Constants.UnitType.Centimeter, BigDecimal.valueOf(200));
        Unit unit2 = new Unit(Constants.UnitType.Meter, BigDecimal.valueOf(1));
        Unit unit3 = new Unit(Constants.UnitType.Centimeter, BigDecimal.valueOf(300));
        Unit result = unit1.Add(unit2);
        assertEquals(result, unit3);
    }


}
