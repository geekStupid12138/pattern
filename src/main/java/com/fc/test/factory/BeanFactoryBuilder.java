package com.fc.test.factory;

/**
 * @author lize
 * @date 7/13/19 11:03 PM
 * 建造者模式，用于创建复杂对象 过滤掉需要的以及不需要的属性
 */
public class BeanFactoryBuilder {
	private String aa;
	public BeanFactoryBuilder(){

	}
	public BeanFactoryBuilder build(String aa) {
		this.aa = aa;
		return this;
	}
	public BeanFactory build() {
		return new DefaultBeanFactory();
	}
}
