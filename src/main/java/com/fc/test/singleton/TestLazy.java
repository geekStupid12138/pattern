package com.fc.test.singleton;

/**
 * @author lize
 * @date 7/13/19 11:29 PM
 */
public class TestLazy {
	/*
		遵循良好的编码习惯 属性在上 方法在下
		set/get在最下，  私有在下 公有在上
		注释写明
	 */
	private static TestLazy lazy ;

	public static TestLazy getInstance() {
		if (lazy == null) {
			synchronized (TestLazy.class) {
				if (lazy == null) {
					lazy = new TestLazy();
				}
			}
		}
		return lazy;
	}

	private TestLazy(){}
}
