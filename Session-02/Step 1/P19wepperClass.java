public class P19wepperClass {
    public static void main(String[] args) {

        //primitiva data type (int , double, boolean  , .... )
        //String (class) && other classes
		
		// wrapper class = 	provides a way to use primitive data types as reference data types
		//					reference data types contain useful methods
		//					can be used with collections (ex.ArrayList)
		
		//primitive		//wrapper
		//---------		        //-------
		// boolean		Boolean
		// char			Character
		// int			Integer
		// double		Double
		
		// autoboxing = the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes
		// unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive
		
		Boolean a = true;       System.out.println(a);
		Character b = '@';		System.out.println(b);
		Integer c = 123;		System.out.println(c);
		Double d = 3.14;		System.out.println(d);
        
        //all wrapper classes ===> parseType ===> String
        //String class ===> parseType ====> All types

        Boolean.parseBoolean("true");
        Character.toString('d');
        Double.parseDouble("2.3");
	}
}
