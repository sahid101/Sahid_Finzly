package com.tka.ProblemStatement2;

public class Main {
    public static void main(String[] args) {
        Books b = new Books("Sara",123,"sk");
        DVDs d = new DVDs("SomeFilm", 121,210);

//        b.displayInfo();
//        d.displayInfo();

        StudentMember sahid = new StudentMember(123,"Sahid Ansari");
        FacultyMember sagar = new FacultyMember(111,"Sagar Sir");

        sahid.reserveItem(b);
        sahid.borrowItem(b);

        sagar.reserveItem(d);
        sagar.borrowItem(d);


    }
}
