package calculate.service.impl;

import calculate.service.ICalculateService;
import org.springframework.stereotype.Service;

@Service
public class CalculateService implements ICalculateService {

    @Override
    public double calculator(double a, double b, String submit) {
        double result;
        switch (submit){
            case "add":
                result = a + b;
                break;
            case "sub":
                result = a - b;
                break;
            case "mul":
                result = a * b;
                break;
            case "div":
                if(b != 0){
                    result = a/b;
                    break;
                } else {
                    throw new RuntimeException("Can't divide by zero");
                }
            default:
                throw new IllegalStateException("Unexpected value: " + submit);
        }
        return result;
    }
}
