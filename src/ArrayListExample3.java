import java.util.ArrayList;


/*
 * Iterating ArrayList using For-each loop
 * Let's see an example to traverse the ArrayList elements using the for-each loop
*/

public class ArrayListExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		list.add("Java");
		list.add("Spring Frame Work");
		list.add("Spring Boot");
		list.add("Sql");
		list.add("This");
		
	for(String fruit:list) {
		System.out.println(fruit);
	}
		
	}

}
