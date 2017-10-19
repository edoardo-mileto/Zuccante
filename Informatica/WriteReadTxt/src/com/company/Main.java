package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
	// write your code here
        File inFile = new File ("input.txt");
        Scanner inScan = new Scanner (inFile);
        int parole=0; int linee=0;
        while(inScan.hasNext()) {
            inScan.next();
            parole++;
        }
        inScan=new Scanner(inFile);
        while(inScan.hasNextLine()){
            inScan.nextLine();
            linee++;
        }
        System.out.println("Parole: " + parole);
        System.out.println("Righe: " + linee);

    }
}
