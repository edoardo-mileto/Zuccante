package com.company;
import java.io.*;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        // write your code here
        File outFile=new File ("output.txt");
        File inFile=new File ("input.txt");
        Scanner input;
        PrintWriter output;
        try {
            output = new PrintWriter(outFile);
            input = new Scanner(inFile);

        }catch (FileNotFoundException e){
            System.out.println("Non ho trovato il file.");
            return;
        }
        int parole =0;int linee=0;
        while(input.hasNext()) {
            input.next();
            parole++;
        }
        input=new Scanner(inFile);
        while(input.hasNextLine()) {
            input.nextLine();
            linee++;
        }
        output.println("Parole: " + parole +"\nRighe: "+linee);
        output.flush();
        output.close();
        input.close();

    }
}
