package work.home.calculator;

import org.springframework.stereotype.Service;
import work.home.calculator.exception.DivideByZeroException;
import work.home.calculator.exception.TwoArgumentException;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    public String hello() {
        return "Добро пожаловать в калькулятор!";
    }

    public int plus(int a, int b) {
        if (this.check(a, b)) {
            throw new TwoArgumentException("Вы должны ввести оба аргумента!");
        }

        return a + b;
    }

    public int minus(int a, int b) {
        if (this.check(a, b)) {
            throw new TwoArgumentException("Вы должны ввести оба аргумента!");
        }

        return a - b;
    }

    public int multiply(int a, int b) {
        if (this.check(a, b)) {
            throw new TwoArgumentException("Вы должны ввести оба аргумента!");
        }

        return a * b;
    }

    public int divide(int a, int b) {
        if (this.check(a, b)) {
            throw new TwoArgumentException("Вы должны ввести оба аргумента!");
        }

        if (b==0) {
            throw new DivideByZeroException("Делить на ноль нельзя!");
        }

        return a / b;
    }

    public boolean check(Integer a,Integer b){
        return a == null || b == null;
    }

}
