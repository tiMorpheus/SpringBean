package github.tiMorpheus.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("SpringBeans.xml");

        Customer customer = (Customer) context.getBean("CustomerBean");
        System.out.println(customer + customer.getLists().getClass().getName());

        Customer customer1 = (Customer) context.getBean("CustomerSetBean");
        System.out.println(customer1+ customer1.getSets().getClass().getName());

    }
}
