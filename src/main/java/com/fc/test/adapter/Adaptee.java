package com.fc.test.adapter;

/**
 * @author lize
 * @date 7/14/19 6:02 PM
 */
public class Adaptee extends Adapter implements ITarget {
	@Override
	public void doSomething() {
		System.out.println("Adaptee");
		doThing();
	}

	public static void main(String[] args) {
		ITarget adapt = new Adaptee();
		adapt.doSomething();
	}
}
