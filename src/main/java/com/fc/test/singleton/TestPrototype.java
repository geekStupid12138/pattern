package com.fc.test.singleton;

import com.fc.test.factory.AMilk;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;

/**
 * @author lize
 * @date 7/14/19 12:11 AM
 */
public class TestPrototype implements Cloneable, Serializable {

	private static final long serialVersionUID = -1861502540672972231L;
	private String aa;
	private int bb;
	private double cc;
	private AMilk aMilk = new AMilk();

	public TestPrototype clone() {
		try {
			return (TestPrototype) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}

	public TestPrototype deepClone() {
		try {
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(baos);
			oos.writeObject(this);
			oos.flush();
			oos.close();
			ByteArrayInputStream bios = new ByteArrayInputStream(baos.toByteArray());
			ObjectInputStream ois = new ObjectInputStream(bios);
			ois.close();
			return (TestPrototype) ois.readObject();
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	public AMilk getaMilk() {
		return aMilk;
	}

	public void setaMilk(AMilk aMilk) {
		this.aMilk = aMilk;
	}

	//	@Override
//	public String toString() {
//		return "TestPrototype{ " +
//				"aa='" + aa + '\'' +
//				", bb=" + bb +
//				", cc=" + cc +
//				'}';
//	}

	public String getAa() {
		return aa;
	}

	public void setAa(String aa) {
		this.aa = aa;
	}

	public int getBb() {
		return bb;
	}

	public void setBb(int bb) {
		this.bb = bb;
	}

	public double getCc() {
		return cc;
	}

	public void setCc(double cc) {
		this.cc = cc;
	}
}
