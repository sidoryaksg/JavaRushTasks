package com.javarush.task.task17.task1714;

/* 
Comparable
*/

public class Beach implements Comparable<Beach>{
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    public synchronized String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public synchronized float getDistance() {
        return distance;
    }

    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public synchronized int getQuality() {
        return quality;
    }

    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }

    @Override
    public synchronized int compareTo(Beach o) {
        int current=0;
        int other=0;
        float dist = distance - o.getDistance();
        if (dist > 0)
            other++;
        else if (dist < 0)
            current++;

        int qual = quality - o.getQuality();
        if (qual < 0)
            other++;
        else if (qual > 0)
            current++;
        return current-other;


    }

    public static void main(String[] args) {

    }
}
