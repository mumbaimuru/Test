/*
 * All the members (methods and fields) of an interface are public.

All the methods in an interface are public and abstract (except static and default).

All the fields of an interface are public, static and, final by default.
 */
interface MyInterface{
	 String name ="Murugesh";
}
public class AccessInterfaceVarible {
	public static void main(String[] args) {
		System.out.println(MyInterface.name);
		
	}
}
