import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;

import org.junit.Test;
public class JunitTest {
	
	TransposeLongestWord TLword = new TransposeLongestWord();
	
	@Test
	public void testvalidfile_first() throws FileNotFoundException {
	System.out.println("Valid File - Longest word at the beginning file");
	String logestword = TransposeLongestWord.longestWord("C:\\Users\\raju1\\Desktop\\CodeChallenge\\TestDataFiles\\Test1.txt");
	String transposeword =TransposeLongestWord.TransposeWord(logestword);
        assertEquals("abcde",logestword);
	assertEquals("edcba",transposeword);
	
	}
	@Test
	public void testvalidfile_middle() throws FileNotFoundException {
	System.out.println("Valid File - Longest word at the middle of file");
	String logestword = TransposeLongestWord.longestWord("C:\\Users\\raju1\\Desktop\\CodeChallenge\\TestDataFiles\\Test2.txt");
	String transposeword =TransposeLongestWord.TransposeWord(logestword);
	assertEquals("abcde",logestword);	
	assertEquals("edcba",transposeword);
	}
	@Test
	public void testvalidfile_last() throws FileNotFoundException {
	System.out.println("Valid File - Longest word at the endfile");
	String logestword = TransposeLongestWord.longestWord("C:\\Users\\raju1\\Desktop\\CodeChallenge\\TestDataFiles\\Test3.txt");
	String transposeword =TransposeLongestWord.TransposeWord(logestword);
	assertEquals("abcde",logestword);
	assertEquals("edcba",transposeword);
	}
	@Test
	public void testvalidfile_numbersonlyword() throws FileNotFoundException {
	System.out.println("Valid File - Longest word is numbers only");
	String logestword = TransposeLongestWord.longestWord("C:\\Users\\raju1\\Desktop\\CodeChallenge\\TestDataFiles\\Test4.txt");
	String transposeword =TransposeLongestWord.TransposeWord(logestword);
	assertEquals("12345",logestword);
	assertEquals("54321",transposeword);
	}
	@Test
	public void testvalidfile_charsnumswords() throws FileNotFoundException {
	System.out.println("Valid File - Longest word is alphanumeric");
	String logestword = TransposeLongestWord.longestWord("C:\\Users\\raju1\\Desktop\\CodeChallenge\\TestDataFiles\\Test5.txt");
	String transposeword =TransposeLongestWord.TransposeWord(logestword);
	assertEquals("abc123",logestword);
	assertEquals("321cba",transposeword);
	}
	@Test
	public void testvalidfile_specialcharsword() throws FileNotFoundException {
	System.out.println("Valid File - Longest word is included with special chars");
	String logestword = TransposeLongestWord.longestWord("C:\\Users\\raju1\\Desktop\\CodeChallenge\\TestDataFiles\\Test6.txt");
	String transposeword =TransposeLongestWord.TransposeWord(logestword);
	assertEquals("abcde$%",logestword);	
	assertEquals("%$edcba",transposeword);
	}
	
	
	@Test
	public void testInvalidfileformat() throws FileNotFoundException {	
		System.out.println("Incorrect File format");
		String logestword = TransposeLongestWord.longestWord("C:\\Users\\raju1\\Desktop\\CodeChallenge\\TestDataFiles\\Test1.xls");
		assertEquals("Please enter the path in text file format only",logestword);
	}
	@Test
	public void testfilenotfound() throws FileNotFoundException {	
		System.out.println("File not found");
		String logestword = TransposeLongestWord.longestWord("C:\\Users\\raju1\\Desktop\\CodeChallenge\\TestDataFiles\\Test9.txt");
		assertEquals("File not Found",logestword);
	}
	@Test
	public void testEmptyfile() throws FileNotFoundException {	
		System.out.println("Empty File");
		String logestword = TransposeLongestWord.longestWord("C:\\Users\\raju1\\Desktop\\CodeChallenge\\TestDataFiles\\Emptyfile.txt");
		assertEquals("Emptyfile No words",logestword);
	}
	

}
