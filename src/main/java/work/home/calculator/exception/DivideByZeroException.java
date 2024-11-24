package work.home.calculator.exception;

public class DivideByZeroException extends IllegalArgumentException{
    public DivideByZeroException(String s) {
        super(s);
    }
}
