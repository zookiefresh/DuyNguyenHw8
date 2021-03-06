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

public class Customer {
    // First choice should always be private. Esclate to grant access as needed
    private String firstname;
    private String lastname;
    private String socialSecurityNumber;
    
    Customer(String firstName, String lastName, String socialSecurityNumber) throws InvalidCustomerException {
        this.firstname = firstName;
        this.lastname = lastName;        
        
        checkSocial(socialSecurityNumber);
        this.socialSecurityNumber = socialSecurityNumber;   
        
    }
    
    Customer(){
        
    }
    
    private static void checkSocial(String s) throws InvalidCustomerException{
        if(!s.matches("\\d{3}-\\d{2}-\\d{4}")){
            throw new InvalidCustomerException(s);            
        }
    }
    
    String getName(){
        return firstname + " " + lastname;
    }
}
