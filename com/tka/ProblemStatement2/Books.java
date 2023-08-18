package com.tka.ProblemStatement2;

public class Books extends LibraryItem{
    private String author;
    public Books(String title, int itemId,String author) {
        super(title, itemId);
        this.author=author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public void displayInfo() {
        System.out.println("Title : "+super.getTitle()+" Id :"+ super.getItemId()+" Author : "+ this.author);
    }

}
