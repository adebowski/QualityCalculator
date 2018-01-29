package pl.edu.agh.qualitycalculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class CalculationsTest {
    Calculations calculationsUnderTest;

    @Before
    public void setUp() {
        calculationsUnderTest = new Calculations();
    }

    @Test
    public void testSum() throws Exception {
        assertEquals(9, calculationsUnderTest.calculate(Operation.SUM, 3, 3, 3), 0.01);
    }
    @Test
    public void testSubtract() throws Exception {
        assertEquals(3, calculationsUnderTest.calculate(Operation.SUBTRACT, 9, 3, 3), 0.01);
    }
    @Test
    public void testDivide() throws Exception {
        assertEquals(1.5, calculationsUnderTest.calculate(Operation.DIVIDE, 9, 3, 2), 0.01);
        try {
            assertEquals(6, calculationsUnderTest.calculate(Operation.DIVIDE, 3, 0, 3), 0.01);
        }
        catch (Exception e) {
            String expectedMessage = "this is the message I expect to get"+ e.getMessage();
        }
    }
    @Test
    public void testMultiply() throws Exception {
        assertEquals(27, calculationsUnderTest.calculate(Operation.MULTIPLY, 3, 3, 3), 0.01);
    }
    @Test
    public void testAverage() throws Exception {
        assertEquals(3, calculationsUnderTest.calculate(Operation.AVERAGE, 3, 3, 3), 0.01);
    }

    @After
    public void tearDown() {
    }
}
