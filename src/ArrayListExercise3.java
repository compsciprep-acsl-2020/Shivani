import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ArrayListExercise3  {
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

        List<String> randomObjectsStars = new ArrayList<String>();
        for (int index = 1; index <= randomObjects.size(); index++) {
            //randomObjectsStars.add(randomObjects.get(index), "*");
        }

        System.out.println(randomObjects);

        List<String> randomObjectsStarsRemoved = new ArrayList<String>();
        for (int index = 1; index <= randomObjects.size(); index++) {
            randomObjectsStarsRemoved.remove(index);
        }

        System.out.println(randomObjects);
    }
}