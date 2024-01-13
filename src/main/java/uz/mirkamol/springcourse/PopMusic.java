package uz.mirkamol.springcourse;

import org.springframework.stereotype.Component;

import java.util.Random;


public class PopMusic implements Music{
    public void doMyInit(){
        System.out.println("Doing my initialization");
    }

    public void doMyDestroy(){
        System.out.println("Doing my destruction");
    }
    @Override
    public String getSong(Random random) {
        return "Blinding Lights";
    }
}
