package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapToList {
public static void main(String[] args) {
	Map<String, String> hm = new HashMap<String,String>();
	hm.put("1", "a");
	hm.put("2", "b");
	hm.put("3", "c");
	
	List<String> keyList = new ArrayList<String>(hm.keySet());
	List<String> valueList = new ArrayList<String>(hm.values());
	
	System.out.println(keyList);
	System.out.println(valueList);
}
}
