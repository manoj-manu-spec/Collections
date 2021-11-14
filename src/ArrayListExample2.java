import java.util.ArrayList;

//Let's see an example to traverse ArrayList elements using the Iterator interface.
//Using While Concept The ArrayList Going traverse and then it is going to print 
public class ArrayListExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		list.add("Manoj");
		list.add("Reddy");
		list.add("Sane");
		list.add("Kumar");
		java.util.Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
