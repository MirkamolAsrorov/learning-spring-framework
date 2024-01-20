package uz.mirkamol.springcourse;

import org.springframework.stereotype.Component;

import java.util.Random;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class PopMusic implements Music{

    @PostConstruct
    public void doMyInit(){
        System.out.println("Doing my initialization");
    }

    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Doing my destruction");
    }
    @Override
    public String getSong(Random random) {
        return "Blinding Lights";
    }
}
