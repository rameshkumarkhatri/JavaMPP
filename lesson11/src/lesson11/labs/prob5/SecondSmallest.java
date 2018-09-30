package lesson11.labs.prob5;

import java.util.List;

public class SecondSmallest {
    public  <T extends Comparable<? super T>> T secondSmallest(List<T> list){
        T fistSmallest = list.get(0);
        T secondSmallest = list.get(1);

        if(fistSmallest.compareTo(secondSmallest)>0) {
            T temp = fistSmallest;
            fistSmallest = secondSmallest;
            secondSmallest = temp;
        }


        for(int i = 2; i < list.size(); ++i) {
            T next = list.get(i);
            if(next.compareTo(fistSmallest)<0) {
                secondSmallest = fistSmallest;
                fistSmallest = next;
            }
            else if(next.compareTo(secondSmallest)<0) {
                secondSmallest = next;
            }

        }
        return secondSmallest;
    }
}
