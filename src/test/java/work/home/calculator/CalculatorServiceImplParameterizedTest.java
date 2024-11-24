package work.home.calculator;

import net.bytebuddy.asm.MemberSubstitution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculatorServiceImplParameterizedTest {

    CalculatorServiceImpl calculatorServiceImpl = new CalculatorServiceImpl();
    private static Stream<Arguments> argumentsProvider(){

        return Stream.of(
                Arguments.of(20,1),
                Arguments.of(13,14),
                Arguments.of(43,1565),
                Arguments.of(4245,125),
                Arguments.of(2525,2634)
                );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void plus(int num1,int num2) {
        int result = num1+num2;

        Integer actualResult =  calculatorServiceImpl.plus(num1,num2);

        Assertions.assertEquals(result,actualResult);
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void minus(int num1,int num2) {
        int result = num1-num2;

        Integer actualResult =  calculatorServiceImpl.minus(num1,num2);

        Assertions.assertEquals(result,actualResult);
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void multiply(int num1,int num2) {
        int result = num1*num2;

        Integer actualResult =  calculatorServiceImpl.multiply(num1,num2);

        Assertions.assertEquals(result,actualResult);
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void divide(int num1,int num2) {
        int result = num1/num2;

        Integer actualResult =  calculatorServiceImpl.divide(num1,num2);

        Assertions.assertEquals(result,actualResult);
    }

}
