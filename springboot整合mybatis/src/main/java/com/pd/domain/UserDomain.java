package com.pd.domain;

import org.springframework.stereotype.Component;

@Component
public class UserDomain {
    //姓名,成绩,科目
    private String user_name, user_subject;
    private int user_scores;

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_subject() {
        return user_subject;
    }

    public void setUser_subject(String user_subject) {
        this.user_subject = user_subject;
    }

    public int getUser_scores() {
        return user_scores;
    }

    public void setUser_scores(int user_scores) {
        this.user_scores = user_scores;
    }
}
