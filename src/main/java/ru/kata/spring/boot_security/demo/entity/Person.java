package ru.kata.spring.boot_security.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "Person")
public class Person {

    @Id
    @Column(name = "id")
    private int id;
    @NotEmpty(message = "Поле не должно быть пустым")
    @Column(name = "name")
    private String name;
    @NotEmpty(message = "Поле не должно быть пустым")
    @Column(name = "password")
    private String password;

    public Person(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
