package com.cogzidel.lk;

import java.util.*;
public class Sample{
public static void main(String[] args) {
	        System.out.println("Enter a string:");
	        Scanner s=new Scanner(System.in);
	        String a=s.nextLine();
	        String b="";
	        char c;
	        int l=a.length();
	        for(int i=0;i<l-1;i++){
	        c=a.charAt(i);
	        if(c!=' '){
	            b=b+c;
	            a=a.replace(c,' ');
	    }}
	            System.out.println("the string is"+b);
	    

	}}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	




