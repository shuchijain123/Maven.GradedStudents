package io.zipcoder;


import org.junit.Test;

import java.util.ArrayList;

public class StudentTest {



@Test
        public void addScoretest() {
    // : Given
    String firstName = "Shuchi";
    String lastName = "Jain";
    //Double[] examScores = { };
    ArrayList<Double> testScores = new ArrayList<>();


    Student student = new Student(firstName, lastName, testScores);

    // When
    student.addExamScore(100.0);
    String output = student.getExamScores();

    // Then
    System.out.println(output);
}


    @Test
    public void addMultipleScoreTest() {
        // : Given
        String firstName = "Shuchi";
        String lastName = "Jain";
        //Double[] examScores = { };
        ArrayList<Double> testScores = new ArrayList<>();


        Student student = new Student(firstName, lastName, testScores);

        // When
        student.addExamScore(100.0);
        student.addExamScore(120.0);
        student.addExamScore(130.0);

        String output = student.getExamScores();

        // Then
        System.out.println(output);
    }

    @Test
    public void setScoreTest() {
        // : Given
        String firstName = "Shuchi";
        String lastName = "Jain";
        //Double[] examScores = { };
        ArrayList<Double> testScores = new ArrayList<>();


        Student student = new Student(firstName, lastName, testScores);

        // When
        student.addExamScore(100.0);
        student.addExamScore(120.0);
        student.addExamScore(130.0);

        student.setExamScore(0,150);

        String output = student.getExamScores();

        // Then
        System.out.println(output);
    }
    @Test
    public void getAverageScoreTest() {
        // : Given
        String firstName = "Shuchi";
        String lastName = "Jain";
        //Double[] examScores = { };
        ArrayList<Double> testScores = new ArrayList<>();


        Student student = new Student(firstName, lastName, testScores);

        // When
        student.addExamScore(100.0);
        student.addExamScore(120.0);
        student.addExamScore(130.0);

        student.setExamScore(0,150);

        double output = student.getAverageExamScore();
        int myInt = (int) (output);

        // Then
        System.out.println(myInt);
    }


    @Test
    public void gettoStringTest() {
        // : Given
        String firstName = "Shuchi";
        String lastName = "Jain";
        //Double[] examScores = { };
        ArrayList<Double> testScores = new ArrayList<>();


        Student student = new Student(firstName, lastName, testScores);

        // When
        student.addExamScore(100.0);
        student.addExamScore(120.0);
        student.addExamScore(130.0);

        student.setExamScore(0,150);

        String output = student.toString();


        // Then
        System.out.println(output);
    }





}