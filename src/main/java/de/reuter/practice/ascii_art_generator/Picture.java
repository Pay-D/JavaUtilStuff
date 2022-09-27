package de.reuter.practice.ascii_art_generator;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Picture {
    private BufferedImage img;
    private int height;
    private int width;
    private RGBValue[][] array;
    private int[][] brightness;
    private final int MAX_BRIGHTNESS = 255;
    private final String str = "$@B%8&MW#*oahkbdpqwmZ0OQLCJUYXzcvunxrjft/\\\\(|)1{}][?-_+~i!Il:      ";
    private char[][] ascii;

    public Picture(String file) {
        try {
            img = ImageIO.read(new File(file));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        height = img.getHeight();
        width = img.getWidth();
        fillArray();
        fillBrightnessArray();
        fillAscii();
        printAscii();

    }

    private void fillArray() {
        array = new RGBValue[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                int getRGB = img.getRGB(j, i);
                int red = (getRGB >> 16) & 0xff;
                int green = (getRGB >> 8) & 0xff;
                int blue = getRGB & 0xff;
                array[i][j] = new RGBValue(red, green, blue);
            }
        }
    }

    private void fillBrightnessArray() {
        brightness = new int[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                brightness[i][j] = (array[i][j].getRed() + array[i][j].getGreen() + array[i][j].getBlue()) / 3;
            }
        }
    }

    private void fillAscii() {
        ascii = new char[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                ascii[i][j] = str.charAt(brightness[i][j] / 4);
            }
        }
    }

    private void printAscii() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(ascii[i][j] + "" + ascii[i][j] + "" + ascii[i][j]);
            }
            System.out.println();
        }
    }
}
