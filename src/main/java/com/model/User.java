package com.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "TEST")
public class User {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "NAME", length = 25)
    private String name;

    @Column(name = "AGE")
    private int age;

    @Column(name = "ISADMIN")
    private boolean admin;

    @Column(name = "CREATEDATE")
    private Timestamp createDate;

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate() {
        this.createDate = new Timestamp((new Date()).getTime());
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean getAdmin() {
        return admin;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAdmin(boolean isAdmin) {
        this.admin = isAdmin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", admin=" + admin +
                ", createDate=" + createDate +
                '}';
    }
}
