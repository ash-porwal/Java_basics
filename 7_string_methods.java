class string_methods {
    public static void main(String[] args) {
        String name = "Ashish";
        System.out.println((name));
        
        // counting length 
        int value = name.length();
        System.out.println((value));
        
        // .tolowercase()....similar is .toUpperCase
        String lstring = name.toLowerCase();
        System.out.println((lstring));

        // trim  - this removes leading and trailing spaces...just like we have strip in python
        String nonTrimString = "     ashish      ";
        System.out.println(nonTrimString);

        
        System.out.println(nonTrimString.trim());
        
        
        // .substring(start_index, end_index) ..string will start printing from the index we entered...here end_index is excluded
        System.out.println(name.substring(2));

        // .replace('old character', 'new character')
        System.out.println((name.replace('a', 'y')));

        // .charAt(index)

    }
    
}
