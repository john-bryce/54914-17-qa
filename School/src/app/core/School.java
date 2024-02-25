package app.core;

import java.io.*;

public class School {
    String name;
    String address;
    int indTeachers;
    int indStudents;

    Teacher[] teachers;
    Student[] students = new Student[100];

    {
        // load all teachers from file
        File file = new File("c:/temp/teachers.obj");
        if(teachers==null){
            teachers = new Teacher[10];
        }
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
            System.out.println("reading from file");
           teachers =  (Teacher[])in.readObject();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    void addTeacher(Teacher teacher) {
        teachers[indTeachers] = teacher;
        indTeachers++;
        // add the teacher to a file
        File file = new File("c:/temp/teachers.obj");
        try {
            file.createNewFile();
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
            out.writeObject(teachers);
            out.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    void addStudent(Student student) {
        students[indStudents] = student;
        indStudents++;
    }

    void showTeachers() {
        System.out.println("School Teachers ===============");
        for (int i = 0; i < indTeachers; i++) {
            Teacher t = teachers[i];
            t.printDetails();
        }
        System.out.println("=============== ===============");
    }

    void showStudents() {
        System.out.println("School Students ===============");
        for (int i = 0; i < indStudents; i++) {
            Student s = students[i];
            s.printDetails();
        }
        System.out.println("=============== ===============");
    }
}
