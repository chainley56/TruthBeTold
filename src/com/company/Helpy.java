package com.company;
import java.io.*;
public class Helpy  {
    String tableholder[]={"A","B","X","T","T","X","T","F","X","F","T","X","F","F","X"};

    public String[] And1(String a,String[] b)throws IOException{
        tableholder[2]= a;
        tableholder[5]= "T";
        tableholder[8]= "F";
        tableholder[11]= "F";
        tableholder[14]= "T";
        FileWriter fw= new FileWriter("C:\\Output1.out");
        PrintWriter output = new PrintWriter(fw);
        for(int i=0;i<15;){
            System.out.print(tableholder[i] + "  ");
            i++;
            System.out.print(tableholder[i]+ "  ");
            i++;
            System.out.println(tableholder[i]);
            i++;
        }
        b = tableholder;
        return b;
    }
    public String[] Or(String a,String[] b)throws IOException{
        tableholder[2]= a;
        tableholder[5]= "T";
        tableholder[8]= "T";
        tableholder[11]= "T";
        tableholder[14]= "F";
        for(int i=0;i<15;){
            System.out.print(tableholder[i] + "  ");
            i++;
            System.out.print(tableholder[i]+ "  ");
            i++;
            System.out.println(tableholder[i]);
            i++;
        }
        b = tableholder;
        return b;
    }
    public String[] Not(String a,String[] b)throws IOException{
        tableholder[2]= a;
        tableholder[5]= "F";
        tableholder[8]= "T";
        tableholder[11]= "T";
        tableholder[14]= "F";
        for(int i=0;i<15;){
            System.out.print(tableholder[i] + "  ");
            i++;
            System.out.print(tableholder[i]+ "  ");
            i++;
            System.out.println(tableholder[i]);
            i++;
        }
        b = tableholder;
        return b;
    }
    public String[] Yes(String a,String[] b)throws IOException{
        tableholder[2]= a;
        tableholder[5]= "T";
        tableholder[8]= "F";
        tableholder[11]= "F";
        tableholder[14]= "T";
        for(int i=0;i<15;){
            System.out.print(tableholder[i] + "  ");
            i++;
            System.out.print(tableholder[i]+ "  ");
            i++;
            System.out.println(tableholder[i]);
            i++;
        }
        b = tableholder;
        return b;

    }
}


