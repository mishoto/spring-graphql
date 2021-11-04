package dev.mihail.model;

import org.springframework.data.annotation.Id;

public class Game {

    @Id
    private Integer id;
    private String name;

    public Game() {
    }

    public Game(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
