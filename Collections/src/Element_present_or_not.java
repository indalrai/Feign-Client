import java.util.ArrayList;
import java.util.Scanner;

public class Element_present_or_not {

	public static void main(String[] args) {
		System.out.println("Enter the Element/value");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(1);
		list.add(2);
		list.add(4);
		list.add(3);
		list.add(5);

		if (list.indexOf(a)>=0) {
			System.out.println("Element/value exist in table");
		} else {
			System.out.println("Element/value not Exist");
		}

	}

}
