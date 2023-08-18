package com.tka.ProblemStatement2;

public class DVDs extends LibraryItem {
    private int duration;
    public DVDs(String title, int itemId,int duration) {
        super(title, itemId);
        this.duration=duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public void displayInfo() {
        System.out.println("Title : "+super.getTitle()+" Id : "+ super.getItemId()+" Duration : "+ this.duration);
    }

}
