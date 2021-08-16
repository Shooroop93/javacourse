package day6.classes;

import java.util.Random;

public class Teacher {

    private String name;
    private String article;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public Teacher(String name, String article) {
        this.name = name;
        this.article = article;
    }

    public void evaluate (Student student) {
        String grade = null;
        Random random = new Random();
        int randomValue = random.nextInt(4) + 2;

        switch (randomValue){
            case 2:
                grade = "неудовлетворительно";
                break;
            case 3:
                grade = "удовлетворительно";
                break;
            case 4:
                grade = "хорошо";
                break;
            default:
                grade = "отлично";
                break;
        }

        System.out.printf("Преподаватель %s оценил студента с именем %s по предмету %s на оценку %s.",this.name,student.getName(),this.article,grade);

    }

}
