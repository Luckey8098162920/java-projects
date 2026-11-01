package Arrays;

import java.util.Scanner;

public class Arrayevenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[]arr=new int[10];
		System.out.println("enter the elemets");
		for(int i=0;i<=arr.length;i++) {
			arr[i]=sc.nextInt();
			if(arr[i] %2 == 0) {
				System.out.println("even");
			} else
				System.out.println("odd");
		sc.close();
		}
		
//     int[]arr= {12,14,33,43,44,54,65};
//     for(int i=0;i<=arr.length;i++) {
//    	 if(arr[i]% 2 == 0) {
//    		 System.out.println("even");
//    	 }else 
//    		 System.out.println("odd");
//     }
//     for(int i=0;i<=arr.length;i++) {
//    	 System.out.println(arr[i]);
//     }
	
	}

}
