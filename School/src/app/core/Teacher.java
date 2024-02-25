package app.core;

import java.io.Serializable;

public class Teacher implements Serializable {

    int id;
    String name;
    String subject;

    void printDetails(){
        System.out.println("Teacher[id=" + id + ", name=" + name + ", subject=" + subject + "]");
    }
}
