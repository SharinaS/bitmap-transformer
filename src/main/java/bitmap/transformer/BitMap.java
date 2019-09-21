package bitmap.transformer;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class BitMap {

    // ===instance variables ===
    BufferedImage pixelData;

    // === constructor ===
    // resource referenced for reading and writing bitmap file:
    // https://www.youtube.com/watch?v=lGX0Gc6d51s&feature=youtu.be

    public BitMap(String fileName) throws IOException {
        File f = new File(fileName);

        this.pixelData = ImageIO.read(f);

        System.out.println("Reading complete.");
    }

    // === instance methods ===
    // Instance that converts image to grayscale
    // reference used to learn how to convert to grayscale:
    // https://www.youtube.com/watch?v=cq80Itgs5Lw&amp=&feature=youtu.be
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

    // instance that writes the new image to the desired file
    public void write(String fileNameToWriteTo) throws IOException {
        File f = new File(fileNameToWriteTo);
        ImageIO.write(this.pixelData, "bmp", f);
        System.out.println("Completed Writing");
    }
}
