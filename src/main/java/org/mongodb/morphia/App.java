package org.mongodb.morphia;

import com.mongodb.MongoClient;
import java.net.UnknownHostException;

/**
 * ZOHOUN Nellya
 * AKIMANA Marlene
 * Groupe C
 * M1 MIAGE
 */

public class App 
{
    public static void main( String[] args )throws UnknownHostException {
        Morphia morphia = new Morphia();
        MongoClient mongo = new MongoClient();
        morphia.map(Person.class).map(Address.class);
        Datastore ds = morphia.createDatastore(mongo, "maBasededonnees");

        Person p = new Person();
        Person p1 = new Person();
        Person p2 = new Person();

        p.setName("Tintin");
        p1.setName("Nellya");
        p2.setName("Marlene");

        Address address = new Address();
        Address address1 = new Address();
        Address address2 = new Address();

        address.setStreet("123 Some street");
        address.setCity("Some city");
        address.setPostCode("123 456");
        address.setCountry("Some country");

        address1.setStreet("31 Avenue Prof Charles");
        address1.setCity("Rennes");
        address1.setPostCode("35700");
        address1.setCountry("France");

        address2.setStreet("6 rue de la Villaine");
        address2.setCity("Rennes");
        address2.setPostCode("35000");
        address2.setCountry("France");

        p.setAddress(address);
        p1.setAddress(address1);
        p2.setAddress(address2);

        ds.save(address);
        ds.save(address1);
        ds.save(address2);

        Article article = new Article();
        Article article1 = new Article();
        Article article2 = new Article();

        article.setName("Ordinateur");
        article1.setName("Sac à main");
        article2.setName("Tablette");

        ds.save(article);
        ds.save(article1);
        ds.save(article2);

        System.out.println(article1.getName());

        article.addPerson(p);
        article.addPerson(p1);
        article1.addPerson(p1);
        article2.addPerson(p1);
        article2.addPerson(p2);

        ds.save(p);
        ds.save(p1);
        ds.save(p2);

        for (Person pers : ds.find(Person.class))
            System.err.println(pers.getName());

        for (Article a : ds.find(Article.class)) {
            System.err.println(a.getName());
        }

    }
}
