package github.tiMorpheus.common;

import java.util.List;
import java.util.Set;

public class Customer
{
    private List lists;
    private Set sets;


    public List getLists() {
        return lists;
    }

    public void setLists(List lists) {
        this.lists = lists;
    }

    public Set getSets() {
        return sets;
    }

    public void setSets(Set sets) {
        this.sets = sets;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "lists=" + lists +
                ", sets=" + sets +
                '}';
    }
}