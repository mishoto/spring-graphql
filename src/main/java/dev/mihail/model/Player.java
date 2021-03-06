package dev.mihail.model;

import org.springframework.data.annotation.Id;

public class Player {

    @Id
    private Integer id;
    private String name;
    private Integer age;
    private Integer scores;
    private String avatar;

    public Player() {
    }

    public Player(String name, Integer age, Integer scores, String avatar) {
        this.name = name;
        this.age = age;
        this.scores = scores;
        this.avatar = avatar;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getScores() {
        return scores;
    }

    public void setScores(Integer scores) {
        this.scores = scores;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", scores=" + scores +
                ", avatar='" + avatar + '\'' +
                '}';
    }
}
