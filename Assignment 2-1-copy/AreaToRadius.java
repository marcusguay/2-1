
import java.util.Scanner;

class AreaToRadius {

    public static void main (String[] args) {
       
      double r;
      double area;
        Scanner sc = new Scanner(System.in);
      
        area=sc.nextDouble();
        
       r=Math.sqrt(area/Math.PI);
        
       System.out.println(r);
       
    }
}
