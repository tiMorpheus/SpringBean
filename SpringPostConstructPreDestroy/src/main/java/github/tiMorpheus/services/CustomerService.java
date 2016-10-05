package github.tiMorpheus.services;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class CustomerService {

    String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @PostConstruct
    public void initIt() throws Exception{
        System.out.println("Init method after properties are set : " + message);
    }

    @PreDestroy
    public void cleanUp() throws Exception{
        System.out.println("Spring Container is destroy! Customer clean up");
    }

    @Override
    public String toString() {
        return "CustomerService{" +
                "message='" + message + '\'' +
                '}';
    }
}
