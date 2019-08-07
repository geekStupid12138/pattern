package com.fc.test.factory;

/**
 * @author lize
 * @date 7/13/19 11:09 PM
 * 抽象工厂 模板模式与工厂模式的结合 用来生产一组产品, 简单来说某种复杂的产品是由多种不同种工厂生产的零部件组成的
 * ps : 如 按钮 和 鼠标 属于两种不同的产品 需要不同的工厂加工处理
 * windows与linux 这两种产品都有这两种东西 template
 */
public abstract class AbstractBeanFactory {

	private BeanFactory oneBeanFactory;
	private BeanFactory anotherBeanFactory;

	protected AbstractBeanFactory(BeanFactory oneBeanFactory, BeanFactory anotherBeanFactory) {
		this.oneBeanFactory = oneBeanFactory;
		this.anotherBeanFactory = anotherBeanFactory;
	}

	public Object getOneObject() {
		Milk a = oneBeanFactory.getMilk("A");
		Milk b = anotherBeanFactory.getMilk("A");
		try {

			return doCreateObject(a, b);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	protected abstract Object doCreateObject(Milk obj, Milk milk) throws Exception ;

}
