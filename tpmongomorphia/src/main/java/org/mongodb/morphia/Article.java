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
public class Article {
    @Id
    private ObjectId id = new ObjectId();
    private String name;
    private int stars;

    @Embedded
    private List<Person> listPerson = new ArrayList<Person>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public List<Person> getListPerson() {
        return listPerson;
    }

    public void addPerson(Person person) {
        listPerson.add(person);
    }
}
