package github.tiMorpheus.common;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.context.ApplicationContext;


public class App {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext(new String[]{"Spring-Customer.xml"});

        Customer customer = (Customer) context.getBean("CustomerBean");

        System.out.println(customer);

    }
}
