package github.tiMorpheus.common;

import github.tiMorpheus.customer.services.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("Spring-customer.xml");

        CustomerService service1 = (CustomerService) context.getBean("customerService");
        service1.setMessage("Message by service1");
        System.out.println("Message: " + service1.getMessage());

        //retrieve it again
        CustomerService service2 = (CustomerService)context.getBean("customerService");
        System.out.println("Message : " + service2.getMessage());
    }
}
