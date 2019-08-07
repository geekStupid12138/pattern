package com.fc.test.strategy;

/**
 * @author lize
 * @date 7/14/19 5:36 PM
 *
 * 策略模式 strategy 不同情况下选择不同算法 与命令模式区别 更偏向于底层算法 command偏向于上层决策层
 *
 */
public class WeChatPay implements IPayment {
	@Override
	public String pay() {
		return "WeChat.";
	}

	public static void main(String[] args) {
		IPayment payment = new WeChatPay();
		System.out.println(payment.pay());
	}
}
