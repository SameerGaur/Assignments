package assignment.q1.SpringCoreAssignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("assignment/q1/SpringCoreAssignment/spring.xml");

        // using the setter injection
        Customer customer=(Customer) context.getBean("customer");
        customer.customerDetail();

        // using constructor injection
        Customer customerCon=(Customer) context.getBean("customerCon");
        customerCon.customerDetail();

    }
}