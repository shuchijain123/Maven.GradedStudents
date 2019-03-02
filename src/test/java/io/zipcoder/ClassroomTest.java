package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

import java.util.ArrayList;

public class ClassroomTest {


    @Test

    public void getAverageTest() {
        ArrayList<Double> testScores = new ArrayList<>();

        ArrayList<Double> testScores2 = new ArrayList<>();


        Student s1 = new Student("student", "one", testScores);
        Student s2 = new Student("student", "two", testScores2);


        s1.addExamScore(100.0);
        s1.addExamScore(150.0);
        s1.addExamScore(225.0);
        s1.addExamScore(25.0);

        ArrayList<Student> newstudent = new ArrayList<Student>();
        newstudent.add(s1);
        newstudent.add(s2);
        Classroom classroom = new Classroom(newstudent);

        // When
        double output = classroom.getAverageExamScore();

        // Then
        System.out.println(output);
    }


    @Test
    public void addTest() {
        Classroom cl = new Classroom();
        cl.clear();

        int maxNumberOfStudents = 1;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        ArrayList<Double> testScores = new ArrayList<>();
        // When
        ArrayList<Student> preEnrollment = classroom.getStudents();


        Student s2 = new Student("student", "one", testScores);


        s2.addExamScore(100.0);
        s2.addExamScore(150.0);
        s2.addExamScore(225.0);
        s2.addExamScore(25.0);


        classroom.addStudent(s2);
        ArrayList<Student> postEnrollment = classroom.getStudents();

        // Then
        String preEnrollmentAsString = preEnrollment.toString();
        String postEnrollmentAsString = postEnrollment.toString();

        System.out.println("===========================");
        System.out.println(preEnrollmentAsString);
        System.out.println("===========================");
        System.out.println(postEnrollmentAsString);


    }

    @Test
    public void removeTest() {

        Classroom cl = new Classroom();
        cl.clear();

        int maxNumberOfStudents = 1;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        ArrayList<Double> testScores = new ArrayList<>();
        // When
        ArrayList<Student> preEnrollment = classroom.getStudents();


        Student s1 = new Student("Shuchi", "Jain", testScores);
        Student s2 = new Student("Amit", "Jain", testScores);


        s1.addExamScore(100.0);
        s1.addExamScore(150.0);
        s2.addExamScore(225.0);
        s2.addExamScore(25.0);


        classroom.addStudent(s1);
        classroom.addStudent(s2);
        ArrayList<Student> preremoval = classroom.getStudents();

        classroom.removeStudent("Shuchi", "Jain");
        ArrayList<Student> postremoval = classroom.getStudents();


        String preremovalAsString = preremoval.toString();
        String postremovalAsString = postremoval.clone().toString();

        System.out.println("===========================");
        System.out.println(preremovalAsString);
        System.out.println("===========================");
        System.out.println(postremovalAsString);



    }




    @Test
    public void sortTest() {

        Classroom cl = new Classroom();
        cl.clear();

        int maxNumberOfStudents = 1;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        ArrayList<Double> testScores = new ArrayList<>();
        // When
        ArrayList<Student> preEnrollment = classroom.getStudents();


        Student s1 = new Student("Shuchi", "Jain", testScores);
        Student s2 = new Student("Amit", "Jain", testScores);


        s1.addExamScore(100.0);
        s1.addExamScore(150.0);
        s2.addExamScore(25.0);
        s2.addExamScore(250.0);


        classroom.addStudent(s1);
        classroom.addStudent(s2);



        List<Student> studentsortex = new ArrayList<Student>();
        studentsortex.add(s2);
        studentsortex.add(s1);
        Student[] expected = studentsortex.toArray(new Student[studentsortex.size()]);

        Comparator<Student> comp = (Comparator<Student>) new Student();
        Student[] actual = classroom.getStudentByScore((comp));
        ArrayList<Student> expectedstring = classroom.getStudents();

        Assert.assertArrayEquals(expected,actual);


    }
    @Test
    public void gradeTest() {
        Map<String, Student> studentmap = new HashMap<>();

    ArrayList<Double> testScores = new ArrayList<>();

    ArrayList<Double> testScores2 = new ArrayList<>();
        ArrayList<Double> testScores3 = new ArrayList<>();

        ArrayList<Double> testScores4 = new ArrayList<>();


    Student s1 = new Student("student", "one", testScores);
    Student s2 = new Student("student", "two", testScores2);
    Student s3 = new Student("Shuchi", "Jain", testScores3);
    Student s4 = new Student("Amit", "Jain", testScores4);
        Student s5 = new Student("Gungun", "one", testScores);
        Student s6 = new Student("Saanchi", "two", testScores2);
        Student s7 = new Student("me", "Jain", testScores3);
        Student s8 = new Student("Laxmi", "Thoodi", testScores4);


        s1.addExamScore(150.0);
        s1.addExamScore(300.0);
        s2.addExamScore(45.0);
        s2.addExamScore(25.0);
        s3.addExamScore(500.0);
        s3.addExamScore(150.0);
        s4.addExamScore(20.0);
        s4.addExamScore(50.0);
        s5.addExamScore(789.0);
        s5.addExamScore(900.0);
        s6.addExamScore(890.0);
        s6.addExamScore(1000.0);
        s7.addExamScore(60.0);
        s7.addExamScore(123.0);
        s8.addExamScore(200.0);
        s8.addExamScore(100.0);

    ArrayList<Student> newstudent = new ArrayList<Student>();

        newstudent.add(s1);
        newstudent.add(s2);
        newstudent.add(s3);
        newstudent.add(s4);
        newstudent.add(s5);
        newstudent.add(s6);
        newstudent.add(s7);
        newstudent.add(s8);
    Classroom classroom = new Classroom(newstudent);

    // When
    double output = s1.getAverageExamScore();
    double output2= s2.getAverageExamScore();
    double output3 = s1.getAverageExamScore();
    double output4= s2.getAverageExamScore();
    studentmap = classroom.getGradeBook();


    // Then
        System.out.println(studentmap);
}
}
