package pro.sky.java.course2.homework.webcalculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalcServiceImpl implements CalculatorService{
    @Override
    public String greetings() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public String additionNum(int num1, int num2) {
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }

    @Override
    public String subtractionNum(int num1, int num2) {
        return num1 + " - " + num2 + " = " + (num1 - num2);
    }

    @Override
    public String multiplicationNum(int num1, int num2) {
        return num1 + " * " + num2 + " = " + (num1 * num2);
    }

    @Override
    public String divisionNum(int num1, int num2) {
        if (num1 == 0 || num2 == 0) {
            return "На ноль делить нельзя";
        } else {
            return num1 + " / " + num2 + " = " + num1/num2;
        }
    }
}
