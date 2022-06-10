package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.dao.UserDao;

public class StartIOC {

	public static void main(String[] args) {

		// container
		// BeanFactory - [ old ]
		// ApplicationContext - [ latest ]
		// ApplicationContext is a child BeanFactory
		// interface
		// 3 class

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		System.out.println(context);// toString()
//		FileSystemXmlApplicationContext  {path} 

		// Servlet interface
		// HttpServlet is child of Servlet
		// WebAppliactionContext -- >spring web jar

		UserDao uDao1 = context.getBean("userDao", UserDao.class);
		UserDao uDao2 = context.getBean("userDao", UserDao.class);
		System.out.println(uDao1);// hashcode
		System.out.println(uDao2);// hashcode
//		UserDao u1 = new UserDao();
//		UserDao u2 = new UserDao();
//		System.out.println(u1);
//		System.out.println(u2);

	}
}
