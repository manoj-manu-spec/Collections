import java.util.ArrayList;

/*
 * Get and Set ArrayList
 * The get() method returns the element at the specified index, whereas the set() method changes the element.
 */

public class ArrayListExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		list.add("Support");
		list.add("No");
		list.add("Needed");
		list.add("work");
		list.add("go");
		System.out.println("The Changing element Is:"+list.get(1));
		//it will return the 2nd element, because index starts from 0  
		list.set(1, "Yes");
		System.out.println("The Changed element is:"+list.get(1));
		for(String manoj:list) {
			System.out.println(manoj);
		}
	}

}
