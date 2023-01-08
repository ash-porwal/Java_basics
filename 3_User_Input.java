// we are importing scanner class because we want user defined input
import java.util.Scanner;
class userInput {
    public static void main(String[] args) {
        System.out.println("Taking inputs");
        // making sc object for scanner class...and System.in takes input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Number1:  ");
        int a = sc.nextInt();
        // lets check if the input we are giving in a is int or not 
        // if we give input value a floating point number then it will return false otherwise true
        boolean b12 = sc.hasNextInt();
        System.out.println(b12);

        System.out.println("Number2:  ");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("The sum is:"+ sum);

        
        // String str = sc.next();
        // System.out.println(str);
        // if in input we writing some string and using sc.next to print that string then it wont print after white space...matlab...agar input mein diya: Hello my name is Ashish Porwal then it will print only Hello 
        // String str = sc.nextLine();
        // lekin sc.nextLine(); se wo pura line print karega
        
        // the object we created we have to close too
        sc.close();

        

    }
}