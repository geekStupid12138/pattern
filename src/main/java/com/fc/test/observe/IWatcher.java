package com.fc.test.observe;

/**
 * @author lize
 * @date 7/14/19 6:26 PM
 * 观察者模式 对于被观察对象的任何动作进行监听 一般常用方式 事件封装 包含事件类型 事件源， 观察者
 * 被观察对象 单一职责 出现监听器维护抽象， 事件封装， 观察者维护， 被观察对象操作
 * 扩展操作， 因观察者不能修改被观察者的任何属性 需 clone
 */
public interface IWatcher {
	void doSomething(Event event) ;
}
