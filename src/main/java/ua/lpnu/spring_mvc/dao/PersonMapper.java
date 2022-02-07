package ua.lpnu.spring_mvc.dao;

import org.springframework.jdbc.core.RowMapper;
import ua.lpnu.spring_mvc.models.Person;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonMapper implements RowMapper<Person> {
    @Override
    public Person mapRow(ResultSet resultSet, int i) throws SQLException {      // writes data from db in this class
        Person person = new Person();                                           // it can be used a lot of times

        person.setId(resultSet.getInt("id"));
        person.setName(resultSet.getString("name"));
        person.setEmail(resultSet.getString("email"));
        person.setAge(resultSet.getInt("age"));

        return person;
    }
}
