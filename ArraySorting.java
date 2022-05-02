
public class ArraySorting 
{    
    public static void main(String[] args) 
    {        
             
        int [] a = new int [] {100,250,150,350,490,560,440};     
        int temp = 0;    
 
        
        System.out.println("Original array : ");    
        for (int i = 0; i <a.length; i++) 
	  {     
           System.out.print(a[i] + " ");    
        }    
           
        for (int i = 0; i <a.length; i++) 
	  {     
          for (int j = i+1; j <a.length; j++) 
	    {     
               if(a[i] > a[j]) 
               {      
                 temp = a[i];    
                 a[i] = a[j];    
                 a[j] = temp;    
               }     
            }     
        }    
    
        System.out.println("\nArray sorted in ascending order : ");    
        for (int i = 0; i <a.length; i++) {     
            System.out.print(a[i] + " ");    
        }

        for (int i = 0; i <a.length; i++) 
	  {     
          for (int j = i+1; j <a.length; j++) 
	    {     
               if(a[i] < a[j]) 
               {      
                 temp = a[i];    
                 a[i] = a[j];    
                 a[j] = temp;    
               }     
            }     
        }    
    
        System.out.println("\nArray sorted in Descending order : ");    
        for (int i = 0; i <a.length; i++) {     
            System.out.print(a[i] + " ");    
        }
    
    }    
}    