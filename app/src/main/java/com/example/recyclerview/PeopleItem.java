package com.example.recyclerview;

public class PeopleItem {

    private int num;
    private int points;
    private int level;

    private String imgURL;
    private String name;

    public PeopleItem(int num, String url, String name, int points, int level) {
        this.num = num;
        this.imgURL = url;
        this.name = name;
        this.points = points;
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public int getNum() {
        return num;
    }

    public int getPoints() {
        return points;
    }

    public String getImgURL() {
        return imgURL;
    }

    public String getName() {
        return name;
    }

}
