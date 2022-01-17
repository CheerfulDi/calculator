package pro.sky.java.course2.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static pro.sky.java.course2.calculator.CalculatorTestConstants.*;

public class CalculatorServiceParamsTest {

    public static Stream<Arguments> provideParamsForTestPlus() {
        return Stream.of(Arguments.of(NUM_1,NUM_2,PLUS_RESULT));
    }

    public static Stream<Arguments> provideParamsForTestMinus() {
        return Stream.of(Arguments.of(NUM_1, NUM_2, MINUS_RESULT));
    }

    public static Stream<Arguments> provideParamsForTestMulty() {
        return Stream.of(Arguments.of(NUM_1,NUM_2,MULTY_RESULT));
    }

    public static Stream<Arguments> provideParamsForTestDivide() {
        return Stream.of(Arguments.of(NUM_1,NUM_2, DIVIDE_RESULT));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTestPlus")
    public void shouldReturnCorrectResultAfterPlus(int num1, int num2, int plusResult) {
        int result = num1 + num2;
        Assertions.assertEquals(plusResult, result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTestMinus")
    public void shouldReturnCorrectResultAfterMinus(int num1, int num2, int minusResult) {
        int result = num1 - num2;
        Assertions.assertEquals(minusResult, result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTestMulty")
    public void shouldReturnCorrectResultAfterMulty(int num1, int num2, int multyResult) {
        int result = num1 * num2;
        Assertions.assertEquals(multyResult, result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTestDivide")
    public void shouldReturnCorrectResultAfterDivide(int num1, int num2, int divideResult) {
        int result = num1 / num2;
        Assertions.assertEquals(divideResult, result);
    }
}
