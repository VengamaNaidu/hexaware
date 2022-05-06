class A
{
	private String name;
	private int id;
	
		void setName(String name)
		{
				this.name=name;
		}
		String getName()
		{
				return name;
		}
 		void setId(int id)
		{
				this.id=id;
		}
		int getid()
		{
				return id;
		}	
}

class Encapsulation
{
	public static void main(String args[])
	{
 		A a=new A();
		a.setName("Naidu");
		a.setId(594);
		System.out.println(a.getName());
		System.out.println(a.getId());

	}
}