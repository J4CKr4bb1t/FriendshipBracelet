package ReadPattern;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestTextToImage 
{

	static int width;
	static int height;
	public static void main(String[] args) 
	{
		String inputLine;
		Scanner fileInput;
		
		char[][] bbPattern;
	
				
		File inFile = new File("bbPattern.txt"); //name of txt file holding maze
		System.out.println("Opening and reading file");
		try //Try - Catch in case no file is found
		{
			fileInput = new Scanner(inFile);
			
			//reading beginning data
			inputLine = fileInput.nextLine();
			
			int spaceIndex = inputLine.indexOf("x");
			height= Integer.parseInt((inputLine.subSequence(0, spaceIndex)).toString());
			width = Integer.parseInt(inputLine.subSequence(spaceIndex+1,inputLine.length()).toString());
			
			bbPattern = new char[width][height];
			
			
			for (int y = 0; y< height; y++)
			{
				inputLine = fileInput.nextLine();
				//System.out.println("");

				for(int x = 0; x < width; x++)
				{
					bbPattern[x][y] = inputLine.charAt(x);
					//System.out.print(bbPattern[x][y]);
				}
			}
			
			
			fileInput.close();
		} // end try
		
		catch (FileNotFoundException e)
		{
			System.out.println(e);
			System.exit(1); // IO error; exit program
			bbPattern = new char[0][0];
		} // end catch
		
		System.out.println("end of program- file read");

		
		//FileInput.display (bbPattern, height, width);
		
		TextToImage.TextToImage(bbPattern,height,width);
		
	}

}
