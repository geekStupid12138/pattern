package com.fc.test.singleton;

/**
 * @author lize
 * @date 7/14/19 12:04 AM
 * 静态内部类 利用内部类的加载机制实现懒加载 同时因为类加载的双亲委派机制确保了线程安全
 */
public class InnerSingleton {

	private InnerSingleton() {}

	public static InnerSingleton getInstance() {
		return LAZY_HOLDER.INSTANCE;
	}

	private static final class LAZY_HOLDER {
		private static final InnerSingleton INSTANCE = new InnerSingleton();
	}
}
