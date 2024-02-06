package org.bootcamp.day1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Rectangle {
    private final long length;
    private final long width;
    public Rectangle(long length, long width){
        this.length = length;
        this.width = width;
    }



    public long calculateArea() throws Exception {
        validateSide(length,width);
        return length * width;
    }

    public long calculatePerimeter() throws Exception{
        validateSide(length,width);
        return 2*(length + width);
    }

    public void validateSide(long length, long width) throws Exception{
        if(length<0 || width<0){
            throw new Exception("side can only be non negative");
        }
    }

}
