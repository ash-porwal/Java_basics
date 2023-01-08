class typecastingg {
    public static void main(String[] args) {
        
        char grade = 'j';
        // we are adding int and char so it will whole convert into char so we need to typecaste the whole new_grade
        char grade1 = (char)(grade + 3);
        System.out.println(grade1);
        
        char grade2 = (char)(grade1 - 3);
        System.out.println(grade2);
    }
}
