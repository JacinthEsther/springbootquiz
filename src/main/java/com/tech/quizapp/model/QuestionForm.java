package com.tech.quizapp.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Getter
@Setter
public class QuestionForm {

    private List<Question> questions;
}