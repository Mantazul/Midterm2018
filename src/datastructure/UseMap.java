package datastructure;
import java.util.*;
public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

		List<String> BakeryList = new ArrayList<String>();
		BakeryList.add("Black Forest cake");
		BakeryList.add("Red velvet cake");
		BakeryList.add("Croissants");
		BakeryList.add("Danish");
		BakeryList.add("Vanilla cake");

		List<String> RestaurantList = new ArrayList<String>();
		RestaurantList.add("Khichuri");
		RestaurantList.add("Biriyani");
		RestaurantList.add("Kacchi");
		RestaurantList.add("Spaghetti");
		RestaurantList.add("Polao");

		Map<String, List<String>> menu = new HashMap<String, List<String>>();
		menu.put("Maria Bakery",BakeryList);
		menu.put("Aladin Restaurants",RestaurantList);

		System.out.println("Printing Hashmap using For Each Loop");
		for(Map.Entry<String,List<String>> printMenu: menu.entrySet()){
			System.out.println(printMenu.getKey()+" ---> "+printMenu.getValue());
		}
		System.out.println("\n---------------------------------------\n");
		System.out.println("Printing Hashmap using Iterator");
		Iterator<Map.Entry<String,List<String>>> it = menu.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry<String,List<String>> pair = it.next();
			System.out.println(pair.getKey()+" --> "+pair.getValue());
		}
	}

}
