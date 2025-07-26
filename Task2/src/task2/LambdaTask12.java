package task2;

import java.util.*;

public class LambdaTask12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names = Arrays.asList("Akshay", "Kiran", "Subhash", "Kumar", "Ganesh", "Kush");
		
		names.forEach(System.out::println);
		
		System.out.println("-----------");
		
		names.stream()
		    .filter(name -> name.startsWith("K"))
		    .forEach(name -> System.out.println("Start with K: " + name));
		
		System.out.println("-----------");
		
		names.stream().sorted().forEach(name -> System.out.println("Sorted: " + name));
	}

}
