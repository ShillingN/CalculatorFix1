package pro.sky.java.course2.CalculatorFix1.service;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

import static pro.sky.java.course2.CalculatorFix1.constants.CalculatorServiceTestConstants.*;

class CalculatorServiceImplParameterizedTest {

    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    public static @NotNull Stream<Arguments> provideParamsForTestsAddition() {
        return Stream.of(Arguments.of(A, B, RESULT_PLUS_A_B),
                Arguments.of(C, B, RESULT_PLUS_C_B),
                Arguments.of(D, E, RESULT_PLUS_D_E)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTestsAddition")
    public void shouldReturnResultAddition(int firstParam, int lastParam, int expectedResult) {
        int result = out.Plus(firstParam, lastParam);
        Assertions.assertEquals(result, expectedResult);
    }


    public static @NotNull Stream<Arguments> provideParamsForTestsSubtraction() {
        return Stream.of(Arguments.of(A, B, RESULT_MINUS_A_B),
                Arguments.of(C, B, RESULT_MINUS_C_B),
                Arguments.of(D, E, RESULT_MINUS_D_E)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTestsSubtraction")
    public void shouldReturnResultSubtraction(int firstParam, int lastParam, int expectedResult) {
        int result = out.Minus(firstParam, lastParam);
        Assertions.assertEquals(result, expectedResult);
    }

    public static @NotNull Stream<Arguments> provideParamsForTestsMultiplication() {
        return Stream.of(Arguments.of(A, B, RESULT_MULTIPLY_A_B),
                Arguments.of(D, E, RESULT_MULTIPLY_D_E),
                Arguments.of(D, B, RESULT_MULTIPLY_D_B)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTestsMultiplication")
    public void shouldReturnResultMultiplication(int firstParam, int lastParam, int expectedResult) {
        int result = out.Multiply(firstParam, lastParam);
        Assertions.assertEquals(result, expectedResult);
    }

    public static @NotNull Stream<Arguments> provideParamsForTestsDivision() {
        return Stream.of(Arguments.of(D, A, RESULT_DIVIDE_D_A),
                Arguments.of(C, A, RESULT_DIVIDE_C_A),
                Arguments.of(D, B, RESULT_DIVIDE_D_B)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTestsDivision")
    public void shouldReturnResultDivision(int firstParam, int lastParam, int expectedResult) {
        int result = out.Divide(firstParam, lastParam);
        Assertions.assertEquals(result, expectedResult);
    }
}