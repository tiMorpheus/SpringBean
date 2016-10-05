package github.tiMorpheus.services;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext("SpringBeans.xml");

        CustomerService service = (CustomerService) context.getBean("customerService");

        System.out.println(service);

        context.close();
    }
}
