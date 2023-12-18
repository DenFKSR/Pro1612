package laba3.task1;

public class Study {
    private String course;

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Study() {

    }

    public Study(String course) {
        this.course = course;
    }
    public String printCourse() {
        System.out.println(this.course);
        return this.course;
    }


}
