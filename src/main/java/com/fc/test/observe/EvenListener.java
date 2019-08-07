package com.fc.test.observe;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author lize
 * @date 7/14/19 6:47 PM
 */
public class EvenListener {
	// 被监听对象 需要通知的 可以扩展为 Map<EventType, List<IWatcher>> ，每种事件都有多个监听器
	private final Map<EventType, IWatcher> listeners = new ConcurrentHashMap<>(16);

	protected void addListener(EventType eventType, IWatcher watcher) {
		listeners.putIfAbsent(eventType, watcher);
	}

	public void trigger(EventType eventType) {
		listeners.keySet().stream().filter(o -> o == eventType).forEach(o -> {
			try {
				listeners.get(o).doSomething(new Event().setSource(this.clone()).setEventType(eventType));
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}
		});
	}
}
