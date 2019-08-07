package com.fc.test.observe;

/**
 * @author lize
 * @date 7/14/19 6:40 PM
 */
public class DefaultWatcher implements IWatcher {

	@Override
	public void doSomething(Event event) {
		System.out.println(event);
		System.out.println(event.getEventType().ordinal());
		if (event.getSource() instanceof Observed) {
			System.out.println("watcher " + ((Observed) event.getSource()).getName());
		}
	}
}
