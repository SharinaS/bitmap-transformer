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

        //System.out.println("Reading complete.");
    }

    // === instance methods ===

    // instance that writes the new image to the desired file
    public void write(String fileNameToWriteTo) throws IOException {
        File f = new File(fileNameToWriteTo);
        ImageIO.write(this.pixelData, "bmp", f);

        //System.out.println("Completed Writing");
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
        for (int i = 0; i < this.pixelData.getWidth(); i++){
            for( int j = 0; j < this.pixelData.getHeight(); j++){
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
    public void negativeImage() {
        for (int i = 0; i < this.pixelData.getWidth(); i++){
            for( int j=0; j < this.pixelData.getHeight(); j++){
                Color color = new Color(this.pixelData.getRGB(i, j), true);
                color = new Color(255 - color.getRed(), 255 - color.getGreen(), 255 - color.getBlue());
                this.pixelData.setRGB(i, j, color.getRGB());
            }
        }
    }

    // Jon Veach kindly shared some starter code
    public void reverseImageVertically() {
        for (int i = 0; i < this.pixelData.getWidth(); i++){
            for (int j = 0; j < this.pixelData.getHeight()/2; j++){
                int temp = this.pixelData.getRGB(i,j);
                this.pixelData.setRGB(i,j, this.pixelData.getRGB(i,this.pixelData.getHeight() - j - 1));
                this.pixelData.setRGB(i,this.pixelData.getHeight() - j - 1, temp);
            }
        }
    }

    public void reverseImageHorizontally() {
        for (int i = 0; i < this.pixelData.getHeight()/2; i++){
            for (int j = 0; j < this.pixelData.getWidth(); j++){
                int temp = this.pixelData.getRGB(i,j);
                this.pixelData.setRGB(i,j,this.pixelData.getRGB(this.pixelData.getWidth() - i - 1, j));
                this.pixelData.setRGB(this.pixelData.getWidth() - i - 1, j, temp);
            }
        }
    }
}
