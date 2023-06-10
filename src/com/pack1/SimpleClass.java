package com.pack1;

import java.util.List;

//public final class SimpleClass extends SimpleClass1{  -> We can not extend class to final Class. 
public class SimpleClass{

	// Static Class only can use in Nested Class Scenario 
	// And only static declared variable or method can use in static class . 
	// Otherwise to use other we need to create Object.
	
	static int a = 1;
	int b = 2;
	
	static class StaticNestedClass{
		
		public static void main(String[] args) {
			
			System.out.println(a);
			
			SimpleClass sc = new SimpleClass();
			System.out.println(sc.b);
			List<String> l = List.of("Rajesh","Anil","Sunil","Rahul");
			
			l.stream().filter((s)-> s.startsWith("R")).forEach(n -> System.out.print(n +" ")); // filter -> use take Predicate as a parameter 
			
			l.stream().forEach((s)-> System.out.println("\n"+s));  // forEach -> it take Consumer Functional Interface as a Paramter
			
			l.stream().findAny().orElseGet(() -> "Hi..Java" );
			
			
		}
	}
	
	
	public final int method1() {
		return 5+6;
	}
	
	
	
}


//class Class1 extends SimpleClass{
//	
////	public final int method1() {
////		return 5+6;
////	}
//	
//	public static void main(String[] args) {
//		
//		Class1 class1 = new Class1();
//		class1.method1();
//		
//	}
//	
//}


