// In java String is a class and not a data type...so we can make an object for string


class String_intro {
    public static void main(String[] args) {
        String name = new String("Ashish");
        // String name = "Ashsih"; //we can write in this way too
        System.out.println(name);

        // we can use printf too
        byte a = 1;
        float b = 5.66f;
        System.out.printf("The value of a is %d and b is %f", a, b); //%d and %f are format specifier
        // System.out.printf se hum jo kaam karte hai ..wo same cheez hum System.out.format se bhi kar sakte hai.
    }
}
