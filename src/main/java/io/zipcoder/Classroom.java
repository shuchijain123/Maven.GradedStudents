package io.zipcoder;

import java.util.*;

import static java.util.Collections.sort;

public class Classroom  {


    ArrayList<Student> students = new ArrayList<>();
    int maxNumberOfStudents = 0;


    public Classroom(ArrayList<Student> students, int maxNumberOfStudents) {
        this.students = students;
        this.maxNumberOfStudents = maxNumberOfStudents;
    }

    public Classroom(ArrayList<Student> students) {
        this.students = students;
    }

    public Classroom(int maxNumberOfStudents) {
        this.maxNumberOfStudents = maxNumberOfStudents;
    }

    public Classroom() {
        this.maxNumberOfStudents = 30;
        this.students = new ArrayList<Student>();
    }

    public ArrayList<Student> getStudents() {
        return (ArrayList<Student>) students.clone();
    }

    public Integer getAverageExamScore() {

        int sum = 0;
        int averagscore = 0;

        for (Student s : students) {

            sum = sum + s.getAverageExamScore();

            averagscore = sum / students.size();
        }

        return averagscore;


    }


    public void addStudent(Student student) {

        students.add(student);

    }

    public void clear() {

        students.clear();

    }

    public void removeStudent(String firstName, String lastName) {

        for (int i = 0; i < students.size(); i++) {

            if (students.get(i).getFirstName().equals(firstName) &&
                    students.get(i).getLastName().equals(lastName))


                students.remove(i);

        }
    }





    public Student[] getStudentByScore(Comparator<Student> comparator) {
        Student[] myarray = students.toArray(new Student[students.size()]);


       Arrays.sort(myarray, comparator);



        return myarray;



    }

    public Map<String, Student> getGradeBook() {

        Map<String, Student> studentmap = new HashMap<>();
        int totalStudents = 0;
        int totalexams = 0;
        int percentile = 1;
        int sum = 0;
        String Grade = "";


        for (int i = 0; i < students.size() - 1; i++) {
            if ((students.get(i).getAverageExamScore() > students.get(i + 1).getAverageExamScore())) {
                sum++;

                percentile = (sum / students.size()) * 100;


                if (percentile >= 10)


                    studentmap.put("Grade A", students.get(i));

                if (percentile >= 11 && percentile <= 29)
                    studentmap.put("Grade B", students.get(i));

                if (percentile >= 30 && percentile <= 50)
                    studentmap.put("Grade C", students.get(i));

                if (percentile >= 51 && percentile <= 89)
                    studentmap.put("Grade B", students.get(i));
                if (percentile <= 11)
                    studentmap.put("Grade F", students.get(i));


            }



        }
        return studentmap;
    }




}






