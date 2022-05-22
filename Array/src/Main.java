import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean flag=false;
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		int key=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			if(arr[i]==key)
			{
				flag=true;
				break;
			}
			
		}
		if(flag)
		{
			System.out.println("Element is found");
		}
		else
		{
			System.out.println("Element is not found");
		}
	}

}