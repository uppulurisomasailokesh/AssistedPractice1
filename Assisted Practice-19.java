package oops;
interface InterfaceA
{
	    default void display() 
	    {
	        System.out.println("InterfaceA");
	    }
	}

	interface InterfaceB extends InterfaceA
	{
	    default void display()
	    {
	        System.out.println("InterfaceB");
	    }
	}

	interface InterfaceC extends InterfaceA 
	{
	    default void display() 
	    {
	        System.out.println("InterfaceC");
	    }
	}

	class ClassD implements InterfaceB, InterfaceC {

	    @Override
	    public void display() {
	        InterfaceB.super.display(); 
	    }
	}

	public class main
	{
		public static void main(String[] args)
	    {
	        ClassD obj = new ClassD();
	        obj.display(); // Output: InterfaceB
	    }
	}
