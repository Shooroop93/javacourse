package day9.Task1;

import day9.Task1.classes.Student;
import day9.Task1.classes.Teacher;

public class Task1 {
    public static void main(String[] args) {

        Student student = new Student("Сергеев", "100");

        Teacher teacher = new Teacher("Иванов", "Информатика");

        student.printInfo();

        teacher.printInfo();

        System.out.println(student.getGroupName());
        System.out.println(teacher.getSubjectName());
        System.out.println(student.getName());
        System.out.println(teacher.getName());

    }
}
