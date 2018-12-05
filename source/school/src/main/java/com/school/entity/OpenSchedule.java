package com.school.entity;

import java.util.Date;

public class OpenSchedule {
    private Integer id;

    private String day;

    private Date startTime;

    private Date endTime;

    private String courseName;

    private Integer techerId;

    private Integer bookAbleNum;

    private Integer bookNum;

    private Integer flag;

    public OpenSchedule(Integer id, String day, Date startTime, Date endTime, String courseName, Integer techerId, Integer bookAbleNum, Integer bookNum, Integer flag) {
        this.id = id;
        this.day = day;
        this.startTime = startTime;
        this.endTime = endTime;
        this.courseName = courseName;
        this.techerId = techerId;
        this.bookAbleNum = bookAbleNum;
        this.bookNum = bookNum;
        this.flag = flag;
    }

    public OpenSchedule() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day == null ? null : day.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName == null ? null : courseName.trim();
    }

    public Integer getTecherId() {
        return techerId;
    }

    public void setTecherId(Integer techerId) {
        this.techerId = techerId;
    }

    public Integer getBookAbleNum() {
        return bookAbleNum;
    }

    public void setBookAbleNum(Integer bookAbleNum) {
        this.bookAbleNum = bookAbleNum;
    }

    public Integer getBookNum() {
        return bookNum;
    }

    public void setBookNum(Integer bookNum) {
        this.bookNum = bookNum;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}