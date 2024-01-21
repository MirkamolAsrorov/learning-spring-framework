package uz.mirkamol.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

//@Component
//@Scope("prototype")
public class ClassicalMusic implements Music{

    @Override
    public  String getSong() {
    return "Hungarian Rhapsody";
    }
}
