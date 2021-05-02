package com.example.task1.model;

public class Question {

    String question;
    String rb1;
    String rb2;
    String rb3;
    String rb4;
    int answer;

    public Question() {
    }

    public Question( String question, String rb1, String rb2, String rb3, String rb4, int answer) {
        this.question = question;
        this.rb1 = rb1;
        this.rb2 = rb2;
        this.rb3 = rb3;
        this.rb4 = rb4;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getRb1() {
        return rb1;
    }

    public void setRb1(String rb1) {
        this.rb1 = rb1;
    }

    public String getRb2() {
        return rb2;
    }

    public void setRb2(String rb2) {
        this.rb2 = rb2;
    }

    public String getRb3() {
        return rb3;
    }

    public void setRb3(String rb3) {
        this.rb3 = rb3;
    }

    public String getRb4() {
        return rb4;
    }

    public void setRb4(String rb4) {
        this.rb4 = rb4;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }
}
