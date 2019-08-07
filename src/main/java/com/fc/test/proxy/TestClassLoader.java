package com.fc.test.proxy;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;

/**
 * @author lize
 * @date 7/14/19 12:15 PM
 */
public class TestClassLoader extends ClassLoader {
//	private byte[] classByte;
//	public TestClassLoader(byte[] classBtye) {
//		this.classByte = classBtye;
//	}


	@Override
	protected Class<?> findClass(String name) throws ClassNotFoundException {
		name = TestClassLoader.class.getPackage().getName() + "." + name;
//		System.out.println(name);
		String s= TestClassLoader.class.getResource("").getPath() + "$Proxy0.class";
		ByteArrayOutputStream baos = null;
		try {
			FileInputStream fis = new FileInputStream(s);
			baos = new ByteArrayOutputStream();
			byte[] buff = new byte[1024];
			int len;
			while ( (len = fis.read(buff)) != -1) {
				baos.write(buff, 0, len);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return defineClass(name, baos.toByteArray(), 0, baos.size());
	}

	public static void main(String[] args) {
		System.out.println(TestClassLoader.class.getPackage().getName());
		System.out.println(TestClassLoader.class.getResource("").getPath());
	}
}
