package org.example;

import com.github.lalyos.jfiglet.FigletFont;
import com.github.lalyos.jfiglet.JFiglet;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");

        String asciiArt = FigletFont.convertOneLine("Hello World");
        System.out.println((asciiArt));
    }
}