package practisejava;

import java.util.HashMap;
import java.util.Map;

public class JavaMap {

	public static void main(String[] args) {
	Map<Integer,String>map=new HashMap<Integer,String>();
	map.put(100, "Preetish");
	map.put(101, "Nikhil");
	map.put(102, "Saroj");
	map.put(100, "Shiba");
	map.put(103, "Nikhil");
	map.put(null, "Sumant");
	map.put(104, null);
	//map.put(null, "Smruti");allows only one null key if providing multiple it will consider the latest one old one updated
	//map.put(105, null);
	//map.remove(100);
	//map.remove(100,"Preetish");
	
	
	for(Map.Entry m:map.entrySet()) {
		System.out.println(m.getKey()+" "+m.getValue());
	}
	
	/*HashMap<Integer,String>mp=new HashMap<Integer,String>();
	mp.put(105, "Abhinash");
	mp.putAll(map);
	for(Map.Entry m:mp.entrySet()) {
		System.out.println(m.getKey()+" "+m.getValue());
	}*/
	
	
	}

}
