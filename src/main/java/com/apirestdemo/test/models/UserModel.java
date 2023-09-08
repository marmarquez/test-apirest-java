package com.apirestdemo.test.models;

import jakarta.persistence.*;

@Entity
@Table(name="personas_2")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String email;

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

}
