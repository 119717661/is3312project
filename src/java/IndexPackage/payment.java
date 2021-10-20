package IndexPackage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fmspj
 */
public class payment {
    String email;
    String name;
    boolean confirmation;
    private payment(String cEmail, String cName, boolean cConfrimation){
        this.email = cEmail;
        this.name = cName;
        this.confirmation = cConfrimation;
    }
}
/*
ORGs do not handle their own payments, instead of it is likely i would use 2 functions:
invokePaypal()
invokeCard()
Both are external services which upon complition should return boolean value on complition 
IE. 
Paid confirmation = True, break else
Not paid/insufficient funds = False , break



*/
