import java.io.*;
import java.util.*;

public class TransposeLongestWord {

	
	public static String longestWord(String Filepath) throws FileNotFoundException
	{
		String longest_word = "";
	       String current;
	       
	       if (Filepath.contains(".txt"))
			{
	    	   try {
	    		   	Scanner sc = new Scanner(new File(Filepath));

	    		   	while (sc.hasNext()) {
	    		   	current = sc.next();
	    		   		if (current.length() > longest_word.length()) {
	    		   			longest_word = current;
	             
	    		   		}

	    		   	}
	    	   }
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
	public static String TransposeWord(String longestword)
	{
       
         
	         StringBuilder Tlongest_word = new StringBuilder();
	         Tlongest_word.append(longestword);
	         Tlongest_word.reverse();         
	         return Tlongest_word.toString();
    }
	
	public static void main(String [] args) throws FileNotFoundException
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the path of file:");
		String Filenamepath = sc.nextLine();
		
			String logestword = longestWord(Filenamepath);
			
			if (logestword=="File not Found" || logestword=="Please enter the path in text file format only")
				System.out.println(logestword);
			else
				
			{
				System.out.println("Longesword in a file:"+logestword);
				String transposeword =TransposeWord(logestword);
				System.out.println("Transposed word:"+transposeword);
				}
			sc.close();
			
		
	    
	   
		
			
	}
	
}
