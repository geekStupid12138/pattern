package com.fc.test.singleton;

/**
 * @author lize
 * @date 7/13/19 11:26 PM
 * 恶汉最简单了 该类加载的时候就初始化了
 */
public class TestE {
	private static final TestE INSTANCE = new TestE();
	private TestE() {}

	public static TestE getInstance() {
		return INSTANCE;
	}
}
