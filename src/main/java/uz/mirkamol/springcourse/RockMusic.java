package uz.mirkamol.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component
public class RockMusic implements Music{
    private List<String> playList = new ArrayList<>(
            Arrays.asList("Wind cries Mary",
                    "STAIRWAY TO HEAVEN",
                    "WHOLE LOTTA LOVE"));
    @Override
    public String getSong(Random random) {
        if (playList == null || playList.isEmpty()) {
            throw new IllegalArgumentException("ArrayList is null or empty");
        }

        int randomIndex = random.nextInt(playList.size());

        return playList.get(randomIndex);
    }
}
