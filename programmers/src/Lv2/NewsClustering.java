package Lv2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class NewsClustering {
    public int solution(String str1, String str2) {
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();

        Map<String, Integer> map1 = new HashMap<>();
        for (int i=0; i<str1.length()-1; i++) {
            String sub = str1.substring(i, i+2);

            if (sub.matches("[A-Z]{2}")) {
                map1.put(sub, map1.getOrDefault(sub, 0) + 1);
            }
        }

        Map<String, Integer> map2 = new HashMap<>();
        for (int i=0; i<str2.length()-1; i++) {
            String sub = str2.substring(i, i+2);

            if (sub.matches("[A-Z]{2}")) {
                map2.put(sub, map2.getOrDefault(sub, 0) + 1);
            }
        }

        int inter = 0;
        int union = 0;
        Set<String> key = new HashSet<>();
        key.addAll(map1.keySet());
        key.addAll(map2.keySet());

        for (String k : key) {
            inter = inter + Math.min(map1.getOrDefault(k, 0), map2.getOrDefault(k, 0));
            union = union + Math.max(map1.getOrDefault(k, 0), map2.getOrDefault(k, 0));
        }

        if (union == 0) return 65536;
        return (int) Math.floor((inter * 65536) / union);
    }
}
