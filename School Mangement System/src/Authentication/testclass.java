/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Authentication;

/**
 *
 * @author Santosh Gupta
 */
public class testclass {
    
    int a;
    
    void setid()
    {
        a=6;
    }
    int getid()
    {
        System.out.println(a);
        return  a;
    }
    
    public static void main(String arg[]){
        testclass ob = new testclass();
        ob.setid();
        ob.getid();
    }
    
}
