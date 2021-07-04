package programs;

import java.io.*;
import java.util.*;

public class Anagram {


	    static boolean exampleAnagram(char[] str1, char[] str2)    // method to check whether two strings are anagram
	    {
	        
	        int n1 = str1.length;                     //taken length of both strings
	        int n2 = str2.length;
	 
	     
	        if (n1 != n2)               //length of both strings are not match
	            return false;           // then they cannot be anagram
	 
	        
	        Arrays.sort(str1);     // Sort both strings
	        Arrays.sort(str2);
	 
	        
	        for (int i = 0; i < n1; i++)           // Compare sorted strings
	            if (str1[i] != str2[i])
	                return false;
	 
	        return true;
	    }
	 
	  
	    public static void main(String args[])           // main method
	    {
	        char str1[] = { 'p', 'q', 'r', 's' };
	        char str2[] = { 's', 'q', 'r', 'p' };
	       
	       
	        if (exampleAnagram(str1, str2))          // Function Call
	            System.out.println("The two strings are"  + " anagram ");
	                              
	        else
	            System.out.println("The two strings are not"  + " anagram ");
	                               
	    }
	}

