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
abstract class products {
    int productID;
    String productName;
    String productType;
    String productSize;
    
    products(int cProductID, String cProductName, String cProductType, String cProductSize){
        productID = cProductID;
        productName = cProductName;
        productType = cProductType;
        productSize = cProductSize;
    }
}
     class ties extends products{
        
        public ties(int cProductID, String cProductName, String cProductType, String cProductSize) {
            super(cProductID, cProductName, cProductType, cProductSize);
        }
        
    }
    
     class shirt extends products{
        
        public shirt(int cProductID, String cProductName, String cProductType, String cProductSize) {
            super(cProductID, cProductName, cProductType, cProductSize);
        }
        
    }

/*
Possible methods : 
filterProducts()
searchProcuts()
*/