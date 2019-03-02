package io.zipcoder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;




public class Student implements Comparator<Student> {


    String firstName ="";
    String lastName ="";
    ArrayList<Double> testScores = new ArrayList<>();
    int numberofexamstaken;

    public Student(String firstName, String lastName, ArrayList<Double> examScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.testScores = testScores;
    }
    public Student(){

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ArrayList<Double> getTestScores() {
        return testScores;
    }

    public int getNumberofExamsTaken(){

        return numberofexamstaken;
    }

    public String getExamScores(){

        String format="";
        String secondformat="";

        for (int i=0;i<testScores.size();i++){

            secondformat= secondformat.concat(String.format("%-15s","Exam "+(i+1)+" -> "+testScores.get(i)+"\n"));

            format = String.format("Exam Scores:\n"+secondformat);



        }


        return format;



    }

    public void addExamScore(double examScore){

        testScores.add(examScore);

    }


    public void setExamScore(int index, double examScore){



        testScores.set(index,examScore);

    }


    public Integer getAverageExamScore(){




        double sum =0;
        double average=0;

        for (int i=0;i<testScores.size();i++){


            sum = sum+testScores.get(i);

            average = (int)sum/testScores.size();
        }

return (int) average;

    }

    @Override

    public String toString(){

        String newString="";
        String newString1="";
        String newString2="";


        for (int i=0;i<testScores.size();i++){

            newString1 = String.format("> Average Score: "+getAverageExamScore()+'\n');

            newString = ("Student Name:   "+getFirstName()+" "+getLastName()+'\n').concat(newString1).concat(getExamScores());



        }

        return newString;



    }

    @Override
    public int compare(Student o1, Student o2) {

        int comp = o2.getAverageExamScore().compareTo(o1.getAverageExamScore());


        return comp;

    }



}
