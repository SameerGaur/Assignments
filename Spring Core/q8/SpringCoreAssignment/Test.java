package assignment.q8.SpringCoreAssignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("assignment\\q8\\SpringCoreAssignment\\spring.xml");

        context.registerShutdownHook();

        Dog dog= (Dog)context.getBean("dog");
        dog.eat();

        Dog dog1= (Dog)context.getBean("dog1");
        dog1.eat();

        Dog dog2= (Dog)context.getBean("dog2");
        dog2.eat();

    }


}