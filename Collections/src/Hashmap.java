import java.util.HashMap;
import java.util.Map;

public class Hashmap {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Neeraj sir");
		map.put(2, "Saurav");
		map.put(3, "Indal");
		map.put(4, "Gunank");
		map.put(5, "Amit");
		map.put(6, "Shiva");

		for (String o : map.values()) {
			System.out.println("VALUE :-" + o);
		}
		System.out.println("-----------------------------------");
		for(Integer o:map.keySet()){
			System.out.println("KEY :-"+o);
		}
	
	}
}
