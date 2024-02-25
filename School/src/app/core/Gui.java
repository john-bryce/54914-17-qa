package app.core;

import javax.swing.*;

public class Gui {

    public static void main(String[] args) {
        School school = new School();
        JFrame fr = new JFrame("School");
        fr.setLayout(null);
        fr.setBounds(100, 100, 600, 300);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // add teacher
        JLabel lbName = new JLabel("teacher name");
        lbName.setBounds(10, 10, 120, 25);
        JTextField tfName = new JTextField();
        tfName.setBounds(150, 10, 120, 25);
        JButton btAdd = new JButton("Add Teacher");
        btAdd.setBounds(10, 50, 120, 25);
        btAdd.addActionListener((b)->{
            Teacher teacher = new Teacher();
            teacher.name = tfName.getText();
            school.addTeacher(teacher);
            school.showTeachers();
        });

        fr.add(lbName);
        fr.add(tfName);
        fr.add(btAdd);

        fr.setVisible(true);
    }
}
