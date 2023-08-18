package com.tka.ProblemStatement2;

public abstract class LibaryMember implements Reservable {
    private int memberID;
    private String name;

    public LibaryMember(int memberID, String name) {
        this.memberID = memberID;
        this.name = name;
    }

    public int getMemberID() {
        return memberID;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract void borrowItem(LibraryItem item);

    @Override
    public void reserveItem(LibraryItem item) {
        item.displayInfo();
        System.out.println("Gets Reserved : ");
        System.out.println("-------------------");
    }
}
