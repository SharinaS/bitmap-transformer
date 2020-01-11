package bitmap.transformer;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class BitMap {

    // ===instance variable ===
    BufferedImage pixelData;

    // === constructor ===
    public BitMap(String fileName) throws IOException {
        File f = new File(fileName);
        this.pixelData = ImageIO.read(f);

        System.out.println("Reading complete.");
    }

    // === instance methods ===

    // instance that writes the new image to the desired file
    public void write(String fileNameToWriteTo) throws IOException {
        File f = new File(fileNameToWriteTo);
        ImageIO.write(this.pixelData, "bmp", f);
        System.out.println("Completed Writing");
    }

    // instance that converts image to grayscale
    public void convertToGrayScale() {
        for (int i=0; i < this.pixelData.getWidth(); i++){
            for( int j=0; j < this.pixelData.getHeight(); j++){
                //getting RGB color on each pixel
                Color c = new Color(this.pixelData.getRGB(i, j));
                int r = c.getRed();
                int g = c.getGreen();
                int b = c.getBlue();
                int a = c.getAlpha();
                //turning color to grayscale
                int gr = (r + g + b) / 3;

                //create gray color
                Color grayColor = new Color (gr, gr, gr, a);
                this.pixelData.setRGB(i, j, grayColor.getRGB());
            }
        }
    }

    public void convertToGreens() {
        for (int i=0; i < this.pixelData.getWidth(); i++){
            for( int j=0; j < this.pixelData.getHeight(); j++){
                //getting RGB color on each pixel
                Color c = new Color(this.pixelData.getRGB(i, j));
                int r = c.getRed();
                int g = c.getGreen();
                int b = c.getBlue();
                int a = c.getAlpha();

                Color greenColor = new Color (0, g, 0, a);
                this.pixelData.setRGB(i, j, greenColor.getRGB());
            }
        }
    }

    public void convertImageToPinkBox() {
        for (int i=0; i < this.pixelData.getWidth(); i++){
            for( int j=0; j < this.pixelData.getHeight(); j++){
                //getting RGB color on each pixel
                Color c = new Color(this.pixelData.getRGB(i, j));
                int r = c.getRed();
                int g = c.getGreen();
                int b = c.getBlue();
                int a = c.getAlpha();

                Color opacity = new Color (255,0,144,a);
                this.pixelData.setRGB(i, j, opacity.getRGB());
            }
        }
    }
    // http://www.java2s.com/Tutorials/Java/Graphics_How_to/Image/Convert_negative_image_to_positive.htm
//    public void invertImage() {
//
//        for (int i=0; i < this.pixelData.getWidth(); i++){
//            for( int j=0; j < this.pixelData.getHeight(); j++){
//                int rgba = img.getRGB(x, y);
//                Color color = new Color(rgba, true);
//                color = new Color(255 - color.getRed(), 255 - color.getGreen(), 255 - color.getBlue());
//                img.setRGB(x, y, color.getRGB());
//            }
//        }
//    }
//    
//    // Code kindly supplied by Jon Veach
//    public void reverseVertically() {
//        for (int i = 0; i < width; i++){
//            for (int j = 0; j < height/2; j++){
//                int temp = image.getRGB(i,j);
//                image.setRGB(i,j,image.getRGB(i,height - j - 1));
//                image.setRGB(i,height -j -1, temp);
//            }
//        }
//    }
//    // reverse an image horizontally
//    public void reverseHorizontally() {
//        for (int i = 0; i < height/2; i++){
//            for (int j = 0; j < width; j++){
//                int temp = image.getRGB(i,j);
//                image.setRGB(i,j,image.getRGB(width - i - 1,j));
//                image.setRGB(width - i - 1,j, temp);
//            }
//        }
//    }
}
