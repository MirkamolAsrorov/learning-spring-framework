package uz.mirkamol.springcourse;

import org.springframework.stereotype.Component;


public class PopMusic implements Music{
    public void doMyInit(){
        System.out.println("Doing my initialization");
    }

    public void doMyDestroy(){
        System.out.println("Doing my destruction");
    }
    @Override
    public String getSong() {
        return "Blinding Lights";
    }
}
