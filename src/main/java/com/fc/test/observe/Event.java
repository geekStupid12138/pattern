package com.fc.test.observe;

/**
 * @author lize
 * @date 7/14/19 6:38 PM
 * 这里可以接口化 定义不同的事件源
 */
public class Event {

	private EventType eventType;
	private Object source; // 目标
	private long timestame = System.currentTimeMillis();

	public Object getSource() {
		return source;
	}

	public Event setSource(Object source) {
		this.source = source;
		return this;
	}

	public EventType getEventType() {
		return eventType;
	}

	public Event setEventType(EventType eventType) {
		this.eventType = eventType;
		return this;
	}
}
