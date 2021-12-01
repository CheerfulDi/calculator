package pro.sky.java.course2.calculator.service;
@org.springframework.stereotype.Service

public class ServiceImpl implements Service{
    public String welcomeCalculator() {
        return "Welcome to the calculator";
    }

    public String addition(int num1, int num2) {
        return num1 + " + " + num2 + " = " + plus(num1,num2);
    }

    public int plus(int num1, int num2) {
        return num1 + num2;
    }

    public String substraction(int num1, int num2) {
        return num1 + " - " + num2 + " = " + minus(num1,num2);
    }

    public int minus(int num1, int num2) {
        return num1 - num2;
    }

    public String multiplication(int num1, int num2) {
        return num1 + " * " + num2 + " = " + multy(num1,num2);
    }

    public int multy(int num1, int num2) {
        return num1 * num2;
    }

    public String division(int num1, int num2) {
        return num1 + " / " + num2 + " = " + divide(num1,num2);
    }

    public int divide(int num1, int num2) {
        return num1 / num2;
    }
}
