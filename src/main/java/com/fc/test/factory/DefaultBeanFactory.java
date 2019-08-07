package com.fc.test.factory;

/**
 * @author lize
 * @date 7/13/19 10:53 PM
 * 阿里规约：如果程序当中出现超过三层ifelse
 * switch ;
 * 策略模式
 */
public class DefaultBeanFactory implements BeanFactory {

	public Milk getMilk(String type) {
		if (type.equals("A")) {
			return new AMilk();
		} else {
			return null;
		}
	}
}
