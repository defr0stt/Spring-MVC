package ua.lpnu.spring_mvc.dao;

import org.springframework.stereotype.Component;
import ua.lpnu.spring_mvc.models.Person;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO
{
    private static int PEOPLE_COUNT = 0;
    private List<Person> people;
    {
        people = new ArrayList<>();
        people.add(new Person(++PEOPLE_COUNT,"Tom"));
        people.add(new Person(++PEOPLE_COUNT,"Zack"));
        people.add(new Person(++PEOPLE_COUNT,"Paul"));
        people.add(new Person(++PEOPLE_COUNT,"Lola"));
    }

    public List<Person> index(){
        return people;
    }

    public Person show(int id){
        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }

    public void save(Person person) {
        person.setId(++PEOPLE_COUNT);
        people.add(person);
    }
}