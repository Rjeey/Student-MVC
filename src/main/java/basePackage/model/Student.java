package basePackage.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document(collection = Student.COLLECTION_NAME)
public class Student implements Serializable {
    public static final String COLLECTION_NAME="info";

    @Id
    private Long id;

    private String name;
    private String surename;
    private String  date;
    private int number;
    private int course;
    private String gender;
    private boolean payskin;

    public Student (String name,String surename,String date,int number,int course,String  gender,boolean payskin){
        this.name=name;
        this.surename=surename;
        this.date=date;
        this.number=number;
        this.course=course;
        this.gender=gender;
        this.payskin=payskin;
    }
    public Student(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurename() {
        return surename;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isPayskin() {
        return payskin;
    }

    public void setPayskin(boolean payskin) {
        this.payskin = payskin;
    }
}
