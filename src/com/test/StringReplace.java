package com.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StringReplace {

	public static void main(String[] args)throws Exception{
			
			   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			   //welcome to java
			   System.out.println("please enter the string:");
			   String st=br.readLine();
			   System.out.println(st.replace(" ",","));

	}

}
