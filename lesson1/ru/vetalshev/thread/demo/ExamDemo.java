package ru.vetalshev.thread.demo;

import ru.vetalshev.thread.model.Question;
import ru.vetalshev.thread.model.Talker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class ExamDemo {

    private static int score = 0;
    private final static int TOTAL_QUESTION_NUMBER = 10;
    private final static int THINKING_TIME = 2000;

    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> questions = new ArrayBlockingQueue<>(1);

        Thread teacher = new Thread() {

            public void run() {
                for (int i = 0; i < TOTAL_QUESTION_NUMBER; i++) {
                    String question = "Question #" + i;

                    try {
                        boolean canAdd = questions.offer(question, THINKING_TIME, TimeUnit.MILLISECONDS);


                        if (canAdd) {
                            System.out.println(question);
                        } else {
                            String notAnsweredQuestion = questions.poll();
                            questions.offer(question, THINKING_TIME, TimeUnit.MILLISECONDS);
                            System.out.println(question);
                            if (notAnsweredQuestion != null) {
                                System.out.println("Student doesn't know the answer for the " + notAnsweredQuestion);
                            }


                            continue;
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                questions.offer("finish");
            }

        };

        Thread student = new Thread() {

            public void run() {
                try {
                    while (true) {
                        int questionThinkingTime = new Random().nextInt(THINKING_TIME + 3000);

                        Thread.sleep(questionThinkingTime); // thinking process

                        String question = questions.poll();

                        if (question == "finish") {
                            break;
                        }

                        if (question == null) {
                            break;
                        } else {
                            System.out.println("Answer for " + question);
                            score++;
                        }

                    }

                } catch (InterruptedException e) {
                    System.out.println("There's no more questions");
                }
            }

        };

        teacher.start();
        student.start();
        teacher.join();
        student.join();

        System.out.println("Total score: " + score + '/' + TOTAL_QUESTION_NUMBER);

    }
}
