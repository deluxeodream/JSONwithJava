package org.example;

public class Member {
    public String name;
    public String firstName;
    public String middleName;
    public String lastName;
    public String categoryKey;
    public String remarks;

    public Member(String name, String categoryKey, String remarks) {
        this.name = name;
        this.categoryKey = categoryKey;
        this.remarks = remarks;
    }

    public Member(String firstName, String middleName, String lastName, String categoryKey, String remarks) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.categoryKey = categoryKey;
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", categoryKey='" + categoryKey + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
