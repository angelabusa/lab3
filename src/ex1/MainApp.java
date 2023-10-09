package ex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner readFile=new Scanner(new File("in.txt"));
        List<Parabola> list=new ArrayList<Parabola>();
        int a,b,c;
        while(readFile.hasNext())
        {
            a=readFile.nextInt();
            b=readFile.nextInt();
            c=readFile.nextInt();
            list.add(new Parabola(a,b,c));

        }
      readFile.close();
        for (Parabola p:list)
        {
            System.out.println(p);
        }

        for(int i=0;i<list.size();i++)
        {
            if(i>0)
            {
                System.out.println("Coordonatele mijlocului seg de dreapta care uneste"+list.get(i)+"si"+list.get(i-1)+"sunt: "+list.get(i).mijloc_seg1(list.get(i-1)));
                System.out.println("Lungimea seg de dreapta care uneste vafurile"+list.get(i)+"si"+list.get(i-1)+"sunt: "+list.get(i).lungime_seg1(list.get(i-1)));
            }
        }
    }
}
