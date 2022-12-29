package org.example;

public class Member {
    private String name;
    private String firstName;
    private String middleName;
    private String lastName;
    private final String categoryKey;
    private final String remarks;

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

    public String getName() {
        return name;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCategoryKey() {
        return categoryKey;
    }

    public String getRemarks() {
        return remarks;
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
