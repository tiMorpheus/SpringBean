package github.tiMorpheus.core;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("clientBean")
public class Customer {

    @Value("#{itemBean.qtyOnHand < 100 ? true : false }")
    private boolean warning;

    public boolean isWarning(){
        return warning;
    }

    public void setWarning(boolean warning) {
        this.warning = warning;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "warning=" + warning +
                '}';
    }
}
