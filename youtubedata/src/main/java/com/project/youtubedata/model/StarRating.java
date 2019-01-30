package com.project.youtubedata.model;

public class StarRating {

    private int count;
    private float average;
    private int min;
    private int max;

    public StarRating(String count, String average, String min, String max) {
        this.count = Integer.parseInt(count);
        this.average = Float.parseFloat(average);
        this.min = Integer.parseInt(min);
        this.max = Integer.parseInt(max);
    }

    public StarRating() {}

    public int getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = Integer.parseInt(count);
    }

    public float getAverage() {
        return average;
    }

    public void setAverage(String average) {
        this.average = Float.parseFloat(average);
    }

    public int getMin() {
        return min;
    }

    public void setMin(String min) {
        this.min = Integer.parseInt(min);
    }

    public int getMax() {
        return max;
    }

    public void setMax(String max) {
        this.max = Integer.parseInt(max);
    }
}
