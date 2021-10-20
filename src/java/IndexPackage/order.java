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
public class order {
    int orderID;
    String orderDate;
    String email;
    boolean orderStatus;
    
    private order(int cOrderID, String cOrderDate, String cEmail, boolean cOrderStatus){
        this.orderID = cOrderID;
        this.orderDate = cOrderDate;
        this.email = cEmail;
        this.orderStatus = cOrderStatus;
    }
}


/* Possible methods : 
+ placeOrder()
*/
