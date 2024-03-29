/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Users;

import Business.Abstract.User;
import Business.CustomerDirectory;
import java.util.Date;

/**
 *
 * @author AEDSpring2019
 */
public class Customer extends User implements Comparable<Customer> {

    private CustomerDirectory directory;

    private Date date;

    public Customer(String password, String userName, Date date) {
        super(password, userName, "CUSTOMER");
        this.date = date;
        directory = new CustomerDirectory();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public CustomerDirectory getDirectory() {
        return directory;
    }

    public void setDirectory(CustomerDirectory directory) {
        this.directory = directory;
    }

    @Override
    public boolean verify(String password) {
        if (password.equals(getPassword())) {
            return true;
        }
        return false;
    }

    @Override
    public int compareTo(Customer o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
