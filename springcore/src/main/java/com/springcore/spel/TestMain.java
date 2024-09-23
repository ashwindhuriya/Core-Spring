package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/spel/spelConfig.xml");
		Demo demo = context.getBean("demo", Demo.class);
		
		System.out.println(demo);
		
		SpelExpressionParser parser = new SpelExpressionParser();
		Expression expression = parser.parseExpression("12 + 24 + 36");
		System.out.println(expression.getValue());
	}

}
