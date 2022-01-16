package pro.sky.java.course2.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class CalculatorServiceTest {


    @Test
    public void shouldReturnCorrectResultAfterPlus() {

       int num1 = 3;
       int num2 = 6;

       int result = num1 + num2;
       Assertions.assertEquals(9,result);

    }

    @Test
    public void shouldReturnCorrectResultAfterMinus() {

        int num1 = 3;
        int num2 = 2;

        int result = num1 - num2;
        Assertions.assertEquals(1,result);

    }

    @Test
    public void shouldReturnCorrectResultAfterMulty() {

        int num1 = 3;
        int num2 = 2;

        int result = num1 * num2;
        Assertions.assertEquals(6,result);

    }

    @Test
    public void shouldReturnCorrectResultAfterDivide() {

        int num1 = 9;
        int num2 = 3;

        int result = num1 / num2;
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
