package lesson11.labs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Prob4 {
    public static double sum(Collection<? extends Number> nums) {
        double s = 0.0;
        for(Number num : nums) s += num.doubleValue();
        return s;
    }


//    a. Is there a compiler error in the following lines of code? If so, where?
    // Yes, it has a error on nums.add(3.14) because extends have put rule: can not put except null
   public static void A() {
       List<Integer> ints = new ArrayList<>();
       ints.add(1);
       ints.add(2);
       List<? extends Number> nums = ints;
       double dbl = sum(nums);
//       nums.add(3.14);  // compiler error
   }

//   b. there a compiler error in the following lines of code? If so, where?
//    yes because super rule: can not get except object, sum requires integers array not object array
   public static void B() {
       List<Object> objs = new ArrayList<>();
       objs.add(1);
       objs.add("two");
       List<? super Integer> ints = objs;
       ints.add(3);
//       double dbl = sum(ints); // compiler error

   }
}
