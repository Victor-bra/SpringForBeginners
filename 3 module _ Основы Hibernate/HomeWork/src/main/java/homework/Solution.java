package homework;

import homework.entity.Country;
import homework.entity.Hobby;
import homework.entity.People;
import homework.entity.President;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;


/*
Создать Базу данных "World" с таблицами "Президент", "Страна", "Человек", "Хобби".
Таблицы "Президент" и "Страна" должны быть связаны связью один к одному.
Таблицы "Стана" и"Человек" должны быть связаны связью один ко многим.
Таблицы "Человек" и "Хобби" должны быть связаны связью многие ко многим.
Заполнить таблицу минимум 3-мя странами и в каждой стране есть минимум 3 человека.
Вывести в консоль Страну, президента, всех людей относящихся к этой стране и их хобби.
Вывести президента определенной страны.
Вывести Хобби определенного человека.
Вывести Людей кто посещают определенное хобби.
Произвести удаление одного из хобби.
Произвести удаление определенного человека.
Произвести удаление страны и все что с ней связанно.
*/

public class Solution {
    public static void main(String[] args) {
        try(SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Country.class)
                .addAnnotatedClass(President.class)
                .addAnnotatedClass(People.class)
                .addAnnotatedClass(Hobby.class)
                .buildSessionFactory();
            Session session = sessionFactory.getCurrentSession()){

            /**
             * заполнение таблиц данными(для одной страны)
             */
           /* Country russianCountry = new Country("Russia");
            President presidentOfRussia = new President("Vlad", "Putin", 55);
            People russianPeople1 = new People("Artem", "Levkov", 15,"Driver", 1300);
            People russianPeople2 = new People("Nikita", "Alban", 30,"Paint", 5000);
            People russianPeople3 = new People("Anna", "Stoianov", 21,"Porno", 9000);
            Hobby hobbyInRussia1 = new Hobby("Dance");
            Hobby hobbyInRussia2 = new Hobby("IT");
            Hobby hobbyInRussia3 = new Hobby("Porno");
            Hobby hobbyInRussia4 = new Hobby("Game");

            russianCountry.setPresident(presidentOfRussia);
            presidentOfRussia.setCountry(russianCountry);
            russianCountry.addPeopleToCountry(russianPeople1);
            russianCountry.addPeopleToCountry(russianPeople2);
            russianCountry.addPeopleToCountry(russianPeople3);
            russianPeople1.addHobbyToPeople(hobbyInRussia1);
            russianPeople1.addHobbyToPeople(hobbyInRussia2);
            russianPeople2.addHobbyToPeople(hobbyInRussia1);
            russianPeople3.addHobbyToPeople(hobbyInRussia3);
            russianPeople3.addHobbyToPeople(hobbyInRussia4);

            session.beginTransaction();

            session.persist(russianCountry);
            session.persist(russianPeople1);
            session.persist(russianPeople2);

            session.getTransaction().commit();
            System.out.println("Done!");*/

            /**
             * Вывод в консоль Страны, президента, всех людей относящихся к этой стране и их хобби.
             */

            /*session.beginTransaction();
            Country country = session.get(Country.class, 12);
            System.out.println(country);
            System.out.println(country.getPresident());
            for(People e: country.getPeople()){
                People people = session.get(People.class, e.getId());
                System.out.println(people);
                System.out.println(people.getHobbyList());
            }
            session.getTransaction().commit();

            System.out.println("Done!");*/

            /**
             * Вывести президента определенной страны.
             */

            /*session.beginTransaction();
            Country country = session.get(Country.class, 12);
            System.out.println(country);
            System.out.println(country.getPresident());
            session.getTransaction().commit();

            System.out.println("Done!");*/

            /**
             * Вывести Хобби определенного человека.
             */

            /*session.beginTransaction();
            People people = session.get(People.class, 19);
            System.out.println(people);
            System.out.println(people.getHobbyList());
            session.getTransaction().commit();

            System.out.println("Done!");*/

            /**
             * Вывести Людей кто посещают определенное хобби.
             */

            /*session.beginTransaction();
            Hobby hobby = session.get(Hobby.class, 5);
            System.out.println(hobby);
            System.out.println(hobby.getPeopleList());
            session.getTransaction().commit();

            System.out.println("Done!");*/

            /**
             * Произвести удаление одного из хобби.
             */

            /*session.beginTransaction();
            Hobby hobby = session.get(Hobby.class, 12);
            session.delete(hobby);
            session.getTransaction().commit();

            System.out.println("Done!");*/

            /**
             * Произвести удаление определенного человека.
             */

            /*session.beginTransaction();
            People people = session.get(People.class, 24);
            session.delete(people);
            session.getTransaction().commit();

            System.out.println("Done!");*/

            /**
             * Произвести удаление страны и все что с ней связанно.
             */

            session.beginTransaction();
            Country country = session.get(Country.class, 15);
            for(People e: country.getPeople()){
                People people = session.get(People.class, e.getId());
                for(Hobby h: people.getHobbyList())
                    session.delete(h);
                session.delete(people);
            }
            session.delete(country);
            session.delete(country.getPresident());

            session.getTransaction().commit();
            System.out.println("Done!");

        }catch (Exception e) {
            throw e;
        }
    }
}
