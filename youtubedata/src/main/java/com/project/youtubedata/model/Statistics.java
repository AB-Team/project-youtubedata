package com.project.youtubedata.model;

public class Statistics {

    private int views;

    public Statistics(String views) {
        this.views = Integer.parseInt(views);
    }

    public Statistics() {}

    public int getViews() {
        return views;
    }

    public void setViews(String views) {
        this.views = Integer.parseInt(views);
    }
}
