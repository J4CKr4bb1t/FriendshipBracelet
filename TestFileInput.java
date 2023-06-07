package ReadPattern;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class TestFileInput 
{
	public static void main (String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter file name: ");
		String filename = input.nextLine();
		
		
		try 
		{
			char[][] braceletArr = FileInput.transcribeImage(filename);
						
			//System.out.println("test--");
			FileInput.display(braceletArr);
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("whomp whomp, didn't work  :( ");
		}
		
		//end try catch
		
		
		
	}
}
