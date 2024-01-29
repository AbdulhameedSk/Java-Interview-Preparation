package calculations;
import java.util.Scanner;

class Add{
    public static int add(int x,int y){
        return x+y;
    }
}

class Addition{
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter First number");
            int x=s.nextInt();
            System.out.println("Enter second number");
            int y=s.nextInt();
            System.out.println("The sum is "+Add.add(x,y));
        }   
      
    }
}
