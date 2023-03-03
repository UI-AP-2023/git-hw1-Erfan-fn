import java.util.Scanner;
public class google {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int A=0,B;
        B=x.nextInt();
       while(x.hasNextInt()) {
           B=x.nextInt();
           if(B>A){A=B;}
       }
       System.out.println(A);
    }
}
