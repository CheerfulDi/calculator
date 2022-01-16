package pro.sky.java.course2.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static pro.sky.java.course2.calculator.CalculatorTestConstants.*;

public class CalculatorServiceParamsTest {

    public static Stream<Arguments> provideParamsForTests() {
        return Stream.of(
                Arguments.of(NUM_1,NUM_2,PLUS_RESULT),
                Arguments.of(NUM_1, NUM_2, MINUS_RESULT),
                Arguments.of(NUM_1,NUM_2,MULTY_RESULT),
                Arguments.of(NUM_1,NUM_2, DIVIDE_RESULT)
                );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldReturnCorrectResultAfterPlus(int num1, int num2) {
        int result = num1 + num2;
        Assertions.assertEquals(PLUS_RESULT, result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldReturnCorrectResultAfterMinus(int num1, int num2) {
        int result = num1 - num2;
        Assertions.assertEquals(MINUS_RESULT, result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldReturnCorrectResultAfterMulty(int num1, int num2) {
        int result = num1 * num2;
        Assertions.assertEquals(MULTY_RESULT, result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldReturnCorrectResultAfterDivide(int num1, int num2) {
        int result = num1 / num2;
        Assertions.assertEquals(DIVIDE_RESULT, result);
    }
}
