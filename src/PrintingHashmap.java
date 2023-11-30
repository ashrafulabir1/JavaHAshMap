import java.util.HashMap;
import java.util.Map;

public class PrintingHashmap {
	public static Map<String, Integer> mapFunction(String x, Integer y) {
	  Map<String, Integer> map = new HashMap<String, Integer>();
	    map.put("Alice", 25);
	    map.put("Bob", 30);
	    map.put("Charlie", 35);
	    map.put(x, y);

	    for (Map.Entry<String, Integer> entry : map.entrySet()) {
	      System.out.println(entry.getKey() + ": " + entry.getValue());
	    }
		return map;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> actualHashMap = null;
		try {
			actualHashMap = mapFunction("Abir",25);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		System.out.print("Value="+actualHashMap.values()+"\n");
		System.out.print("Key="+actualHashMap.keySet()+"\n");
		System.out.print("Ful map including values and key="+actualHashMap+"\n");
	}

}
