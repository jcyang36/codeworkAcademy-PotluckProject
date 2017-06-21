package com.example.demo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by student on 6/21/17.
 */
@Entity
public class Signup {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)

    private long id;
    @NotNull
    @Size(min=2, max=30)
    private String name;

    @NotNull
    @Size(min=2,max=30)
    private String food;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }


}
