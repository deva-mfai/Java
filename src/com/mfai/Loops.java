package com.mfai;

public class Loops {
	public static void main(String[] args) {
		int i = 0;
		while (i < 5) {
		    System.out.print(i + " ");	// 0 1 2 
		    System.out.println(++i +"  "); // 0 1 
		    if (i == 3) //1 2
		        break;
		}
	}
}



/*
 * Difference Conditional Statements and Loopings
 * 
 * Conditional Statements:
 * 			->if
 * 			->if....else
 * 			->if...else ladder
 * 			->switch
 * Loops:
 * 		10+11+12+13+14......+20 => Loops
 * 
 * 		->for 
 * 			# when you have a fixed n times to execute a certain process
 * 			# for(variable insitalisation;condition;increment/decrement)
 * 			# for(int i=1;i<=10;i++)
 * 				for(j=1;j<=9;j++) //for every i it will execute n times in this case it is 9 times
 * 					if(i==2)
 * 						break;
 * 
 * 			# for(int i=10;i<=20;i++)
 * 				if(i==15)
 * 				{
 * 					continue;
 * 				}
 * 		->while
 * 			# when you didn't know the number of times the operation is going to execute
 * 			# entry check condition
 * 			# while(condition)
 * 			# n=40;
 *
 * 			# while(n==0) 
 * 		->do....while
 * 			# always execute the operations atleast once and then check the condition
 * 			# exit check condition
 * 			
 * 		->for each
 * 			# enchanced version of for loop
 * 			# arrays,collections 
 * 			arr[] = [1,2,4,5]
 * 			for(variable : data_varaiable)
 * 			for(int element : arr)
 * 
 * 		->break //It is a statement
 * 			->Exit the loop even though did does't satisfy the condition
 * 			-> it will break a single loop
 * 		
 * 		-> continue //It is a statement
 * 			->to skip an iteration
 * 		
 * 		Pre-increment increments the value first and then uses it,
 * 		Post-increment uses the value first and then increments next.
 * 	
 * *\
 */