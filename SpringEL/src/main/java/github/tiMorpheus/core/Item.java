package github.tiMorpheus.core;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("itemBean")
public class Item {

    @Value("itemB")
    private String name;

    @Value("20")
    private int qty;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", qty=" + qty +
                '}';
    }
}
