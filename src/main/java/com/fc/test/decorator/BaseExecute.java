package com.fc.test.decorator;

/**
 * @author lize
 * @date 7/14/19 6:20 PM
 */
public class BaseExecute implements Executor {
	@Override
	public void execute() {
		System.out.println("base execute.");
	}
}
