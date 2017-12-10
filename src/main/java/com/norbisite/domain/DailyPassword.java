package com.norbisite.domain;

import javax.persistence.*;

@Entity
@Table(name = "daily_passwords")
public class DailyPassword {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "day")
    private int day;

    @Column(name = "password")
    private String password;

    public DailyPassword(int day, String password) {
        this.day = day;
        this.password = password;
    }

    public DailyPassword() {
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
