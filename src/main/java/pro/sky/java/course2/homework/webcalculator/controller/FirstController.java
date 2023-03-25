package pro.sky.java.course2.homework.webcalculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.homework.webcalculator.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class FirstController {
    private final CalculatorService calculatorService;

    public FirstController( CalculatorService calculatorService ) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String greeting() { return calculatorService.greetings(); }

    @GetMapping(path = "/plus")
    public String additionNum(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.additionNum(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String subtractionNum(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.subtractionNum(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public String multiplicationNum(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.multiplicationNum(num1, num2);
    }

    @GetMapping(path = "/divide")
    public String divisionNum (@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.divisionNum(num1, num2);
    }
}
