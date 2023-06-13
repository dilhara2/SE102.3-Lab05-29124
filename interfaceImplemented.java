
package com.mycompany.pr5;
import static com.mycompany.pr5.MyFirstinterface.x;

class interfaceImplemented implements MyFirstinterface {

    @Override
    public void display() 
    {
       
        System.out.println("The value of x :"+x);
        
    }
    
}
