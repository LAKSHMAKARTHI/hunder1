package com.cogzidel.lk;

import java.util.*;
public class Sample {

	
	  public static void main(String args[]){
	    Scanner in=new Scanner(System.in);
	    String s="";
	    System.out.println("enter the string :");
	    s=in.nextLine();
	    if(s.length()%2==0)
	    {
	      System.out.println("the maximum length of non palindrome substring :"+s.length());
	    }
	    else
	    {
	      System.out.println("the maximum length of non palindrome substring is :"+s.length()+1);
	    }
	  }
	}

	   
