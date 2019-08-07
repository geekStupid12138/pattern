package com.fc.test.proxy;

import java.lang.reflect.Method;

/**
 * @author lize
 * @date 7/14/19 10:22 AM
 */
public interface InvocationHandler {
	Object invoke(Object proxy, Method method, Object[] args) throws Throwable;
}
