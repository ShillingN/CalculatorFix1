package pro.sky.java.course2.CalculatorFix1.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pro.sky.java.course2.CalculatorFix1.exception.IllegalArgumentException;

class CalculatorServiceImplTest {
    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    public static int a = 1;
    public static int b = -3;
    public static int c = 4;
    public static int d = 6;
    public static int e = 0;

        @Test
        public void shouldReturnResultPlus() {
            int result1 = out.Plus(a, e);
            int result2 = out.Plus(a, b);
            int expResult1 = 1;
            int expResult2 = -2;
            Assertions.assertEquals(result1, expResult1);
            Assertions.assertEquals(result2, expResult2);
        }

        @Test
        public void shouldReturnResultMinus() {
            int result1 = out.Minus(a, d);
            int result2 = out.Minus(a, b);
            int expResult1 = -5;
            int expResult2 = 4;
            Assertions.assertEquals(result1, expResult1);
            Assertions.assertEquals(result2, expResult2);
        }

        @Test
        public void shouldReturnResultMultiply() {
            int result1 = out.Multiply(c, d);
            int result2 = out.Multiply(e, b);
            int expResult1 = 24;
            int expResult2 = 0;
            Assertions.assertEquals(result1, expResult1);
            Assertions.assertEquals(result2, expResult2);
        }

        @Test
        public void shouldReturnResultDivideIfSecondNumNotZero() {
            int result1 = out.Divide(d, b);
            int result2 = out.Divide(c, a);
            int expResult1 = -2;
            int expResult2 = 4;
            Assertions.assertEquals(result1, expResult1);
            Assertions.assertEquals(result2, expResult2);
        }

        @Test
        public void shouldThrowIllegalArgumentExceptionWhenDivisorIsZero() {
            Assertions.assertThrows(IllegalArgumentException.class,
                    () -> out.Divide(a, e));
        }


}