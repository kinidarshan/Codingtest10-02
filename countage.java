package codingtest;
import java.util.Scanner;

public class countage {

	public static void main(String[] args) {
		int i,count1=0,count2=0,count3=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of elements : ");
		int n = input.nextInt();
		int age[] = new int[n];
		System.out.println("Enter the elements : ");
		for(i=0;i<n;i++)
		{
			age[i]=input.nextInt();
		}
		
		for(i=0;i<n;i++)
		{
			if(age[i]<18)
			{
				count1++;
			}
			
			else if(age[i]>= 18 && age[i]<=54)
			{
				count2++;
			}
			
			else
			{
				count3++;
			}
		}
		
		System.out.println("Children : "+count1 +"\n"+"Adult : "+count2+"\n"+ "Senior Citizen : "+count3);
		
		input.close();

	}
}


