package app.core;

public class School {
    String name;
    String address;
    int indTeachers;
    int indStudents;

    Teacher[] teachers = new Teacher[10];
    Student[] students = new Student[100];

    void addTeacher(Teacher teacher) {
        teachers[indTeachers] = teacher;
        indTeachers++;
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
