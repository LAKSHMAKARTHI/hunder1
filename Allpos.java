package com.cogzidel.lk;

import java.util.*;
public class Sample {

	
	  public static void main(String args[]){
	    Scanner in=new Scanner(System.in);
	    String s="";
	    char c,ch;
	    System.out.println("enter the string :");
	    s=in.nextLine();
	   
	    
	    for(int i=1;i<=s.length();i++){
	    	c=s.charAt(0);
	    	ch=s.charAt(i);
	    	System.out.println(c+" "+ch);
	    		
	    	
	    }
	    
	    
	  }
	}

	   
