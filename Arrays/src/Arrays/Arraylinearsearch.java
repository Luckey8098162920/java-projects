package Arrays;

public class Arraylinearsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []arr= {1,2,3,4,5,6,7};
int search=5;
boolean found =false;
for(int i=1;i<arr.length;i++) {
	if(arr[i] == search) {
		System.out.println(i);
		found =true;
		break;
	}
	
}
if(!found) {
	System.out.println("notfounddd");
}
	}

}
