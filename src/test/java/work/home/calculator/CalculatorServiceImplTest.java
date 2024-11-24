package work.home.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import work.home.calculator.exception.DivideByZeroException;

public class CalculatorServiceImplTest{
    CalculatorServiceImpl calculatorServiceimpl = new CalculatorServiceImpl();
    @Test
    void plus() {
        int num1=10;
        int num2=5;
        int result = 15;

        Integer actualResult = calculatorServiceimpl.plus(num1,num2);

        Assertions.assertEquals(result,actualResult);
    }

    @Test
    void minus() {
        int num1=10;
        int num2=5;
        int result = 5;

        Integer actualResult = calculatorServiceimpl.minus(num1,num2);

        Assertions.assertEquals(result,actualResult);
    }

    @Test
    void multiply() {
        int num1=10;
        int num2=5;
        int result = 50;

        Integer actualResult = calculatorServiceimpl.multiply(num1,num2);

        Assertions.assertEquals(result,actualResult);
    }

    @Test
    void divide() {
        int num1=10;
        int num2=5;
        int result = 2;

        Integer actualResult = calculatorServiceimpl.divide(num1,num2);

        Assertions.assertEquals(result,actualResult);
    }

    @Test
    void divideException() {
        int num1=10;
        int num2=0;

        Assertions.assertThrows(
                DivideByZeroException.class,
                ()->calculatorServiceimpl.divide(num1,num2)
        );
    }

}
