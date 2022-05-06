class DuplicateString 
{
   public static void main(String[] args)
   {
      String str1 = "ABCDEBCFGDEA";
      char[] ch = str1.toCharArray();
      int length = ch.length;
      System.out.println("String with duplicates : " + str1);
      for (int i = 0; i < length; i++) 
	{
         for (int j = i + 1; j < length; j++)
	   {
            if (ch[i] == ch[j]) 
		{
               int temp = j;
               
               for (int k = temp; k < length - 1; k++) 
		   {
                  ch[k] = ch[k + 1];
               }
               j--;
               length--;
            }
         }
      }
      String str2 = new String(ch);
      str2 = str2.substring(0, length);
      System.out.println("String after duplicates removed : " +str2);
   }
}