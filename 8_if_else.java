import java.util.Scanner;

class if_else {
    public static void main(String[] args) {
        int a;
        System.out.println("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        // we cannot put assignment operator inside if()like this if (a=2)
        if (a>=18 && a<80){
            System.out.println("You can drive!");
        }
        else if(a < 18 ){
            System.out.println("You cannot drive!");
            
        }
        else{
            System.out.println("You are over aged! for driving");

        }

        sc.close();
    }
}
