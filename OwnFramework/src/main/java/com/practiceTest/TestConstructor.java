package com.practiceTest;

public class TestConstructor {
	
	 static int a;
	 static int b;
	  
	TestConstructor(int a, int b){
		  this.a=a; 
		  this.b=b;  
	  }
	  
   void getsum(){
	int c=a+b;	
	System.out.println("Summation="+ c);	
	}
	
	  int getmulti(){
		int c=a*b;
		return c; 
	
	}

	}
