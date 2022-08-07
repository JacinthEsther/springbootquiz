package com.tech.quizapp.service;

import com.tech.quizapp.model.Question;
import com.tech.quizapp.model.QuestionForm;
import com.tech.quizapp.model.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResultService {

    @Autowired
    Question question;
    @Autowired
    Result result;

    public Result getResult(QuestionForm qForm) {
        result.setTotalCorrect(0);
        result.setTotalWrong(0);

        for(Question q: qForm.getQuestions()) {
            if(q.getAns() == q.getChose())
                result.setTotalCorrect(result.getTotalCorrect() + 1);
            else
                result.setTotalWrong(result.getTotalWrong() + 1);
        }

        return result;
    }
}
