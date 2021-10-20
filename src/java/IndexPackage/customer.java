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
public class customer {
    // email = unique id
    String email;
    String name;
    String address;
    int pNumber;
    
    
    
    
    private customer(String cEmail, String cName, String cAddress, int cPNumber){
        this.email = cEmail;
        this.name = cName;
        this.address = cAddress;
        this.pNumber = cPNumber;
    }
}
/*
Possible methods : 
userLogin()
userRegister()
userUpdate()
*/