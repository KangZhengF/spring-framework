package com.ken.ioc;

import com.ken.entity.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * IocTest class
 *
 * @author 康正锋
 * @date 2021/09/01
 */
public class IocTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationfile.xml");
		User kzf = context.getBean(User.class,1, "kzf");
		System.out.println(kzf);
	}
}
