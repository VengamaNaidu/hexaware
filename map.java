import java.util.*;
public class map
{
 	public static void main(String[] args)
	{

 		HashMap map=new HashMap();
		//LinkedHashMap map=new LinkedHashMap();
		//TreeMap map=new TreeMap();

			map.put(1,"ram");
			map.put(4,"raju");
			map.put(3,"sai");
			map.put(89,"vinay");
			map.put(5,"naidu");
			map.put(2,"smit");
			map.put(99,"suresh");

	Set i=map.entrySet();
	Iterator i1=i.iterator();

		while(i1.hasNext())
		{
		System.out.println(i1.next());
		}
	}
}