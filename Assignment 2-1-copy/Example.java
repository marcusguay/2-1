import java.util.Scanner;

class Example {

    public static void main (String[] args) {
       
      int x;
        Scanner sc = new Scanner(System.in);
        //... other variables go here
        x= (int) (4.5 / 0.9);
        //2. get user input
        
        //use sc.nextDouble(); to get a decimal or an int value from terminal.
        //    sc.nextInt(); to get only an int value from terminal.
        //    sc.nextBoolean(); to get a boolean from terminal.
        //    sc.nextLine(); to get a String from terminal.
        System.out.println(x);
        //3. calculate and display answer
    }
}