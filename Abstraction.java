adstract class A
{
	adstract void loan();
}
class B extends A
{
	void loan()
	{
		System.out.println("hi");
	}
}
class Abstraction
{
	 public static void main(Strinf args[])
	{
		B b=new B();
		b.loan();
	}
}
