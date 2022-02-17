package Practice;
//--------------fibonacci code WITHOUT recursion----------------



import java.util.Scanner;

public class Ex1 {
    int a= 0;
    int b = 1;
    int c;

    public void Rep(int count){

        for (int i =0; i<=count; i++){
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }

    }

}
 class P{
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("enter the count :");
        int nn = n.nextInt();

        Ex1 m= new Ex1();
        System.out.println("a = "+m.a+"\n"+ "b = "+m.b);
        m.Rep(nn);
    }
}