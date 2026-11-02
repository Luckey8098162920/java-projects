package Arrays;

public class Secondlarge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int [] arr= {1,2,3,4,5,6,7};
   int largest=Integer.MIN_VALUE;
   int second=Integer.MIN_VALUE;
   for(int x:arr) {
	   if(x>largest) {
		   second=largest;
		   largest=x;
		   
	   }else if(x>second && x!=largest) {
		   second=x;
	   }
		   
   }  if (second == Integer.MIN_VALUE) {

       System.out.println("Second largest does not exist");

   } else {

       System.out.println("Second Largest = " + second);
   }
   
	}

}
