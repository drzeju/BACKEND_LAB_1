package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SplitLines
{
    public static void main(String[] args) throws IOException
    {
        String text = null;

        text = new String(Files.readAllBytes(Paths.get("src/".concat("split_lines.txt"))));
//
        System.out.println("===============Before split: ====================");
        System.out.println(text);
        System.out.println();

        System.out.println("=================Split by the new line character: ==================");

        String[] lines = text.split("\\\\r\\\\n|\\\\n|\\\\r");

        int i = 1;
        for (String line : lines)
        {
            System.out.println(i + " - " + line);
            i++;
        }

    }
}
