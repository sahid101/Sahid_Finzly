package com.tka.ProblemStatement2;

class StudentMember extends LibaryMember{

    public StudentMember(int memberID, String name) {
        super(memberID, name);
    }

    @Override
    void borrowItem(LibraryItem item) {
        item.displayInfo();
        System.out.println("Borrowed by : "+super.getName());
    }

    @Override
    public void reserveItem(LibraryItem item) {
        super.reserveItem(item);
    }
}
class FacultyMember extends LibaryMember{

    public FacultyMember(int memberID, String name) {
        super(memberID, name);
    }

    @Override
    void borrowItem(LibraryItem item) {
        item.displayInfo();
        System.out.println("Borrowed by : "+super.getName());
    }
    @Override
    public void reserveItem(LibraryItem item) {
        super.reserveItem(item);
    }
}
