package Chapter3;

/**
 * Created by Jacob on 1/28/2015.
 */
public class HeartRateRunner {
    public static void main(String[] args) {
        HeartRates Person = new HeartRates(4,12,2013,"Jacob", "Johnson");
        System.out.println(Person.getAge());
        System.out.println(Person.getMaxHR());
        System.out.println(Person.getAvgTHR());
    }
}
