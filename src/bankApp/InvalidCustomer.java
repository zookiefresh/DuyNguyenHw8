/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankApp;

/**
 *
 * @author duy
 */
public class InvalidCustomer extends Exception{
    private String ssn;
    
    InvalidCustomer(String ssn){
        this.ssn = ssn;
    }
    
    @Override
    public String getMessage(){
        return "“Invalid SSN " + ssn;
    }    
}
