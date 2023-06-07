/*
 * SeSe Allerheiligen
 * 5/29/23
 * Takes image input and converts it into lines of characters for use in Bracelet Book
 * 
 * 
 */



package ReadPattern;

import java.io.*;
import java.awt.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FileInput 
{
	
	static int width;
	static int height;
	
	//static ArrayList <?extends Integer> masterColors;
	static int[][] colorValues;
	static char[][] bbValues;
	static int numColors;
	
	

	//takes input of the image
	public static char[][] transcribeImage(String imageName) throws IOException
	{
		
		ArrayList<Integer> masterColors = new ArrayList<>();
		 
		try //file may not be found
		{
			File input = new File(""+ imageName +"");
			
	        BufferedImage image = ImageIO.read(input);
	        
	        width = image.getWidth();
	        height = image.getHeight();
	       	
	        
	        colorValues = new int[width][height];
	        bbValues = new char[width][height];
	        
	        // Getting pixel color by position x and y 
	        for (int y = 0; y < height; y++)
	        {
	        	for (int x = 0; x < width; x++)
	        	{
	        		//System.out.println(x + ":" + y);
	        		//integer of color added to the array 
	        		int clr = image.getRGB(x, y);
	        		
	        		colorValues[x][y] = clr;
	        		
	        		
	        		
	        		
	        		//System.out.println("num colors " +numColors);
	        		//if list is empty, add the 
	        		if(masterColors.isEmpty())
	        		{
	        			masterColors.add(numColors,clr);
	        			numColors++;
	        		}
	        		else
	        		{
	        			if(!masterColors.contains(clr))
	        			{
		        			masterColors.add(numColors, clr);
		        			numColors++;	
	        			}
	        		}	
	        	}
	        }// creates int[][] of rgb values and creates masterColors list of all the colors
		}//end try
		finally
		{
			
		}
		
		
		//now, i'll turn the int values into characters!
		
		//loops through one array and copies the color's ascii value to the bbValue array
		for (int y = 0; y < height; y++)
		{
			for (int x = 0; x < width; x++)
			{
				int clr = colorValues[x][y];
				char thisClr = '-';
				
				int charKey = masterColors.indexOf(clr);
				
				
				//START prevents overflow of characters
				if (charKey != 0) 
				{
					thisClr = (char)(97 + charKey);
					//overflow colors all set to 'z'
				}
				//END prevents overflow of characters
				
				bbValues[x][y] = thisClr;
			}
		}// end character conversion
		
		return bbValues;		
		
	}//end transcribeImage
	
	
	public static void display(char[][] array)
	{
		System.out.println("DISPLAY");
		for (int y = 0 ;y < height ;y++)
		{
			for (int x = 0 ; x < width; x++)
			{
				//System.out.print("x");
				System.out.print(array[x][y]);
			}
			
			System.out.print("\n");
		}
	}//end display()
	
	public static void display(char[][] array, int tall, int wide)
	{
		System.out.println("DISPLAY");
		for (int y = 0 ;y < tall ;y++)
		{
			for (int x = 0 ; x < wide; x++)
			{
				//System.out.print("x");
				System.out.print(array[x][y]);
			}
			
			System.out.print("\n");
		}
	}//end display()

}//end class
