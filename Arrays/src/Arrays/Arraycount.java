package Arrays;

public class Arraycount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []arr= {12,32,34,2,35,67,6};
int even=0;
int odd=0;
for(int i=0;i<arr.length;i++) {
	if(arr[i]% 2== 0) {
		even++;
		System.out.println(arr[even]);
	}else 
	odd++;
}
System.out.println("even:"+even);
System.out.println(odd);
	}

}
