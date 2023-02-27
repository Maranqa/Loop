package com.loop;

public class Nested_If {
	public static void main(String[] args)
{
	
		int i=36;
		if(i>=90) {
			System.out.println("O^+ grade");
		}
	else if(i>=80) 
		               {
			             System.out.println("O grade");
			           }
		
	else if(i>=70) 
	                  {
				        System.out.println("A grade");
				        }
			     
	else if(i>=60)
			         {
				       System.out.println("B grade");
			           }
	else if(i>=50) 
	                 {
				       System.out.println("C grade");
	                   }
	else if(i>=40) 
	                {
				      System.out.println("D grade");
			          }
	else if (i>=35) 
			       {
				     System.out.println("E grade");
				      }
	else {
		System.out.println("arrear");
	}
	}
}
