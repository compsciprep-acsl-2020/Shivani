import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ArrayListExercise4 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);

        List<Integer> list3 = new ArrayList<Integer>();
        for (int index = 0; index <= list1.size(); index++) {
            if (list2.contains(list1.get(index))) {
                list3.add(list1.get(index));
            }
        }

        System.out.println(list3);
    }

}