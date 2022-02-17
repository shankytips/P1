package Practice;

import java.util.Scanner;

//--------------fibonacci code WITH recursion------------
public class Ex2 {

    int a= 0, b= 1, c;

    public void Rec(int count){
        if(count>0){
            c = a+b;
            System.out.println(c);
            a= b;
            b = c;

            Rec(count-1);//-----recursion

        }

    }
}

class PP{
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        System.out.println("enter the count: ");
        int l = m.nextInt();

        Ex2 r = new Ex2();

        System.out.println("a:"+r.a +"\n"+"b:"+ r.b);
        r.Rec(l);


    }
}
