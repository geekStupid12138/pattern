package com.fc.test.observe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author lize
 * @date 7/14/19 6:26 PM
 * 被观察对象
 */
public class Observed extends EvenListener implements Cloneable, Comparable<Observed>{

	private String name ;
	private int id ;

	public Observed(int id) {
		this.name = "test Observer";
		this.id = id;
		addListener(EventType.ADD, new DefaultWatcher());
	}

	public void add() {
		System.out.println("observed ...");
		trigger(EventType.ADD);
	}

	public static void main(String[] args) {
//		Observed obj = new Observed();
//		obj.add();
		List<Observed> list = new ArrayList<>();
		list.add(new Observed(2));
		list.add(new Observed(3));
		list.add(new Observed(1));
		list.add(new Observed(2));
		Collections.sort(list);
		Collections.reverse(list);
		list.stream().forEach(o -> System.out.println(o.id));
//		list.stream().sorted(Comparator.comparingInt(a -> a.id)).forEach(o -> System.out.println(o.id));
	}

	public String getName() {
		return name;
	}

	public Observed clone() {
		try {
			return (Observed) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public int compareTo(Observed o) {
		return this.id - o.id;
	}
}
