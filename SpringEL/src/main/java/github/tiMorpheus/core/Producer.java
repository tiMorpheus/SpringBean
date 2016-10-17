package github.tiMorpheus.core;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("producerBean")
public class Producer {

    @Value("#{itemBean}")
    private Item item;

    @Value("#{itemBean.qty}")
    private int count;


    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
    return "Producer{" +
            "item=" + item +
            ", count=" + count +
            '}';
    }
}
