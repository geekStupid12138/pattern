package com.fc.test.proxy;

/**
 * @author lize
 * @date 7/14/19 8:03 AM
 */
public class TestImpl implements ITest {
	@Override
	public void doSomething() {
		System.out.println("just for test.");
	}

	@Override
	public String getSomething(String sth) {
		System.out.println("impl" + sth);
		return sth;
	}
}
