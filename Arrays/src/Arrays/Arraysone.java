package Arrays;

import java.util.Scanner;

public class Arraysone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int[] arr=new int[5];
System.out.println("enter the elements");
for(int i=0;i<arr.length;i++) {
arr[i]=sc.nextInt();
System.out.println("now:"+arr[i]);
	}
for(int i=0;i<arr.length;i++) {
	System.out.println(arr[i]);
}
sc.close();
}}
