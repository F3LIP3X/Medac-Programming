package practicasMapas1;

import java.util.ArrayList;
import java.util.HashMap;

public class Mapas {

	public static void main(String[] args) {
		HashMap<Integer, String> mapa = new HashMap<Integer, String>();
		HashMap<Integer, String> mapa2 = new HashMap<Integer, String>();
		
		mapa.put(1, "Enrique");
		mapa.put(2, "Jose");
		mapa.put(3, "Felipe");
		mapa.put(4, "Raul");
		
//		mapa2.put(5, "Miguel");
//		
//		for(Map.Entry i:mapa.entrySet()) {
//			System.out.println(i.getKey());
//			System.out.println(i.getValue());
//		}
//		System.out.println(mapa.size());
//		mapa2.putAll(mapa);
//		System.out.println(mapa.isEmpty());
//		mapa2.clear();
//		
		System.out.println(mapa.get(2));
		System.out.println(mapa.containsKey(9));
		System.out.println(mapa.values());
		
		ArrayList<String> arra=new ArrayList<String>();
		
		arra.addAll(mapa.values());
		System.out.println(mapa.values());
		mapa.remove(1);
		System.out.println(mapa.get(1));
		
		
	}

}
