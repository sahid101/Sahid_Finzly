package HibernateEmployeeAssignment.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee1 {
    int id;
    String firstname;
    String lastname;
    String dob;
    String email;
    String department;
    double salary;
    public Employee1(){}

    public Employee1(int id, String firstName, String lastName, String dob, String email, String department, double salary) {
        this.id = id;
        this.firstname = firstName;
        this.lastname = lastName;
        this.dob = dob;
        this.email = email;
        this.department = department;
        this.salary = salary;
    }
    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstname;
    }

    public void setFirstName(String firstName) {
        this.firstname = firstName;
    }

    public String getLastName() {
        return lastname;

    }

    public void setLastName(String lastName) {
        this.lastname = lastName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "id=" + id +
                ", firstName='" + firstname + '\'' +
                ", lastName='" + lastname + '\'' +
                ", dob='" + dob + '\'' +
                ", email='" + email + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
