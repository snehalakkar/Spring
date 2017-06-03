package com.bridgeLabz.ConsInjectionOfMap;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import java.util.Set;

public class MapImplementation {
	private String comname;
	private int ranking;
	private Map<classA, ClassB> mp;

	public MapImplementation(String comname, int ranking, Map<classA, ClassB> mp) {
		super();
		this.comname = comname;
		this.ranking = ranking;
		this.mp = mp;
	}

	public void show() {
		System.out.println(comname + " " + ranking);
		System.out.println("Map details are :");
		Set<Entry<classA, ClassB>> set = mp.entrySet();
		Iterator<Entry<classA, ClassB>> itr = set.iterator();
		while (itr.hasNext()) {
			Entry<classA, ClassB> entry = itr.next();
			
			classA a1 = entry.getKey();
			System.out.println("class a details are :"+a1);
			
			ClassB b1 = entry.getValue();
			System.out.println("class b details are: "+b1);
		}
	}

	public MapImplementation() {
	}
}
