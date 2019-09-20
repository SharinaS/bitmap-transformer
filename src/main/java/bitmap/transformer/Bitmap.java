package bitmap.transformer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class Bitmap {

  // what member variable does a bit map need to work
  File inputFile = new File("/Users/paulacruz/Documents/codefellows/401/java-fundamentals/bitmap-transformer/assets/mario.bmp");
  File outputFile = null;
  BufferedImage image = null; // mbr var
  //width of the image
  int width = 100;        //mbr var image.getwidth()
  //height of the image
  int height = 100;


  //constructor function
  public Bitmap(String inputFile, String outputFile ){
    this.outputFile = new File("/Users/paulacruz/Documents/codefellows/401/java-fundamentals/bitmap-transformer/assets/marioNew.bmp");
    this.image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
    this.image = ImageIO.read(inputFile);

  }



}
