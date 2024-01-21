package uz.mirkamol.springcourse;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Random;

//@Component
public class PopMusic implements Music {
    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }

    @Override
    public String getSong() {
        return "UPTOWN FANK";
    }
}
