package uz.mirkamol.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

//@Component
public class RockMusic implements Music{

    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
