package com.fc.test;

import com.fc.test.factory.AMilk;
import com.fc.test.factory.BeanFactory;
import com.fc.test.factory.DefaultBeanFactory;
import com.fc.test.singleton.EnumSingleton;
import com.fc.test.singleton.InnerSingleton;
import com.fc.test.singleton.TestLazy;
import com.fc.test.singleton.TestPrototype;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author lize
 * @date 7/13/19 11:01 PM
 */
public class Test {

	static ExecutorService service = Executors.newFixedThreadPool(10, new ThreadFactoryBuilder().buildThreadName("test-").build());


	public static void main(String[] args) {

		// 并发测试框架
//		TestPrototype prototype = new TestPrototype();
//		prototype.setaMilk(new AMilk());
		CountDownLatch latch = new CountDownLatch(10);
		for (int i=0; i<10; i++) {
			service.execute(() -> {
				try {
					latch.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(System.currentTimeMillis() + " | "
						+ Thread.currentThread().getName() + " | " + InnerSingleton.getInstance());
			});
			latch.countDown();
		}
		service.shutdown();
	}

	private static final class ThreadFactoryBuilder {
		private String name ;

		public ThreadFactoryBuilder buildThreadName(String name) {
			this.name = name;
			return this;
		}

		public ThreadFactory build() {
			final AtomicLong incr = new AtomicLong(0);
			ThreadFactory factory = r -> {
				Thread t = new Thread(r);
				t.setName(ThreadFactoryBuilder.this.name + incr.getAndIncrement());
				return t;
			};
			return factory;
		}
	}
}
