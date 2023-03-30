package Operators;

import java.util.Scanner;

public class CheckNumbersequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();int f=0;
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int i=0;
        for(i=0;i<n-1;i++)
        {
            if(arr[i]<arr[i+1])
            {
                break;
            }
        }
        for(int j=i+1;j<n-1;j++)
        {
            if(arr[j]>arr[j+1])
            {
                f=1;
            }
        }
        if(f==1)
        {
            System.out.println("false");
        }
        else
        {
           System.out.println("true");
        }
	}

}
