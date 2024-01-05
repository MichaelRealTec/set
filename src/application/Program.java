package application;

import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {
		Set<String> set = new TreeSet<>();
		
		set.add("TV");
		set.add("Tablet"); 
		set.add("Notebook");
		// TreeSet ordena os dados por ordem alfabetica
		// TV esta na frente porque o V é maiusulo é tem prioridade o Maiusculo sobre o Minusculo
		
		set.remove("Table");
		// Remove "Table" da lista		
		for(String p : set) {
			System.out.println(p);
		}
		

	}

}
