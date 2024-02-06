package org.bootcamp.day2;

import java.math.BigDecimal;

public class Temperature extends Unit{

    public Temperature(BigDecimal magnitude, Constants.UnitType type) {
        super(type,magnitude);
    }





    public Temperature convertFromCelciusTo(Constants.UnitType type) {
        if (this.getType() != type) {
            switch (type) {
                case Fahrenheit: {
                    return new Temperature(this.getMagnitude().multiply(BigDecimal.valueOf(9 / 5)).add(BigDecimal.valueOf(32)), type);
                }
                case Kelvin: {
                    return new Temperature(this.getMagnitude().add(BigDecimal.valueOf(273.15)), type);
                }
            }
        }
        return new Temperature(this.getMagnitude(), this.getType());

    }


        public Temperature convertFromFahrenheitTo(Constants.UnitType type){
            if (this.getType() != type) {
                switch (type) {
                    case Celsius: {
                        return new Temperature((BigDecimal.valueOf(5 / 9)).multiply(this.getMagnitude().subtract(BigDecimal.valueOf(32))), type);
                    }
                    case Kelvin: {
                        return new Temperature((BigDecimal.valueOf(5 / 9)).multiply(this.getMagnitude().add(BigDecimal.valueOf(459.67))), type);
                    }
                }

            }
            return new Temperature(this.getMagnitude(), this.getType());
        }

    

}
