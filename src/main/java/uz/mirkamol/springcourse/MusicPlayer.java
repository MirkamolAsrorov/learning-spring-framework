package uz.mirkamol.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }


    public String playMusic(Genre genre) {
        Random random = new Random();
        if (genre.equals(Genre.CLASSICAL)) {
            return classicalMusic.getSong(random);

        } else if (Genre.ROCK.equals(genre)) {
           return rockMusic.getSong(random);

        }
        return "not found";
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }
}
