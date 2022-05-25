/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.*;
import model.Supplier;

/**
 *
 * @author ANUBHAV MALVIYA
 */
public class SupplierDao {

    public static void save(Supplier supplier) {
        String query = "insert into supplier(billNo, supplierName, date, amount, billPaid) values('" + supplier.getBillNo() + "', '" + supplier.getSupplierName() + "', '" + supplier.getDate() + "', '" + supplier.getAmount() + "', '" + supplier.getBillPaid() + "')";
        DbOperations.setDataOrDelete(query, "Supplier Added Successfully");
    }

    public static ArrayList<Supplier> getAllRecords() {
        ArrayList<Supplier> arrayList = new ArrayList<>();
        try {
            ResultSet rs = DbOperations.getData("select * from supplier");
            while (rs.next()) {
                Supplier supplier = new Supplier();
                supplier.setId(rs.getInt("id"));
                supplier.setBillNo(rs.getString("billNo"));
                supplier.setSupplierName(rs.getString("supplierName"));
                supplier.setDate(rs.getString("date"));
                supplier.setAmount(rs.getString("amount"));
                supplier.setBillPaid(rs.getString("billPaid"));
                arrayList.add(supplier);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }

    public static void update(Supplier supplier) {
        String query = "update supplier set billNo = '" + supplier.getBillNo() + "', supplierName = '" + supplier.getSupplierName() + "', date = '" + supplier.getDate() + "', amount = '" + supplier.getAmount() + "', billPaid = '" + supplier.getBillPaid() + "' where id = '" + supplier.getId() + "'";
        DbOperations.setDataOrDelete(query, "Supplier Bill Details Updated Successfully");
    }

    public static void delete(int id) {
        String query = "delete from supplier where id = '" + id + "'";
        DbOperations.setDataOrDelete(query, "Supplier Bill Deleted Successfully");
    }

    public static ArrayList<Supplier> getAllRecords(String status) {
        ArrayList<Supplier> arrayList = new ArrayList<>();
        try {
            ResultSet rs = DbOperations.getData("select * from supplier where billPaid = '" + status + "'");
            while (rs.next()) {
                Supplier supplier = new Supplier();
                supplier.setId(rs.getInt("id"));
                supplier.setBillNo(rs.getString("billNo"));
                supplier.setSupplierName(rs.getString("supplierName"));
                supplier.setDate(rs.getString("date"));
                supplier.setAmount(rs.getString("amount"));
                supplier.setBillPaid(rs.getString("billPaid"));
                arrayList.add(supplier);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
}
