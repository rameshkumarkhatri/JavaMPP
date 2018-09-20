package lesson8.lab.prob4;

import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Prob4 {

    public int countWords(List<String> words, char c, char d, int len){
        long function = words.stream().filter(x -> x.contains(c+"")).filter(x -> !x.contains(d+"")).filter(x -> x.length()==len).count();
        return Integer.parseInt(String.valueOf(function));
//                OR
//    return  words.stream().fil    ter(x -> x.contains(c+"")).filter(x -> !x.contains(d+"")).filter(x -> x.length()==len).collect(Collectors.toList()).size();
    }
}
