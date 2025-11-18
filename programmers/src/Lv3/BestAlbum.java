package Lv3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Song {
    int index;
    int play;

    Song(int index, int play) {
        this.index = index;
        this.play = play;
    }
}

public class BestAlbum {
    public int[] solution(String[] genres, int[] plays) {
        // 장르별 총 재생 수
        Map<String, Integer> genrePlaySum = new HashMap<>();
        // 장르별 곡 리스트
        Map<String, List<Song>> genreSongs = new HashMap<>();

        for (int i=0; i<genres.length; i++) {
            genrePlaySum.put(genres[i], genrePlaySum.getOrDefault(genres[i], 0) + plays[i]);

            genreSongs.putIfAbsent(genres[i], new ArrayList<>());
            genreSongs.get(genres[i]).add(new Song(i, plays[i]));
        }

        List<String> genreOrder = new ArrayList<>(genrePlaySum.keySet());
        genreOrder.sort((a, b) -> genrePlaySum.get(b) - genrePlaySum.get(a));

        List<Integer> result = new ArrayList<>();
        for (String genre : genreOrder) {
            List<Song> songs = genreSongs.get(genre);

            songs.sort((a, b) -> {
                if (a.play == b.play) {
                    return a.index - b.index;
                }
                return b.play - a.play;
            });

            result.add(songs.get(0).index);
            if (songs.size() > 1) {
                result.add(songs.get(1).index);
            }
        }

        int[] answer = new int[result.size()];
        for (int i=0; i<result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }
}
