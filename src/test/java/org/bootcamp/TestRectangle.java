package org.bootcamp;


import org.junit.Test;

import static junit.framework.Assert.assertEquals;


public class TestRectangle {
    @Test
    public void verifyRectangleArea() throws Exception {
        Rectangle rectangle = new Rectangle(4,3);
        assertEquals(12, rectangle.calculateArea());
        Rectangle rectangle2 = new Rectangle(5,3);
        assertEquals(15, rectangle2.calculateArea());
        Rectangle rectangle3 = new Rectangle(4,0);
        assertEquals(0, rectangle3.calculateArea());
    }
    @Test(expected = Exception.class)
    public void testCalculateAreaWillThrowExceptionOnNegativeEntry() throws Exception{
        Rectangle rectangle = new Rectangle(-4,15);
        rectangle.calculateArea();
    }
}
