import java.util.ArrayList;

public class CoreJavaBrushup2 {

	public static void main(String[] args) {
		
		int[] arr2 = {1,2,34,5,65,667,554};
		
		for (int i = 0; i < arr2.length; i++) 
		{
		   if(arr2[i] % 2 == 0)
		   {
			   System.out.println(arr2[i]);
		   }
		   
		   else
		   {
			   System.out.println(arr2[i] +" is not multiple of 2");
		   }
		}
		
		//check if array has 1 multiple of 2
		for (int i = 0; i < arr2.length; i++) 
		{
		   if(arr2[i] % 2 == 0)
		   {
			   System.out.println(arr2[i]);
			   break;  //exists the for loop t just find if any 1 mulitple of 2 is got or not
		   }
		}  
		
		
		//arraylists
		
		ArrayList a= new ArrayList();
		a.add(1);
		a.add("string");
		a.add(true);
		
		System.out.println(a.get(2));
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
		
		ArrayList<String> a1= new ArrayList<String>();
		a1.add("Lav");
		a1.add("string");
		a1.add("lavi");
		
		System.out.println(a1.get(2));
		for(String i:a1)
		{
			System.out.println(i);
		}
		
		//item is present or not...
		System.out.println(a1.contains("selenium"));
		
	}

}
