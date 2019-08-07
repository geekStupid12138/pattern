package com.fc.test.singleton;

import com.fc.test.factory.AMilk;
import com.fc.test.factory.Milk;

/**
 * @author lize
 * @date 7/14/19 12:37 AM
 * 枚举类型单例
 */
public enum EnumSingleton {
	RED(new AMilk()) {
		@Override
		public Milk getMilk() {
			return super.getMilk();
		}
	}
	;
	private Milk milk;
	EnumSingleton(Milk milk) {
		this.milk = milk;
	}

	public Milk getMilk() {
		return milk;
	}

}
