package org.mongodb.morphia;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import java.util.ArrayList;
import java.util.List;

/**
 * ZOHOUN Nellya
 * AKIMANA Marlene
 * Groupe C
 * M1 MIAGE
 */

@Entity
public class Person {
    @Id
    private ObjectId id = new ObjectId();
    private String name;


    @Embedded
    private List<Address> listAddress = new ArrayList<Address>();

    public List<Address> getListAddress() {
        return listAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        listAddress.add(address);
    }
}
