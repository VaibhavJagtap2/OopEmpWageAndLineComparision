package com.ooplinecomparisionproblem;

import java.util.Scanner;

public class OopLineComparisionProblem {
	public static void main(String[] args) {
		 EqualCheck();
		 Compare();
	  }
	  static double X1,X2,Y1,Y2;
	  static double length;
	  static double lengthline1,lengthline2;
	   public static void values(){
	      System.out.println("Enter values of points");
	 	   
	    Scanner point=new Scanner(System.in);
	    X1=point.nextDouble();
	    X2=point.nextDouble();
	    Y1=point.nextDouble();
	    Y2=point.nextDouble();
	    System.out.println("Points are: ("+X1+","+X2+")"+"("+Y1+","+Y2+")");

	  }
	   private static int calculation(){

	  	 	length=Math.sqrt(Math.pow(X2 - X1, 2)+Math.pow(Y2 - Y1, 2)*1.0 );
			 return (int) length;
	  	}
	   private static void EqualCheck(){
		   
		   System.out.println("length");
		   values();
		   calculation();
		   length=length;
		   System.out.println("length of line ="+length);
	       System.out.println("For line 1:---");
	       values();
	       calculation();
	       lengthline1=length;
	       System.out.println("length of line 1="+lengthline1);
	       System.out.println("For line 2:---");
	       values();
	       calculation();
	       lengthline2=length;
	       System.out.println("length of line 2="+lengthline2);


	   }
	   public static void Compare(){
	       Integer L1=(int)lengthline1;
	       Integer L2=(int)lengthline2;
	       if (L1<L2){
	           System.out.println("Line 2 is greater than line 1 ");
	       }
	       else if (L1>L2){
	           System.out.println("Line 1 is greater than line 2 ");
	       }
	       else {
	           System.out.println("Both the lines are equal");
	       }
	   }
	}	

