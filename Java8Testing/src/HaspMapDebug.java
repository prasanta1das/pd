import java.util.HashMap;
import java.util.Map;

public class HaspMapDebug {

	public static void main(String[] args) {

		String s1="FB";
		String s2="Ea";
		System.out.println(s1.hashCode()+"  "+ s2.hashCode());
		
		Map<String, Integer> map= new HashMap<>();
		
		map.put("aaa", 1);
		map.put("bbb", 3);
		map.put("aaa", 3);
		map.put(s2, 7);
		map.put(s1, 8);
		map.put(null, 6);
		map.put(null, 9);
		
	}

}
