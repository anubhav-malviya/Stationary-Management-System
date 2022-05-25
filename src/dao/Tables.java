/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;

/**
 *
 * @author ANUBHAV MALVIYA
 */
public class Tables {

    public static void main(String[] args) {
        try {
            String userTable = "create table user(id int AUTO_INCREMENT primary key, name varchar(200), email varchar(200), mobileNumber varchar(10), address varchar(200), password varchar(200), securityQuestion varchar(200), answer varchar(200), status varchar(20), UNIQUE(email))";
            String adminDetails = "insert into user(name, email, mobileNumber, address, password, securityQuestion, answer, status) values('Anubhav Malviya', 'anubhav.malviya2000@gmail.com', '8770390404', '263 Dhanwantri Nagar Indore', 'anubhav2000', 'What is your 12th Board Exam Percentage?', '79.6', 'true')";
            String categoryTable = "create table category(id int AUTO_INCREMENT primary key, name varchar(200))";
            String productTable = "create table product(id int AUTO_INCREMENT primary key, name varchar(200), category varchar(200), price varchar(200))";
            String billTable = "create table bill(id int primary key, name varchar(200), mobileNumber varchar(200), email varchar(200), date varchar(50), total varchar(200), createdBy varchar(200))";
            String supplierTable = "create table supplier(id int AUTO_INCREMENT primary key, billNo varchar(200), supplierName varchar(200), date varchar(50), amount varchar(200), billPaid varchar(20))";
            
            DbOperations.setDataOrDelete(userTable, "User Table Created Successfully");
            DbOperations.setDataOrDelete(adminDetails, "Admin Details Added Successfully");
            DbOperations.setDataOrDelete(categoryTable, "Category Table Created Successfully");
            DbOperations.setDataOrDelete(productTable, "Product Table Created Successfully");
            DbOperations.setDataOrDelete(billTable, "Bill Table Created Successfully");
            DbOperations.setDataOrDelete(supplierTable, "Supplier Table Created Successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
    }
}
