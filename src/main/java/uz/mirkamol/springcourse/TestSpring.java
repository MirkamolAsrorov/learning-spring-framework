package uz.mirkamol.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        PopMusic popMusic = context.getBean("musicBean", PopMusic.class);
        PopMusic popMusic2 = context.getBean("musicBean", PopMusic.class);
        System.out.println(popMusic);
        System.out.println(popMusic2);

//        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        firstMusicPlayer.playMusic();
//        System.out.println("Name: " + firstMusicPlayer.getName());
//        System.out.println("Volume: " + firstMusicPlayer.getVolume());
//
//
//        boolean comaprison = firstMusicPlayer == secondMusicPlayer;
//        System.out.println("is it same?: " + comaprison);
//
//
//        System.out.println(firstMusicPlayer);
//        System.out.println(secondMusicPlayer);
//
//        firstMusicPlayer.setVolume(10);
//        secondMusicPlayer.setVolume(10);
//
//        System.out.println(firstMusicPlayer.getVolume());
//        System.out.println(secondMusicPlayer.getVolume());


        context.close();
    }
}
