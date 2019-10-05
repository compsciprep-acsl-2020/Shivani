import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CityNames {
    public static void main(String[] args) {
        List<String> cityNames = new ArrayList<String>();
        cityNames.add("Herndon");
        cityNames.add("Reston");
        cityNames.add("Fairfax");
        cityNames.add("Ashburn");
        cityNames.add("Richmond");
        cityNames.add("Chantilly");
        cityNames.add("Washington DC");
        cityNames.add("New York");
        cityNames.add("San Francisco");
        cityNames.add("Dallas");

        Iterator<String> i = cityNames.iterator();
        while (i.hasNext()) {
            String city = i.next();
            if (city.equals("Herndon")) {
                i.remove();
            }
        }

        for (String city: cityNames) {
            System.out.println(city);
        }
    }
}