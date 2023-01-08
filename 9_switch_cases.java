// Switch case use where we have choices

import java.util.Scanner;

class SwitchCases{
    public static void main(String[] args) {
        int a;
        System.out.println("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        switch(a){
            case 18:
                System.out.println("You are 18");
                break; //break is necessary after every cases...agar break nahi lagaya to jo bhi case true hoga uske baad ke saare cases wo print kardega..including default
            case 24:
                System.out.println("You are 24");
                break;
        
            case 70:
                System.out.println("You are 70");
                break;
            default:  // default will print when none of the case will match   
                System.out.println("Yoga se hi hoga");
        }
        sc.close();
        // we have better syntax for Switch ..and that is enhanceSwitch
    }
}