package lesson8.lab.prob1;

import java.util.function.Predicate;

public class MyClass {

    String classUser = "AA";
    String day = "Monday";
    private Predicate<MyClass> predicate1 = p-> this.equals(p);
    private Predicate<MyClass> predicate2 = this::equals;

    public static void main(String[] arg) {
        MyClass myClass = new MyClass();
        System.out.println("Class check using predicate "+myClass.checkForEquals(new MyClass()));
    }

    public MyClass(){}

    @Override
    public boolean equals(Object myClass){
        if(myClass == null) return false;
        if(myClass instanceof MyClass) {
            MyClass myClass1 = ((MyClass) myClass);
            return  this.day.equals(myClass1.day) && this.classUser.equals(myClass1.classUser);
        }
        return false;
    }


    public boolean checkForEquals(MyClass myClass){
        return predicate1.test(myClass);
    }
}
