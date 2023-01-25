import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Create an ArrayList using Generics here
        ArrayList<Float> random = new ArrayList<>();
        random.add(2F);
        random.add(4F);
        random.add(5F);
        random.add(10F);
        random.add(99.9F);
        printArray(random);
    }

    public static void printArray(ArrayList<Float> random) {
        // Complete the method declaration here
        for (Float element : random) {
            System.out.println(element);
        }
    }
}