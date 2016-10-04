package github.tiMorpheus.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("SpringBeans");

        Customer customer = (Customer) context.getBean("customer");

        System.out.println(customer);
    }
}
