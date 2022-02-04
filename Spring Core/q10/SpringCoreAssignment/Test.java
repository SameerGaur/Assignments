package assignment.q10.SpringCoreAssignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("assignment\\q10\\SpringCoreAssignment\\spring.xml");
        ContextAwareExample contextAwareExample = (ContextAwareExample) context.getBean("contextAware");
        contextAwareExample.display();

        ContextAwareExample contextAwareExample1 = (ContextAwareExample) context.getBean("contextAware1");
        contextAwareExample1.display();
    }
}