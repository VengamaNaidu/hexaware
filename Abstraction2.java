adstract class A
{
	adstract void loan();
	adstract void mini();

	void abc()
	{
		System.out.println("hi");
	}
}
abstract class B extends A
{
	void loan()
	{
		System.out.println("hi");
	}
	void mini()
	{

	}
	abstract void OT();
}

class C extends B
{
 	 void OT()
	{

	}
}

class Abstraction2
{
	 public static void main(Strinf args[])
	{
		Demo d=new Demo();
		d.loan();
		d.mini();
		d.OT();
	}
}