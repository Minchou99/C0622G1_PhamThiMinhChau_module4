package calculate.service.impl;

import calculate.service.ICalculateService;
import org.springframework.stereotype.Service;

@Service
public class CalculateService implements ICalculateService {

    @Override
    public String calculator(double a, double b, String submit) {
        String result = "";
        switch (submit) {
            case "add":
                result = a + b + "";
                break;
            case "sub":
                result = a - b + "";
                break;
            case "mul":
                result = a * b + "";
                break;
            case "div":
                if(b!=0){
                    result = a/b + "";
                }else {
                    result = "Không thể chia hết cho 0";
                }
        }
        return result;
    }
}
