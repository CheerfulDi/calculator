package pro.sky.java.course2.calculator.service;
@org.springframework.stereotype.Service

public class ServiceImpl implements Service {

    public int plus(int num1, int num2) { return num1 + num2;}

    public int minus(int num1, int num2) { return num1 - num2;}

    public int multy(int num1, int num2) { return num1 * num2;}

    public int divide(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("На ноль делить нельзя!");
        }
        return num1 / num2;
    }
}
