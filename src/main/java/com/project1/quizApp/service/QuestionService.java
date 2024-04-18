package com.project1.quizApp.service;

import com.project1.quizApp.Question;
import com.project1.quizApp.dao.QuestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    QuestionDao questionDao;
    public List<Question> getAllQuestions() {
        return questionDao.findAll();
    }

    public List<Question> getQuestionsByCategory(String category) {
        return questionDao.findByCategory(category);
    }

    public String addQuestion(Question question) {
        questionDao.save(question);
        return "Success";
    }

    public String deleteQuestionById(String id) {
        questionDao.deleteById(Integer.valueOf(id));
        return "Deleted";
    }
}
