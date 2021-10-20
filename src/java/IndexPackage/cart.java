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
public class cart {
    int cartID;
    int productID;
    int quantity;
    
    private cart(int cCartID, int cProductID, int cQuantity){
        this.cartID = cCartID;
        this.productID = cProductID;
        this.quantity = cQuantity;
    }
}


/* Possible methods : 

+addProcut()
+updateCart()
+checkOut()

*/

