import java.util.ArrayList;
import java.util.Collections;

public class Sort_ArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(4);
		list.add(3);
		list.add(8);
		list.add(9);
		list.add(1);

		for (Integer o : list) {
			System.out.println("before sorting :-" + o);
		}
		System.out.println("---------------------------------");
		Collections.sort(list, Collections.reverseOrder());
		for (Integer o1 : list) {
			System.out.println("After Sorting:-" + list);
		}
	}

}
