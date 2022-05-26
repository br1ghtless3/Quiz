package com.example.quiz;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private static List<QuestionList> sssrQuiz() {

        final List<QuestionList> questionLists = new ArrayList<>();
        final QuestionList quis1 = new QuestionList("Hwo r u",
                "1", "2", "3", "THIS",
                "THIS", "");

        final QuestionList quis2 = new QuestionList("Hwo r u",
                "1", "this", "3", "THIS",
                "this", "");

        final QuestionList quis3 = new QuestionList("Hwo r u",
                "1", "2", "3", "THIS",
                "3", "");

        questionLists.add(quis1);
        questionLists.add(quis2);
        questionLists.add(quis3);
        return questionLists;
    }

    private static List<QuestionList> winxQuiz() {

        final List<QuestionList> questionLists = new ArrayList<>();
        final QuestionList quis1 = new QuestionList("Hwo r u",
                "1", "2", "3", "THIS",
                "THIS", "");

        final QuestionList quis2 = new QuestionList("Hwo r u",
                "1", "2", "3", "THIS",
                "THIS", "");

        final QuestionList quis3 = new QuestionList("Hwo r u",
                "1", "2", "3", "THIS",
                "THIS", "");

        questionLists.add(quis1);
        questionLists.add(quis2);
        questionLists.add(quis3);
        return questionLists;
    }

    private static List<QuestionList> disneyQuiz() {

        final List<QuestionList> questionLists = new ArrayList<>();
        final QuestionList quis1 = new QuestionList("Hwo r u",
                "1", "2", "3", "THIS",
                "THIS", "");

        final QuestionList quis2 = new QuestionList("Hwo r u",
                "1", "2", "3", "THIS",
                "THIS", "");

        final QuestionList quis3 = new QuestionList("Hwo r u",
                "1", "2", "3", "THIS",
                "THIS", "");

        questionLists.add(quis1);
        questionLists.add(quis2);
        questionLists.add(quis3);
        return questionLists;
    }

    public static List<QuestionList> getQuestion(String nameTopic) {
        switch (nameTopic) {
            case "sssr":
                return sssrQuiz();
            case "winx":
                return winxQuiz();
            default:
                return disneyQuiz();
        }
    }


}
