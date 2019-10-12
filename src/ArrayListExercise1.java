import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ArrayListExercise1  {
    public static void main(String[] args) {
        List<String> randomObjects = new ArrayList<String>();
        randomObjects.add("pen");
        randomObjects.add("pencils");
        randomObjects.add("chairs");
        randomObjects.add("table");
        randomObjects.add("fan");
        randomObjects.add("backpacks");
        randomObjects.add("charger");
        randomObjects.add("plants");
        randomObjects.add("windows");
        randomObjects.add("laptop");

        System.out.println(randomObjects);

        Collections.reverse(randomObjects);

        System.out.println(randomObjects);

        for (int index = 0; index < randomObjects.size(); index++) {
            String word = randomObjects.get(index);
            if (word.endsWith("s")) {
                randomObjects.remove(index);
                index--;
            }
        }

        System.out.println(randomObjects);

        for (int index = 0; index < randomObjects.size(); index++) {
            String word = randomObjects.get(index);
            if (word.endsWith("s")) {
                word = word.toUpperCase();
                index--;
            }
        }

        System.out.println(randomObjects);
    }
}