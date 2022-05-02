package com.greatlearning.main;

import com.greatlearning.balancingbrackets.*;

import java.util.*;

public class Main {
	
			

	// Driver code
	public static void main(String[] args) {
		BalancingBrackets a= new BalancingBrackets();
 
		String expr = "( [ [ { } ] ] )";
		// Function call
		if (a.areBracketsBalanced(expr))
			System.out.println("Balanced ");
		else
			System.out.println("Not Balanced ");
	}

}
