package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)throws IOException{
        String holder[]= new String[40];
        Helpy table = new Helpy();
        Scanner bolen = new Scanner(System.in);
        System.out.println("Welcome to the TRUTH TABLE MAKER");
        System.out.println("To work with a boolean operation type: variable space operator space variable");
        System.out.println("ex:A && B");
        String placehold = bolen.nextLine();
        if(placehold.equals("A && B")){
            table.And1(placehold,holder);
        }
        else if(placehold.equals("A || B")){
            table.Or(placehold,holder);
        }
        else if(placehold.equals("A != B")){
            table.Not(placehold,holder);
        }
        else if(placehold.equals("A == B")){
            table.Yes(placehold,holder);
        }
    }
}

