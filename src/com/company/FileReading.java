package com.company;

import java.io.FileInputStream;
import java.util.Scanner;

public class FileReading
{
    public static void main(String[] args)
    {
        System.out.print("Enter file name: ");
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();

        try
        {
            FileInputStream fileInput = new FileInputStream("src/".concat(fileName));

            System.out.println("File content: ");

            int i = fileInput.read();

            while(i != -1)
            {
                System.out.print((char)i);
                i = fileInput.read();
            }
            fileInput.close();
        }
        catch(Exception e)
        {
            e.getStackTrace();
            System.out.println("Exception catched. ");
        }
    }
}
