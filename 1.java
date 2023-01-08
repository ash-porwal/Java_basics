class first
{
    // this is main function...ab ye functions class ke andar hote hai..so the class is first
    // and here this function is void which returns None value
    // and public is access modifier .. i.e if this function can be accessed by anyone or it is Private 
    // and static help karta hai function ko ki bina koi object ke wo function run kar sake.
    public static void main(String args[])
    {   
        // code which is going to be executed
        System.out.print("Hello world! with Java\n");
        // to print on new line we can also use println("") then it will print next print statement from new line
        int num1 = 3;
        int num2 = 12;
        int sum = num1 + num2;
        System.out.println(sum);

        // if we write float like this
        float a = 7/2;
        System.out.println(a);
        // then it will take 7 and 2 as int and on doing operation 7/2 which is 3.5 will return 3.
        // so to make 7/2 float we write like this
        float b = 7/2.0f;
        System.out.println(b);
        

    }
}

/* Naming Conventions in Java
 * For classes we use PascalConvention
 * For functions we use camelCaseConvention
 */