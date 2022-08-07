package com.tech.quizapp.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Component
@Getter
@Setter
public class Result {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    private int totalCorrect = 0;
    private int totalWrong = 0;

    public Result() {
        super();
    }

    public Result(int id, String username, int totalCorrect, int totalWrong) {
        super();
        this.id = id;
        this.username = username;
        this.totalCorrect = totalCorrect;
        this.totalWrong = totalWrong;
    }
}
