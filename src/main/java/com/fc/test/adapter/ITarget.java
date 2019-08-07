package com.fc.test.adapter;

/**
 * @author lize
 * @date 7/14/19 6:02 PM
 * 适配器模式 将目标转换为对应的客户端需要的东西 同时要保留目标现有的功能 遵循开闭原则 对扩展开放 对修改关闭 不修改适配器本身的结构
 */
public interface ITarget {

	void doSomething();
}
