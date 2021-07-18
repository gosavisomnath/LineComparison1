import java.util.Scanner;

public class LineComparison {


    public int Line1(int X1,int Y1,int X2,int Y2)
    {
        int length1=((X2-X1)*2+(Y2-Y1)*2);
        return length1;

    }

    public int Line2(int P1,int Q1,int P2,int Q2)
    {
        int length2=((P2-P1)*2+(Q2-Q1)*2);
        return length2;
    }

    public static void main(String[] args) {

        System.out.println("Enter X1,Y1,X2,Y2:");
        System.out.println("Enter P1,Q1,P2,Q2:");
        Scanner sc= new Scanner(System.in);
        int X1=sc.nextInt();
        int Y1=sc.nextInt();
        int X2=sc.nextInt();
        int Y2=sc.nextInt();

        int P1=sc.nextInt();
        int Q1=sc.nextInt();
        int P2=sc.nextInt();
        int Q2=sc.nextInt();

        LineComparison obj=new LineComparison();
        Integer a=obj.Line1(X1,Y1, X2, Y2);
        Integer b=obj.Line2(P1, Q1, P2, Q2);

        System.out.println(a.compareTo(b));
    }

}