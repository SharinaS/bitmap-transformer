/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package bitmap.transformer;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException {

        if (args.length > 0) {

            // create instance of BitMap
            // ... and set first argument to where the original file lives
            String file = args[0];
            BitMap bitMapFromFile = new BitMap(file);

            // methods to call for various bitmaps
            if (args[2].equals("grayscale")) {
                bitMapFromFile.convertToGrayScale();
            }
            if (args[2].equals("green")) {
                bitMapFromFile.convertToGreens();
            }
            if (args[2].equals("pink-box")) {
                bitMapFromFile.convertImageToPinkBox();
            }

            // In terminal, the second argument refers to where you want the new bitmap to populate.
            bitMapFromFile.write(args[1]);
        }
    }
}
