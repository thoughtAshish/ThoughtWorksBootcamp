package org.bootcamp.day2;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Objects;

@Setter
@Getter
public class Unit {
    private Constants.UnitType type;

    private BigDecimal magnitude;

    public Unit(Constants.UnitType type, BigDecimal magnitude) {
        this.type = type;
        this.magnitude = magnitude;
    }
    public Constants.UnitType getType(){
       return this.type;
    }
    public BigDecimal getMagnitude(){
        return this.magnitude;
    }

    public boolean compareTo(Unit anotherUnit){
        if(anotherUnit.type == this.type){
            return anotherUnit.magnitude == this.magnitude;
        }else{
            return (anotherUnit.type.scale.multiply(anotherUnit.magnitude)).compareTo((this.type.scale.multiply(this.magnitude))) ==0;
        }

    }
    public Unit Add(Unit inputUnit)
    {
        if(this.type == inputUnit.type)
            return new Unit(this.type, inputUnit.magnitude.add(this.magnitude));
        return new Unit(this.type, ((inputUnit.type.scale.multiply(inputUnit.magnitude)).add((this.type.scale.multiply(this.magnitude)))).divide(this.type.scale));
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Unit other = (Unit) obj;

        // Compare relevant fields for equality
        return Objects.equals(type, other.type) &&
                Objects.equals(magnitude, other.magnitude);
    }
}
