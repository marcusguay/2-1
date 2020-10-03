

import java.util.Scanner;

class SimpleInterest {

    public static void main (String[] args) {
       //A=P(1+r)^n
        double r=0;
       double p =0;
       double a=0;
       double n=0;
       Scanner sc = new Scanner(System.in);
        System.out.println("principle");
       p= sc.nextDouble();
        System.out.println("rate");
       r=sc.nextDouble();
        System.out.println("years");
       n=sc.nextDouble();
       
       a=p*Math.pow(1+r,n);
       System.out.println(r);
     
   
    }
}
