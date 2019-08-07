package com.fc.test.factory;


import javafx.scene.AmbientLight;

import java.io.Serializable;

/**
 * @author lize
 * @date 7/13/19 10:52 PM
 */
public class AMilk implements Milk, Cloneable, Serializable {
	protected String tt;

	public AMilk() {
		System.out.println("AMilk");
	}

	public AMilk(String ss) {
//		this.tt = "gg";
		System.out.println("AMilk with args");
	}

	private static final long serialVersionUID = 3107243198197075181L;

	public AMilk clone() {
		try {
			return (AMilk) super.clone();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public String getTt() {
		return this.tt;
	}

	public void setTt(String tt) {
		this.tt = tt;
	}
}
