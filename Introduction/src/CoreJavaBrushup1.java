import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushup1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=5;
		String name="Lavanya";
		char ch='l';
		boolean b=true;
		
		System.out.println(num + " & my name is " + name);
		
		//arrays can store multiple vales in a variable
		//2 ways can be created...
		
		int[] arr = new int[5]; //it can store 5 values/elemets. //only declaration
		arr[0]=1;
		arr[1]=2;
		arr[3]=5;
		arr[2]=3;
		arr[4]=4;
		
		//System.out.println(arr[3]);
		
		int[] arr1= {1,2,3,4,5};
		
		//for loop
		for(int i=0; i< arr.length; i++ )
		{
			System.out.println(arr[i]);
		}
		
		String[] str= {"lavanya", "lav", "lavi"};
		
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		
		//enhanced for loop
		for(String s: str)
		{
			System.out.println(s);
		}
		
		//conversion of normal array to arraylist of type string type.. by using Arrays class
		List<String> newArray=Arrays.asList(str);
		System.out.println(newArray.contains("Lavi"));
		
	}

}
