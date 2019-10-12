import java.util.ArrayList;
import java.util.List;

public class CityNamesAmericaIndia {
    public static void main(String[] args) {
        List<String> cityNamesAmerica = new ArrayList<String>();
        cityNamesAmerica.add("Herndon");
        cityNamesAmerica.add("Reston");
        cityNamesAmerica.add("Fairfax");
        cityNamesAmerica.add("Ashburn");
        cityNamesAmerica.add("Richmond");
        cityNamesAmerica.add("Chantilly");
        cityNamesAmerica.add("Washington DC");
        cityNamesAmerica.add("New York");
        cityNamesAmerica.add("San Francisco");
        cityNamesAmerica.add("Dallas");

        List<String> cityNamesIndia = new ArrayList<String>();
        cityNamesIndia.add("Delhi");

        cityNamesAmerica.addAll(cityNamesIndia);

        System.out.println(cityNamesAmerica);
    }
}