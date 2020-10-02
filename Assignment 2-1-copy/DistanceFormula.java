
import java.util.Scanner;

class DistanceFormula {

    public static void main (String[] args) {
       
    double x1 = 0, y1 = 0, x2 = 0, y2 = 0;

     double  r;
        Scanner sc = new Scanner(System.in);
      
        
        
        
        x1=sc.nextInt();
         
        y1=sc.nextInt();
         
         x2=sc.nextInt();
        
        y2=sc.nextInt();
        
       
        r= Math.sqrt((x2-x1)*(x2-x1) + (y2-y1) *(y2-y1));
       
  
      
        
       System.out.println(r);
       
    }
}
