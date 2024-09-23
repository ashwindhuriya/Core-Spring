package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycleconfig.xml");
//		IceCream iceCream = (IceCream) context.getBean("icecream");
//		
		context.registerShutdownHook();
//		System.out.println(iceCream);
//		
//		ColdDrink coldDrink = (ColdDrink) context.getBean("coldrink");
//		System.out.println(coldDrink);
		
		Example example = (Example) context.getBean("example");
		System.out.println(example);
	}

}
