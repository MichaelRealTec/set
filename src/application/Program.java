package application;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {
		Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));
		
		System.out.println("Conjunto a: " + a);
		System.out.println("--------------------------------");
		System.out.println("Conjunto b: " + b);
		System.out.println("================================");
		
		// Union ou união
		Set<Integer> c = new TreeSet<>(a);
		c.addAll(b);
		System.out.
		println("Union: " + c);
		
		// Intersection ou interceção
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b);
		System.out.println("Intersection: " + d);
		
		// Difference ou diferença
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b);
		System.out.println("Difference: " + e);
		

	}

}
