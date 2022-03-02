package com.mariadb.example.dbdemo.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    private long id;
    @Column(name="created_at", nullable = false)
    @Getter @Setter
    private Timestamp timestamp;
    @Column(name = "first_name", nullable = false)
    @Getter @Setter
    private String firstName;
    @Column(name = "last_name", nullable = false)
    @Getter @Setter
    private String lastName;

    public User (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.timestamp = new Timestamp(LocalDateTime.now().toLocalTime().getSecond());
    }


    public User() {

    }
}
