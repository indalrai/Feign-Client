import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> set=new HashSet<String>();
		
		set.add("Indal");
		set.add("Varun");
		set.add("Abhishek");
		set.add("1985");
		set.add("456");
		
//		Iterator<String> itr=set.iterator();
//		while(itr.hasNext()){
//			String a=itr.next();
//			System.out.println(a);
		
//		}
		
//		for(String o:set){
//			System.out.println(o);
//		}
		
		set.stream().forEach((a)->System.out.println(a));
		

	}

}
