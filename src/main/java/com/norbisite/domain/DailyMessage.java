package com.norbisite.domain;
import javax.persistence.*;

@Entity
@Table(name = "daily_messages")
public class DailyMessage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "day")
    private int day;

    @Column(name = "message",columnDefinition = "LONGTEXT")
    private String message;


    public DailyMessage() {
    }

    public DailyMessage(int day, String message) {
        this.message = message;
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
