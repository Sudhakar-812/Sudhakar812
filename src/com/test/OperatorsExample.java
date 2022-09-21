package com.test;

public class OperatorsExample {

	public static void main(String[] args) {
		
		int a=10,b=10,c=50;
		
		if(a<b || b>c)
		{
			System.out.println("Hello World!!..");  
		}
        if(a!=b)
        {
        	System.out.println("Its False");  
        }
        else
        {
        	System.out.println("Its True");  
        }
	    
        
        if((a==b)!=true)
        {
        	System.out.println("Its Equal");  
        }
        else
        {
        	System.out.println("Its Not Equal");  
        }
        
        
        System.out.println(a+b);  
        System.out.println(a/b);  
        System.out.println(a%b);  
        System.out.println(a<b && b>c);  
        
        a=10;
        b=20;
        c=30;
        int result=a>b? a>c?a:c : b>c?b:c;
        System.out.println(result); 
        
        a=5; //0101
        b=7; //0111
        c=-40;
             //010
             //101 -> 5
              //111
        
        System.out.println(a & b);  
        System.out.println(a | b);
        System.out.println(a ^ b); //2
        System.out.println(~a);
        System.out.println(a >> 2);
        System.out.println(a << 2); //000101 - 010100 -> 20
        System.out.println(c >> 2);
        System.out.println(c >>> 2);
        		
	}
	
}


