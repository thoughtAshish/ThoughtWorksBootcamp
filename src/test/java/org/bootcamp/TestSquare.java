package org.bootcamp;

import org.bootcamp.day1.Square;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestSquare {
    @Test
    public void verifyAreaWithValidInput() throws Exception{
        assertEquals(1, new Square(1).calculateArea());
        assertEquals(25, new Square(5).calculateArea());
        assertEquals(36, new Square(6).calculateArea());
        assertEquals(64, new Square(8).calculateArea());
        assertEquals(144, new Square(12).calculateArea());
    }
    @Test
    public void verifyPerimeterWithValidInput() throws Exception{
        assertEquals(4, new Square(1).calculatePerimeter());
        assertEquals(8, new Square(2).calculatePerimeter());
        assertEquals(32, new Square(8).calculatePerimeter());

    }
}
