package pro.sky.java.course2.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.calculator.service.Service;

@RestController
public class Controller {

    private final Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @GetMapping
    public String welcomeCalculator() {
        return service.welcomeCalculator();
    }

    @GetMapping(path="/calculator/plus")
    public String addition(@RequestParam int num1, @RequestParam int num2){
        return service.addition(num1, num2);
    }

    @GetMapping(path="/calculator/minus")
    public String substraction(@RequestParam int num1, @RequestParam int num2){
        return service.substraction(num1, num2);
    }

    @GetMapping(path="/calculator/multiply")
    public String multiplication(@RequestParam int num1, @RequestParam int num2){
        return service.multiplication(num1, num2);
    }

    @GetMapping(path="/calculator/divide")
    public String division(@RequestParam int num1, @RequestParam int num2){
        return service.division(num1, num2);
    }
}
