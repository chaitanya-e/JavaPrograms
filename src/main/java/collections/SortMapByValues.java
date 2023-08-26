package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortMapByValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> hm = new HashMap<String, String>();
		hm.put("Nepal", "Kathmandu");
		hm.put("India", "New Delhi");
		hm.put("United States", "Washington");
		hm.put("England", "London");
		hm.put("Australia", "Canberra");

		System.out.println(hm);

		List<Map.Entry<String, String>> entries = new ArrayList<Entry<String, String>>(hm.entrySet()); 
		
		Collections.sort(entries, new sortMapEntryValues());
		
		for(Map.Entry<String, String> entry : entries)
		{
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
	}

}

class sortMapEntryValues implements Comparator<Map.Entry<String,String>>
{

	@Override
	public int compare(Entry<String, String> o1, Entry<String, String> o2) {
		// TODO Auto-generated method stub
		return o2.getValue().compareTo(o1.getValue());
	}
	
}
