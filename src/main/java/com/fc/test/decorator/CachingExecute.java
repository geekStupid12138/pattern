package com.fc.test.decorator;

/**
 * @author lize
 * @date 7/14/19 6:21 PM
 */
public class CachingExecute implements Executor {
	private Executor delegate ;
	public CachingExecute(Executor executor) {
		this.delegate = executor;
	}

	@Override
	public void execute() {
		System.out.println("caching ...");
		delegate.execute();
	}

	public static void main(String[] args) {
		Executor executor = new CachingExecute(new BaseExecute());
		executor.execute();
	}
}
