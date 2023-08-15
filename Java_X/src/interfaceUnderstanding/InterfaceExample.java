package interfaceUnderstanding;
// https://www.tutorialspoint.com/can-we-create-an-object-for-an-interface-in-java

/*
No, you cannot instantiate an interface. Generally, it contains abstract methods (except default and static methods introduced in Java8), which 
are incomplete.
Still if you try to instantiate an interface, a compile time error will be generated saying “MyInterface is abstract; cannot be instantiated”.
In the following example we an interface with name MyInterface and a class with name InterfaceExample.
In the interface we have an integer filed (public, static and, final) num and abstract method demo().
From the class we are trying to − create an object of the interface and print the num value.

We can’t create object of interfaces because of the reason that :

Interface is basically a complete abstract class. That means Interface only have deceleration of method not their implementation. 
So if we don’t have any implementation of a method then that means if we create object of that interface and 
call that method it compile nothing as there is no code to compile.
-------------------------------------------------------------------------------------------------------
To access the members of an interface you need to implements it and provide implementation to all the abstract methods of it.

To overcome this, firstly we have to create class that implements that interface means that class is implementing the methods of that interface.
Now when you create object of this class it gives u the permission to access all methods of interface with their implementation in the class.
 */

public class InterfaceExample implements MyInterface {

	public void demo() {
		System.out.println("This is the implementation of the demo method");
	}

	public static void main(String[] args) {

	    //MyInterface myInterfaceObj = new MyInterface();
		// Cannot create object of interface
		
		InterfaceExample obj = new InterfaceExample();
		obj.demo();
		System.out.println(obj.num);

	}

}
