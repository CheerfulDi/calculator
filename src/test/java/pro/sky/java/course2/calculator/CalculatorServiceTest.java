package pro.sky.java.course2.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class CalculatorServiceTest {


    @Test
    public void shouldReturnCorrectResultAfterPlus() {

       int result = 3 + 6;
       Assertions.assertEquals(9,result);

    }

    @Test
    public void shouldReturnCorrectResultAfterMinus() {

        int result = 3 - 2;
        Assertions.assertEquals(1,result);

    }

    @Test
    public void shouldReturnCorrectResultAfterMulty() {

        int result = 3 * 2;
        Assertions.assertEquals(6,result);

    }

    @Test
    public void shouldReturnCorrectResultAfterDivide() {

        int result = 9 / 3;
        Assertions.assertEquals(3,result);

    }

    @Test
    public void shouldThrowExceptionIfNum2IsNullAfterDivide() {

        int num1 = 9;
        int num2 = 0;


        Assertions.assertThrows(IllegalArgumentException.class, ()-> divide(num1, num2), "На ноль делить нельзя!");

    }

    public int divide(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("На ноль делить нельзя!");
        }
        return num1 / num2;
    }


}
