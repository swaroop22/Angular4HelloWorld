package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.service.MyServiceImpl;


public class clint {
	
	public static void main(String[] args) {
	ApplicationContext ap= new ClassPathXmlApplicationContext("resource/spring.xml");
	MyServiceImpl m = (MyServiceImpl) ap.getBean(MyServiceImpl.class);
	}
}