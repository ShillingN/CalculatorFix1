package pro.sky.java.course2.CalculatorFix1.service;

import org.springframework.stereotype.Service;
import pro.sky.java.course2.CalculatorFix1.exception.IllegalArgumentException;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public int Plus(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int Minus(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int Multiply(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int Divide(int num1, int num2) {
        if (num2 != 0) {
            return num1 / num2;
        }
        throw new IllegalArgumentException("Деление на ноль запрещено");
    }
}
