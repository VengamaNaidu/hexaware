import java.util.*;

class Emp
{
	String name;
	int age;
	int sal;
	String desig;

 Emp()
 {
	Scanner sc=new Scanner(System.in);

	System.out.print("NAME : ");
	name=sc.next();
	System.out.print("Age : ");
	age=sc.nextInt();
 }

   void display()
   {
	System.out.println("NAME : "+name);
	System.out.println("Age : "+age);
	System.out.println("SALARY : "+sal);
	System.out.println("DESIG : "+desig);
   }
}
 class Clerk extends Emp
 {
 	Clerk()
	{
		sal=20000;
		desig="Clerk";
	}
 }
 class Dev extends Emp
 {
 	Dev()
	{
  		sal=25000;
  		desig="Developer";
	}
 }
 class Manager extends Emp
 {
 	Manager()
	{
		sal=40000;
		desig="Manager";
	}
 }
 class Tester extends Emp
 {
	Tester()
	{
		sal=30000;
		desig="Tester";
	}
 } 

class Assignment
{
 	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Choice : ");
		System.out.println("1)Clerk : ");
		System.out.println("2)Dev : ");
		System.out.println("3)Manager : ");
		System.out.println("4)Tester : ");
		System.out.println("5)Exit : ");
		int ch=sc.nextInt();

			if(ch==1)
			{
				Clerk a=new Clerk();
				a.display();
			}
			if(ch==2)
			{
				Dev b=new Dev();
				b.display();
			}
			if(ch==3)
			{
				Manager c=new Manager();
				c.display();
			}
			if(ch==4)
			{
				Tester d=new Tester();
				d.display();
			}
			if(ch==5)
			{
				System.exit(0);
			}
	}
}


