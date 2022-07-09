public class P18StringClass {
    public static void main(String[] args) {
  
        // String = a reference data type that can store one or more characters
        //   reference data types have access to useful methods
        
        String name = "MouAyeD";
        
        //boolean result = name.equalsIgnoreCase("mouayed");
        //int result = name.length();
        //char result = name.charAt(0);
        //int result = name.indexOf("y");
        //boolean result = name.isEmpty();
        //String result = name.toUpperCase();
        //String result = name.toLowerCase();
        //String result = name.trim();
        //String result = name.replace('o', 'a');

        //System.out.println(result);

        System.out.println("string name = \"MouAyeD\"");

        System.out.println("name == \"mouayed\" ? = "+name.equals("mouayed")     );
        System.out.println("name == \"mouayed\" (ignore case)? = "  +name.equalsIgnoreCase("mouayed")     );
        System.out.println("name.length() = "+name.length()     );
        System.out.println("name.charAt(4) = "+name.charAt(4)     );
        System.out.println("indexOf('D') = "+name.indexOf('D')     );
        System.out.println("name.isEmpty() = "+name.isEmpty()     );
        System.out.println("\"\".isEmpty() = "+"".isEmpty()     );
        System.out.println("name.toUpperCase() = "+name.toUpperCase()     );
        System.out.println("name.toLowerCase() = "+name.toLowerCase()     );
        System.out.println("name.trim() = "+name.trim()     );
        System.out.println("\"   Mouayed   \".trim() = "+"    Mouayed".trim()     );
        System.out.println("name.replace('y','#')  =  = "+name.replace('y','#')     );
    }
}

