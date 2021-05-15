package com.company;


import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
	// write your code here
        new LadyGym();
        try (FileWriter fr = new FileWriter( "/Users/mac/Desktop/Customer LG/LG.txt" )) {
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
