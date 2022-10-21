package com.example.oop.basics.inheritance.super_example;

import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by tkrud on 16.10.2022.
 */
public class Teacher extends Person{
    private String teachingSubject; //czego naucza ten nauczyciel

    Teacher(String name, String surname, String teachingSubject){
        super(name, surname);
        this.setTeachingSubject(teachingSubject);

    }

    public String getTeachingSubject() {
        return teachingSubject;
    }

    public void setTeachingSubject(String teachingSubject) {
        teachingSubject = teachingSubject.toLowerCase();

        switch (teachingSubject){
            case "math":
            case "english":
            case "sport":
                this.teachingSubject = teachingSubject;
                break;
            default:
                this.teachingSubject = "unknown";
        }


    }
}
