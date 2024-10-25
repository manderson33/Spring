package calculator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CalculatorController {

    @GetMapping("/calculator")
    public String calculatorForm(Model model) {
        return "calculator";  // Refers to calculator.html
    }

    @PostMapping("/calculate")
    public String calculate(
            @RequestParam("number1") double number1,
            @RequestParam("number2") double number2,
            @RequestParam("operation") String operation,
            Model model) {

        double result;
        switch (operation) {
            case "add":
                result = number1 + number2;
                break;
            case "subtract":
                result = number1 - number2;
                break;
            case "multiply":
                result = number1 * number2;
                break;
            case "divide":
                result = number2 != 0 ? number1 / number2 : 0;
                break;
            default:
                throw new IllegalArgumentException("Invalid operation");
        }

        model.addAttribute("result", result);
        return "calculator";  // Refers to calculator.html
    }
}