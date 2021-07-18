import java.util.Scanner;

public class LineComparison {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Enter X1,Y1,X2,Y2:");
        Scanner sc= new Scanner(System.in);
        int X1=sc.nextInt();
        int Y1=sc.nextInt();
        int X2=sc.nextInt();
        int Y2=sc.nextInt();
        int lenth=((X2-X1)*2+(Y2-Y1)*2);
        System.out.println(lenth);

    }

}