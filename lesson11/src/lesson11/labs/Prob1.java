package lesson11.labs;

import java.util.ArrayList;
import java.util.List;

public class Prob1 {

    public static void main(String[] arg) {
        prob1A();
    }

    // on line number 18 List<Number> nums = ints; can not assign the values of sub class arraylist to any other/ super class list.
    private static void prob1A() {
//        List<Integer> ints = new ArrayList<>();
//        ints.add(1);
//        ints.add(2);
//        List<Number> nums = ints;
//        nums.add(3.14);14
    }

    // first line number 24 new keyword is not there to initialize the list
    // on line 28 List<? extends Number> nums = ints; now it is readable no insert/add functionality can be done.
    private static void prob1B() {
//        List<Integer> ints =new  ArrayList<>();
//        ints.add(1);
//        ints.add(2);
//        List<? extends Number> nums = ints;
//        nums.add(3.14);
    }
}
