package com.exam.model.exam;

import javax.persistence.*;

@Entity
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long quesId;
    @Column(length = 5000)
    private String content;

    private String image;

    private String optiona;
    private String optionb;
    private String optionc;
    private String optiond;


    private String answer;

    @Transient
    private  String givenAnswer;

    @ManyToOne(fetch = FetchType.EAGER)
    private Quiz quiz;

    public Question() {
    }

    public Long getQuesId() {
        return quesId;
    }

    public void setQuesId(Long quesId) {
        this.quesId = quesId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getoptiona() {
        return optiona;
    }

    public void setoptiona(String optiona) {
        this.optiona = optiona;
    }

    public String getoptionb() {
        return optionb;
    }

    public void setoptionb(String optionb) {
        this.optionb = optionb;
    }

    public String getoptionc() {
        return optionc;
    }

    public void setoptionc(String optionc) {
        this.optionc = optionc;
    }

    public String getoptiond() {
        return optiond;
    }

    public void setoptiond(String optiond) {
        this.optiond = optiond;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Quiz getQuiz() {
        return quiz;
    }

    public void setQuiz(Quiz quiz) {
        this.quiz = quiz;
    }

    public String getGivenAnswer() {
        return givenAnswer;
    }

    public void setGivenAnswer(String givenAnswer) {
        this.givenAnswer = givenAnswer;
    }
}
