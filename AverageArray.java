//Question 3
package com.test.array;

import java.util.Scanner;

public class AverageArray {
		 public static void main(String[] args)
		 {
			 Scanner sc=new Scanner(System.in);
			 //Creating an array of integer 
		    int[] nums = new int[5];
		    
		    //Initializing the value of integer variable
			System.out.println("enter "+nums.length+" values:");
			
			for(int i=0;i<nums.length;i++)
				nums[i]=sc.nextInt();
			
			int max = nums[0];
			int min = nums[0];
			float sum = nums[0];
			for(int i = 1; i < nums.length; i++)
			{
				sum  += nums[i];   // sum the array elements
				if(nums[i] > max)
					max = nums[i];  // give max value
				else if(nums[i] < min)
					min = nums[i];    //give min value
			}
			float x = ((sum-max-min) / (nums.length - 2)); //gives average after excluding max and min value
			System.out.println("Maximum no. is "+max);
			System.out.println("Minimum no. is "+min);
			System.out.println("Average value of an array of integers except the largest and smallest values:");
			System.out.println(x);
			System.out.print("\n");	
			sc.close();
		  }
}
