package ReadPattern;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class TextToImage 
{
	
    public static void TextToImage(char[][] bbPattern, int height, int width) 
    {
//        int height = bbPattern.length;  // height of the PNG image
//        int width = bbPattern[0].length; // width of the PNG image

    	
    	//makes image based on given height and width, image is blank
       // System.out.println(height + "height");
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        
        
        //fills image with color based on pattern in char[][] array
        for (int y = 0; y < height ; y++) 
        {
            for (int x = 0; x < width; x++) 
            {
            	//System.out.println("x : "+x + " y : " + y);
            	int pixelColor = getColor(bbPattern[x][y]);
            	
                image.setRGB(x, y, pixelColor);
            }
        }

        
        //turns image into a .png file
        File outputFile = new File("output.png"); // Output file name
        try 
        {
            ImageIO.write(image, "png", outputFile);
            System.out.println("PNG image created successfully.");
        } 
        catch (IOException e) 
        {
            System.out.println("Error creating PNG image: " + e.getMessage());
        }
    }
    
    
    //switch case handling what color goes with what letter
    public static int getColor(char letter)
    {
    	
    	int color; 
    	switch (letter) 
    		{
    		case '-':
    			color = 0xFFFFA500; // Orange
                break;
            case 'b':
            	color = 0xFFADD8E6; // Light Blue
                break;
            case 'c':
                color = 0xFF0000FF; // Blue
                break;
            case 'd':
                color = 0xFFFFFF00; // Yellow
                break;
            case 'e':
                color = 0xFFFF00FF; // Magenta
                break;
            case 'f':
                color = 0xFF00FFFF; // Cyan
                break;
            // Add cases for 'g' to 'z' with corresponding colors
            case 'g':
                color = 0xFFFFFFFF; // White
                break;
            case 'h':
                color = 0xFF800080; // Purple
                break;
            case 'i':
                color = 0xFF008080; // Teal
                break;
            case 'j':
                color = 0xFFFF0000; // Red
                break;
            case 'k':
                color = 0xFF8B0000; // Dark Red
                break;
            case 'l':
                color = 0xFF8B008B; // Dark Magenta
                break;
            case 'm':
                color = 0xFFA0522D; // Sienna
                break;
            case 'n':
                color = 0xFF8A2BE2; // Blue Violet
                break;
            case 'o':
                color = 0xFFD2691E; // Chocolate
                break;
            case 'p':
                color = 0xFF7FFF00; // Chartreuse
                break;
            case 'q':
                color = 0xFF00CED1; // Dark Turquoise
                break;
            case 'r':
                color = 0xFF006400; // Dark Green
                break;
            case 's':
                color = 0xFFCD5C5C; // Indian Red
                break;
            case 't':
                color = 0xFF556B2F; // Dark Olive Green
                break;
            case 'u':
                color = 0xFF1E90FF; // Dodger Blue
                break;
            case 'v':
                color = 0xFFB22222; // Fire Brick
                break;
            case 'w':
                color = 0xFFFF1493; // Deep Pink
                break;
            case 'x':
                color = 0xFF00FF00; // Green
                break;
            case 'y':
                color = 0xFFDA70D6; // Orchid
                break;
            case 'z':
                color = 0xFF5F9EA0; // Cadet Blue
                break;
        default:
            color = 0xFF000000; // Black (default color)
            break;
    	} // end switch case
    	
    	return color;
    }
    
//    // Set pixel values or perform any desired image operations here
//    int red = 255 << 16;      // Red component
//    int green = 255 << 8;     // Green component
//    int blue = 255;           // Blue component
//
//    int color1 = 0xFF000000 | red;
//    int color2 = 0xFF000000 | green;
//    int color3 = 0xFF000000 | blue;
//    int color4 = 0xFF00FF00;  // Cyan
//    int color5 = 0xFFFF00FF;  // Magenta
//    int color6 = 0xFF00FFFF;  // Yellow
//    int color7 = 0xFFFFFF00;  // White
//    int color8 = 0xFF0000FF;  // Blue
//    int color9 = 0xFFFF0000;  // Red
//    int color10 = 0xFF00FF00; // Green
//    int color11 = 0xFF800080; // Purple
//    int color12 = 0xFF008080; // Teal
//    int color13 = 0xFFFFA500; // Orange
//    int color14 = 0xFF8B0000; // Dark Red
//    int color15 = 0xFF8B008B; // Dark Magenta
//    int color16 = 0xFFA0522D; // Sienna
//    int color17 = 0xFF8A2BE2; // Blue Violet
//    int color18 = 0xFFD2691E; // Chocolate
//    int color19 = 0xFF7FFF00; // Chartreuse
//    int color20 = 0xFF00CED1; // Dark Turquoise
//    int color21 = 0xFF006400; // Dark Green
//    int color22 = 0xFFCD5C5C; // Indian Red
//    int color23 = 0xFF556B2F; // Dark Olive Green
//    int color24 = 0xFF1E90FF; // Dodger Blue
//    int color25 = 0xFFB22222; // Fire Brick
//    int color26 = 0xFFFF1493; // Deep Pink

}