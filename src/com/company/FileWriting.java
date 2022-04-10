package com.company;

import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FileWriting
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = scanner.nextLine();

        System.out.print("Enter file content: ");
        String fileContent = scanner.nextLine();

        try
        {
            FileOutputStream outputFile = new FileOutputStream("src/".concat(fileName));
            byte[] bytes = fileContent.getBytes();
            outputFile.write(bytes);
        }
        catch(Exception e)
        {
            e.getStackTrace();
            System.out.println("Exception catched. ");
        }
    }

}
