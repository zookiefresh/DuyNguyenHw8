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

// Exception is derived from the throwable class 
public class InvalidCustomerException extends Exception{
    private String ssn;
    
    InvalidCustomerException(String ssn){
        this.ssn = ssn;
    }
    
    InvalidCustomerException(){
        this.ssn ="";
    }    
    
    @Override
    public String getMessage(){
        return "Exception: Invalid SSN " + ssn;
    }    
}

