package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.UserDao;

public class IoC2 {

	public static void main(String[] args) {

		// IOC

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		// addressBean userBean userDao
		System.out.println(context);

		UserDao userDao1 = context.getBean("userDao", UserDao.class);
		UserDao userDao2 = context.getBean("userDao", UserDao.class);
		UserDao userDao3 = context.getBean("userDao", UserDao.class);
		System.out.println(userDao1);
		System.out.println(userDao2);
		System.out.println(userDao3);

	}
}
