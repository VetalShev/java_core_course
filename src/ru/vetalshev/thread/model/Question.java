package ru.vetalshev.thread.model;

public class Question {

    private String text;

    public Question(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Question{" +
                "'" + text + '\'' +
                '}';
    }
}
