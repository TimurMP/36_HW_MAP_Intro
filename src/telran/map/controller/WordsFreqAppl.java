package telran.map.controller;

import java.util.*;

public class WordsFreqAppl {
    public static void main(String[] args) {
        String[] words = {"kkk", "kkk", "kkk", "kkk", "kkk", "abc", "ab", "aaa", "ab", "aaa", "a", "aaa", "a", "a", "a"};

        printWordsFrequency(words);
    }

    private static void printWordsFrequency(String... words) {
        Map<String, Integer> res = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
//            if (res.containsKey(words[i])) {
//                res.put(words[i], res.get(words[i]) + 1);
//            } else {
//                res.put(words[i], 1);
//            }
//
//            if (res.putIfAbsent(words[i] , 1)!= null){
//                res.put(words[i], res.get(words[i]) + 1);
//            }
//
//            res.computeIfPresent(words[i], (k, v) -> v +1);
//            res.computeIfAbsent(words[i], k -> 1);

            res.merge(words[i], 1, (oldV, v) -> oldV + v);
        }
        System.out.println("Unsorted: ==========");
        res.keySet().forEach(k -> System.out.println(k + " ---> " + res.get(k)));


        System.out.println("Sorted: ==========");
        Comparator<Map.Entry<String, Integer>> comp = new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        };
        List<Map.Entry<String, Integer>> arrL = new ArrayList<>(res.entrySet());
        Collections.sort(arrL, comp);


        arrL.forEach(e -> System.out.println(e.getKey() + " ---> " + e.getValue()));

//        Map<String,Integer> tempTreeMap = new TreeMap<String,Integer>()
//        for (Map.Entry<String, Integer> stringIntegerEntry : arrL) {
//            tempTreeMap.put(stringIntegerEntry.getKey(), stringIntegerEntry.getValue());
//
//        }
//        tempTreeMap.keySet().forEach(k -> System.out.println(k + " ---> " + tempTreeMap.get(k)));
//
//        System.out.println(arrL);
//
//        }


    }
}








