import java.util.Scanner;

public class LineComparison {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Enter X1,Y1,X2,Y2:");
        System.out.println("Enter P1,Q1,P2,Q2:");
        Scanner sc= new Scanner(System.in);
        int X1=sc.nextInt();
        int Y1=sc.nextInt();
        int X2=sc.nextInt();
        int Y2=sc.nextInt();
        int length1=((X2-X1)*2+(Y2-Y1)*2);

        System.out.println(length1);

        int P1=sc.nextInt();
        int Q1=sc.nextInt();
        int P2=sc.nextInt();
        int Q2=sc.nextInt();

        int length2=((P2-P1)*2+(Q2-Q1)*2);
        System.out.println(length2);

        if(length1 == length2)
            System.out.println("equal");
        else
            System.out.println("not equal");



    }

}
