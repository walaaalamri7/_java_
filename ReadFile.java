package com.company;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;
/*
public class ReadFile {
    private static Scanner input;
 public static void ReadFile() {
     try {
         input = new Scanner( Paths.get( "/Users/mac/Desktop/Customer LG/LG.txt" ) );
     } catch (IOException io) {
         JOptionPane.showMessageDialog( null,
                 "Error opeing file" );
         System.exit( 1 );
     }
 }


public static void readRecords(){
    //.... طريقه القراءه
try {
    while (input.hasNext()){
        //طريقه العرض
    }
}catch (NoSuchElementException NE){
    System.err.println("File improperly formed");
}catch (IllegalStateException iss){
    System.err.println("Error reading from file");
}
 }

 public static void CloseFile(){
     if(input != null)
         input.close();
 }
   /* public String ReadFile(){
        String line ;
        String text="";
        try{

            FileReader filereader=new FileReader(new File("/Users/mac/Desktop/Customer LG/LG.txt"));

            BufferedReader bf=new BufferedReader(filereader);
            while((line=bf.readLine()) !=null){
                text=text+line;
            }
            bf.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return text;
    }*/

