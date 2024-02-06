package org.bootcamp.day2;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
@Getter
@Setter
public class Constants {
    public enum UnitType{
        Centimeter(BigDecimal.valueOf(10)),
        Meter(BigDecimal.valueOf(10*100)),
        Kilometer(BigDecimal.valueOf(10*100*1000)),
        Celsius(java.math.BigDecimal.ZERO),
        Fahrenheit(java.math.BigDecimal.ZERO),
        Kelvin(java.math.BigDecimal.ZERO);



        public final BigDecimal scale;
        UnitType(BigDecimal scale){
            this.scale = scale;
        }
    }

    public enum TemperatureUnit{
        Celsius,
        Fahrenheit,
        Kelvin,
    }
}
