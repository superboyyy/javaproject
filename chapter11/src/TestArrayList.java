import java.util.ArrayList;

public class TestArrayList {
    public static void main(String args[]) {
        //Create a list to store cities
        ArrayList<String> citylist = new ArrayList<>();

        //Add some cities in the list
        citylist.add("London");
        //cityList now contains [London]
        citylist.add("Denver");
        //cityList now contains [London, Denver]
        citylist.add("Paris");
        //cityList now contains [London, Denver, Paris]
        citylist.add("Miami");
        //cityList now contains [London, Denver, Paris, Miami]
        citylist.add("Seoul");
        //cityList now contains [London, Denver, Paris, Miami, Seoul]
        citylist.add("Tokyo");
        //cityList now contains [London, Denver, Paris, Miami, Seoul, Tokyo]

        System.out.println("List size? " + citylist.size());
        System.out.println("Is Miami in the list? " + citylist.contains("Miami"));
        System.out.println("The location of Denver in the list? " + citylist.indexOf("Denver"));
        System.out.println("Is the list empty? " + citylist.isEmpty());//print false

        //Insert a new city at index 2
        citylist.add(2, "Xian");
        //Contains [London, Denver, Xian, Paris, Miami, Seoul, Tokyo]

        //Remove a city from the list
        citylist.remove("Miami");
        //Contains [London, Denver, Xian, Paris, Seoul, Tokyo]

        //Remove a city at index 1
        citylist.remove(1);
        //Contains [London, Xian, Paris, Seoul, Tokyo]

        //Display the contents in the list
        System.out.println(citylist.toString());

        //Display the contents in the list in reverse order
        for (int i = citylist.size() - 1; i >= 0; i--) {
            System.out.print(citylist.get(i) + " ");
        System.out.println();
        }
    }
}
