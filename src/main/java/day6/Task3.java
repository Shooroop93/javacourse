package day6;

import day6.classes.Student;
import day6.classes.Teacher;

public class Task3 {
    public static void main(String[] args) {

        Teacher teacher = new Teacher("Иванов Иван Иванович", "Информатика");
        Student student = new Student("Бездельник");

        teacher.evaluate(student);
    }
}
