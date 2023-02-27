package com.loop;

public class SampleDiamondNumber {
	public static void main(String[] args)   {  
		for (int i = 0; i<4; i++)  {  
			int n = 4;  
			for (int j = 1; j<= n - i; j++)   {   
				System.out.print(" ");   
				}   
			for (int k = i; k >= 0; k--)  {  
				System.out.print(k);  
			}  
			for (int l = 1; l <= i; l++)   {  
				System.out.print(l);   
			}   
			System.out.println();   
		}   
			for (int i = 2; i >= 0; i--)  {  
				int n = 3;  
				for (int j = 0; j<= n - i; j++)   {  
				System.out.print(" ");   
				}   
				for (int k = i; k >= 0; k--)  {  
				System.out.print(k);  
				}  
				for (int l = 1; l <= i; l++)  {  
				System.out.print(l);  
				}  
				System.out.println();  
		} 
	}  
	}  