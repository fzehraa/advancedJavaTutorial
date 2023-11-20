package springIntro2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CustomerManager manager = new CustomerManager(context.getBean("database", ICustomerDal.class));
		manager.add();
		CustomerManager manager2 = new CustomerManager(new OracleCustomerDal());
		manager2.add();

	}

}
