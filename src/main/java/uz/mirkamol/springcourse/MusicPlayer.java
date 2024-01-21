package uz.mirkamol.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//@Component
public class MusicPlayer {

    private List<Music> musicList = new ArrayList<>();

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public String playMusic(Genre genre) {
       Random random = new Random();
        int randomMusicGenre = random.nextInt(musicList.size());
        Music music = musicList.get(randomMusicGenre);
        return "Playing " + music.getSong() +
                " with " + volume + " volume";
    }


}
