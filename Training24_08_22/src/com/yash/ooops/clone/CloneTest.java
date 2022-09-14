package com.yash.ooops.clone;

public class CloneTest {
	
public static void main(String[] args) throws CloneNotSupportedException {
        
        Product pro1=new Product(105, "gold", 2000, "Gram");
        
        Product pro2=(Product) pro1.clone();
        pro2.setPname("Silver");
        pro2.setPrice(100);
        
        System.out.println(pro2);
        if(pro2 instanceof Product) {
            
            System.out.println("Objects are same");
        }
        
    }

}
