package dev.mihail.model;

import org.springframework.data.annotation.Id;

public class Game {

    @Id
    private Integer id;
    private String name;
}
