package com.fc.test.proxy;

import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import sun.misc.ProxyGenerator;

import javax.swing.border.EmptyBorder;
import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.*;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.nio.*;
import java.nio.charset.Charset;

/**
 * @author lize
 * @date 7/14/19 8:03 AM
 *
 * 面向对象
 * 设计模式 ： 隔离变化点
 * 开闭原则
 * 历史替换原则
 * 单一职责
 * 最小知道原则
 * hard code
 */
public class ProxySubject implements InvocationHandler {
	private ITest test;

	public ProxySubject() {
		System.out.println("construct...");
	}

	{
		System.out.println("code bundle...");
	}

	public ProxySubject(ITest test) {
		this.test = test;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		long startTime = System.currentTimeMillis();
		try {

//		System.out.println(proxy);
			return method.invoke(test, args);
//		if (method.getName().equals("getSomething")) {
//			System.out.println(retObj);
//			System.out.println(retObj instanceof String);
//		}
//		System.out.println(method.getReturnType() == void.class);
//		return null;
		} finally {
			System.out.println(System.currentTimeMillis() - startTime);
		}
	}

	public static void main(String[] args) throws IOException {
		ITest tt = new TestImpl();
		ITest test =  (ITest) Proxy.newProxyInstance(tt.getClass().getClassLoader(),
				tt.getClass().getInterfaces(), new ProxySubject(tt));

		test.doSomething();
//		System.out.println();
//		test.getSomething("test");
//		System.out.println();
//		System.out.println(Void.TYPE == void.class);
//		System.out.println(test.getClass());
//		System.out.println(tt);
//		TestImpl enhancer = (TestImpl) Enhancer.create(TestImpl.class, new ProxySubject(new TestImpl()));
//		String s = enhancer.getSomething("test");
//		System.out.println(s);
//		byte[] classByte = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{ITest.class});
//		System.out.println(new String(classByte, Charset.forName("utf-8")));
//		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + File.separator + "$Proxy0.class");
//		System.out.println(System.getProperty("user.dir"));
//		String s= TestClassLoader.class.getResource("").getPath() + "$Proxy0.class";
//			System.out.println(s);
//		FileOutputStream fos = new FileOutputStream(s);
//		fos.write(classByte);
//		int len = 0;
//		byte[] buff = new byte[1024];
//		while ((len = fis.read(buff)) != -1) {
//			fos.write(buff);
//		}
//		fos.flush();
//		fos.close();
//		try {
//			Class clazz = new TestClassLoader().findClass("$Proxy0");
//			System.out.println(clazz);
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
//		new ProxySubject();
//		System.out.println(ProxySubject.class);

	}

	private String test() {
		String str ;
		try {
			str = "222";
			return str;
		} finally {
			str = "1111";
		}
	}

	public void tes() {
		return ;
	}

//	@Override
//	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
//		System.out.println(method.getName());
//		System.out.println(proxy.getSuperName());
//		System.out.println(proxy.getSignature());
//		method.invoke(test, args);
//		// 记得invoke super
//		return proxy.invokeSuper(obj, args);
//	}
}
