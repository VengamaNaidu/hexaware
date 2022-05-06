class A
{
       int a=10;
       int b=20;

       void m1()
	{
  		System.out.println("M1:"+a);
	}
	void m2()
	{
  		System.out.println("M2:"+b);
	}
}

class B extends A
{
  	int c=10;
      int d=20;

      void m3()
	{
  		System.out.println("M3:"+a);
	}
	void m4()
	{
 	 	System.out.println("M4:"+b);
	}
}