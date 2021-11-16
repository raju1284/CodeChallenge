import java.io.*;
import java.util.*;

public class TransposeLongestWord {

	// Method to read the input file and find the longest word and return the word
	public static String longestWord(String Filepath) throws FileNotFoundException
	{
		String longest_word = "";
	       String current;
	       //Checking the file format
	       if (Filepath.endsWith(".txt"))
			{
	    	   try {
	    		   	//Reading the file to scanner class
				Scanner sc = new Scanner(new File(Filepath));

	    		   	//checking the longest word
				while (sc.hasNext()) {
	    		   	current = sc.next();
	    		   		if (current.length() > longest_word.length()) {
	    		   			longest_word = current;
	             
	    		   		}

	    		   	}
	    	   }
		//Handling the File not found exception
	    	   catch(Exception FileNotFoundException)
	    	   {
	    	   longest_word = "File not Found";
	    	   }
			}
	       else
	    	   longest_word = "Please enter the path in text file format only";
	       if (longest_word=="")
	    	   longest_word="Emptyfile No words";
	      
	       return longest_word;
	}
//Method to reverse a string and return the string using StringBuilder reverse function
	public static String TransposeWord(String longestword)
	{
       
         
	         StringBuilder Tlongest_word = new StringBuilder();
	         Tlongest_word.append(longestword);
	         Tlongest_word.reverse();         
	         return Tlongest_word.toString();
    }
// Main method to test the above methods	
	public static void main(String [] args) throws FileNotFoundException
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the path of file:");
		String Filenamepath = sc.nextLine(); // Reading the input file path from the user
		
			String logestword = longestWord(Filenamepath); // finding the longest word
			
			if (logestword=="File not Found" || logestword=="Please enter the path in text file format only")
				System.out.println(logestword);
			else
				
			{
				System.out.println("Longesword in a file:"+logestword);
				String transposeword =TransposeWord(logestword); //Reverse  the string
				System.out.println("Transposed word:"+transposeword);
				}
		sc.close();		
			
	}
	
}
