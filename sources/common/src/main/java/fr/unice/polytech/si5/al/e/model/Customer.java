package fr.unice.polytech.si5.al.e.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Customer {
    @Id
    @GeneratedValue
    private int id;

    @NotNull
    private String name;

    @OneToMany
    private List<Item> items;

    @OneToMany(mappedBy = "customer")
    private Set<Travel> shipments;

    @OneToMany(mappedBy = "customer")
    private Set<Travel> transports;

    public Customer() {
        this.items = new ArrayList<>();
        this.shipments = new HashSet<>();
        this.transports = new HashSet<>();
    }

    public void addTravel(Travel travel) {
        shipments.add(travel);
    }

    public void chooseTravel(Travel travel) {
        transports.add(travel);
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}