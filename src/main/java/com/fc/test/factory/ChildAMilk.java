package com.fc.test.factory;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author lize
 * @date 7/14/19 3:50 PM
 */
public class ChildAMilk extends AMilk {

	public ChildAMilk(String name) {
//		super(name);
//		setTt("mmmm");
//		setThisTt();
//		System.out.println(this.tt);
//		System.out.println(super.tt);
		this.tt = "sub";
	}

	public String getSuperTt() {
		return super.tt;
	}

	public String getSubTt() {
		return this.tt;
	}

//	public void setTt(String name) {
//		super.tt = name;
//	}

	public void setThisTt() {
		this.tt = "subb";
	}

	public String getTt() {
		return tt;
	}

	public static void main(String[] args) throws IOException {
		AMilk test = new ChildAMilk("sssss");
//		ByteArrayOutputStream baos = new ByteArrayOutputStream();
//		ObjectOutputStream oos = new ObjectOutputStream(baos);
//		oos.writeObject(test);
//		oos.close();
//		System.out.println(baos.size());
//		test.setTt("super");
//		System.out.println(test.getSuperTt());
//		System.out.println(test.getTt());
//		System.out.println(test.getSubTt());
//		System.out.println(test.getSuperTt());
		System.out.println(test.getTt());
	}
}
