package uz.mirkamol.springcourse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );

       MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());
        System.out.println(musicPlayer.playMusic(Genre.ROCK));

//        ClassicalMusic classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);
//        ClassicalMusic classicalMusic2 = context.getBean("classicalMusic", ClassicalMusic.class);
//
//        System.out.print("are they same? ");
//        System.out.println(classicalMusic1 == classicalMusic2);
//
//        PopMusic popMusic = context.getBean("popMusic", PopMusic.class);
////        System.out.println(popMusic);

        context.close();
    }
}
