package ex1;

public class Parabola {
    private int a;
    private int b;
    private int c;
    //private int delta;
   // private float x;
   // private float y;
   //
    private int x;
    private int y;

    public Parabola(int a,int b,int c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
        this.x=-b/2*a;
        this.y=(-b*b-4*a*c)/4*a;
        //delta=b*b-4*a*c;

    }
   /* public Parabola(parabola parabola)
    {
        this.a=parabola.a;
        this.b=parabola.b;
        this.c=parabola.c;

        //delta=b*b-4*a*c;

        float x=(-b)/(2*a);
        float y=(-delta)/(4*a);


    }*/


    public String toString()
    {
       return "f(x)="+a+"x^2 +"+b+"x+"+c+"\n Varful are coordonatele: "+x+ ","+y;

    }

    public String mijloc_seg1(Parabola p)
    {
        float m1=(this.x+this.y)/2;
        float m2=(p.x+p.y)/2;
        return "m1= "+m1+ "m2= "+m2;
    }

    public static void mijloc_seg1(Parabola p1,Parabola p2)
    {
        float m1=(p1.x+p1.y)/2;
        float m2=(p2.x+p2.y)/2;
        System.out.println("m1= "+m1+ "m2= "+m2);
    }

    public double lungime_seg1(Parabola p)
    {
        double l=Math.sqrt((p.x-this.x)*(p.x-this.x)+(p.y-this.y)-(p.y-this.y));
        return l;
    }

    public double lungime_seg2(Parabola p1,Parabola p2)
    {
        double l=Math.sqrt((p2.x-p1.x)*(p2.x-p1.x)+(p2.y-p1.y)-(p2.y-p1.y));
        return l;
    }


}
