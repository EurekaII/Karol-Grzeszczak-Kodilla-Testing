package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.Period;

public class ForumUser {
    private static int count;

    private int userId = count++;
    private String userName;
    private char gender;
    private LocalDate birthdate;
    private int posts;

    private boolean result;
    LocalDate currentDate = LocalDate.now();


    public ForumUser(String userName, char gender, LocalDate birthdate, int posts) {
        this.userName = userName;
        this.gender = gender;
        this.birthdate = birthdate;
        this.posts = posts;
    }

    //for male
    public boolean isMale() {
        return gender == 'M' || gender == 'm';
    }

    //for female
    public boolean isFemale() {
        return gender == 'F' || gender == 'f';
    }


    public boolean isOver20() {
        if (Period.between(getBirthdate(), currentDate).getYears() > 20) {
            return true;
        } else if (Period.between(getBirthdate(), currentDate).getYears() == 20){
            if (currentDate.getDayOfYear() >= getBirthdate().getDayOfYear()) {
                return result=true;
            } else {
                return result=false;
            }
        }
        return result;
    }

    public boolean hasPosts() {
        return posts > 0;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public int getPosts() {
        return posts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ",birthdate=" + birthdate +
                '}';
    }
}