package github.tiMorpheus.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");

        Customer customer = (Customer) context.getBean("customerBean");
        Producer producer = (Producer) context.getBean("producerBean");

        System.out.println(customer);
        System.out.println(producer);
    }
}
