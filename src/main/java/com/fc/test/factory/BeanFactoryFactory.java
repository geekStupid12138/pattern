package com.fc.test.factory;

/**
 * @author lize
 * @date 7/13/19 11:07 PM
 * 工厂方法 对工厂的抽象 用于获取产各种类型的bean的工厂
 */
public interface BeanFactoryFactory {
	BeanFactory getBeanFactory() ;
}
