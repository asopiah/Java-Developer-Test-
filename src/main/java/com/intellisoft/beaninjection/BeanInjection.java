package com.intellisoft.beaninjection;
import com.intellisoft.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/*
* class to show bean injection using spring annoations
*
* */

public class BeanInjection {
    //bean injection by use of annotations
    @Autowired
    @Qualifier("employee1")
    private Employee employee;

    public BeanInjection(){
        System.out.println("Inside bean constructor." );
    }
    public void printName() {
        System.out.println("Name : " + employee.getFirstName()+ employee.getLastName() );
    }
    public void printAddress() {
        System.out.println("Address : " + employee.getAddress() );
            }
    public void printContractType() {
        System.out.println("Contract Type : " + employee.getContractType() );
    }
    public void printDateOfSigned() {
        System.out.println("Date of signed : " + employee.getDateSigned() );
    }
    public void printExpiryDate() {
        System.out.println("Contract expiry date : " + employee.getExpiryDate() );
    }
}