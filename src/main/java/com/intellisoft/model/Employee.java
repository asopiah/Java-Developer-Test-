package com.intellisoft.model;

import javax.persistence.*;
import java.util.Date;

/*
* showing how hibernate and jjava persitance API can be use
* */

@Entity
@Table(name = "EMPLOYEEE")
public class Employee {

    //empty contructor
    public Employee() {}

    public Employee(Integer id, String firstName, String lastName, String dateOfBirth,
                    String address, String contractType, Date dateSigned, Date expiryDate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.contractType = contractType;
        this.dateSigned = dateSigned;
        this.expiryDate = expiryDate;
    }
/*define columns names*/
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name= "FIRSTNAME")//
    private String firstName;
    @Column(name = "LASTNAME")
    private String lastName;
    @Column(name="DATEOFBIRTH")
    private  String dateOfBirth;
    @Column(name="ADDRESS")
    private String address;
    @Column(name="CONTRACTYPE")
    private String contractType;
    @Column(name="DATESIGNED")
    private Date dateSigned;
    @Column(name = "EXPIRYDATE")
    private Date expiryDate;

    //Getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public Date getDateSigned() {
        return dateSigned;
    }

    public void setDateSigned(Date dateSigned) {
        this.dateSigned = dateSigned;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", address='" + address + '\'' +
                ", contractType='" + contractType + '\'' +
                ", dateSigned=" + dateSigned +
                ", expiryDate=" + expiryDate +
                '}';
    }
}
