package work.home.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;
    private NumberDto dto = new NumberDto();

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String hello() {
        return calculatorService.hello();
    }

    @GetMapping(path = "plus")
    public String plus(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        dto.setNum1(num1);
        dto.setNum2(num2);
        if (calculatorService.check(dto.getNum1(), dto.getNum2())) {
            return "Вы должны ввести оба аргумента!";
        }

        int result = calculatorService.plus(dto.getNum1(), dto.getNum2());
        return dto.getNum1() + " + " + dto.getNum2() + " = " + result;
    }

    @GetMapping(path = "minus")
    public String minus(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        dto.setNum1(num1);
        dto.setNum2(num2);
        if (calculatorService.check(dto.getNum1(), dto.getNum2())) {
            return "Вы должны ввести оба аргумента!";
        }

        int result = calculatorService.minus(dto.getNum1(), dto.getNum2());
        return dto.getNum1() + " - " + dto.getNum2() + " = " + result;
    }

    @GetMapping(path = "multiply")
    public String multiply(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        dto.setNum1(num1);
        dto.setNum2(num2);
        if (calculatorService.check(dto.getNum1(), dto.getNum2())) {
            return "Вы должны ввести оба аргумента!";
        }

        int result = calculatorService.multiply(dto.getNum1(), dto.getNum2());
        return dto.getNum1() + " * " + dto.getNum2() + " = " + result;
    }

    @GetMapping(path = "divide")
    public String divide(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        dto.setNum1(num1);
        dto.setNum2(num2);
        if (calculatorService.check(dto.getNum1(), dto.getNum2())) {
            return "Вы должны ввести оба аргумента!";
        }
        if (dto.getNum2() == 0) {
            return "На ноль делить нельзя!";
        }

        int result = calculatorService.divide(dto.getNum1(), dto.getNum2());
        return dto.getNum1() + " / " + dto.getNum2() + " = " + result;
    }
}
