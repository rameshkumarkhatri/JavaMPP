package lesson10.labs.prob6;

public class Sol6a {
    public static void main(String[] arg){

    }

    public void queueNotThreadSafe() {
        for(int i =0; i<500; i++){
            addToQueue();
        }
    }

    private void addToQueue() {

    }
}
