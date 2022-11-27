import java.util.HashSet;
import java.util.*;
import java.util.Set;

public class Elemenemt_present_or_not_hashset {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc= new Scanner (System.in);
		int a= sc.nextInt();
		
		Set<Integer> set= new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(4);
		set.add(3);
		set.add(9);
		set.add(5);
		
		if(set.contains(a)){
			System.out.println("Element is present");
		}
		else{
			System.out.println("not present");
		}
		

	}

}
