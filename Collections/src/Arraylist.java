import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list=new ArrayList();
		list.add("Indal");
		list.add("Abhishek");
		list.add("Varun");
		list.add("1981");
		list.add("1456");
		
		Iterator<String> itr= list.iterator() ;
		
		while(itr.hasNext()){
			String a=itr.next();
			System.out.println(a);
		}
		
//		for(String o:list){
//			System.out.println(o);
//		}

	}

}
