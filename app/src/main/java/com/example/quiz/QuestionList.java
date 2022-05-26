package com.example.quiz;

public class QuestionList {
    private String oneotvet, twootvet, threeotvet, foureotvet, question, ans;

    private String usersans;

    public QuestionList(String question, String oneotvet, String twootvet, String threeotvet, String foureotvet, String ans, String usersans) {
        this.oneotvet = oneotvet;
        this.twootvet = twootvet;
        this.threeotvet = threeotvet;
        this.foureotvet = foureotvet;
        this.question = question;
        this.ans = ans;
        this.usersans = usersans;
    }

    public String getOneotvet() {
        return oneotvet;
    }

    public String getTwootvet() {
        return twootvet;
    }

    public String getThreeotvet() {
        return threeotvet;
    }

    public String getFoureotvet() {
        return foureotvet;
    }

    public String getQuestion() {
        return question;
    }

    public String getAns() {
        return ans;
    }

    public String getUsersans() {
        return usersans;
    }

    public void setUsersans(String usersans) {
        this.usersans = usersans;
    }
}
