package com.company;

import java.time.LocalTime;
import java.time.ZoneOffset;

public class CurrentTime
{
    public static void main(String[] args)
    {
        System.out.println("Local time: ".concat(LocalTime.now().toString()));
        System.out.println("Global time: ".concat(LocalTime.now(ZoneOffset.UTC).toString()));
    }
}
