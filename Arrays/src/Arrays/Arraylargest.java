package Arrays;

public class Arraylargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        int[] arr = {10, 50, 30, 90, 20};
//
//        int largest = arr[0];
//
//        for (int i = 1; i < arr.length; i++) {
//
//            if (arr[i] > largest) {
//
//                largest = arr[i];
//            }
//        }
//
//        System.out.println("Largest = " + largest);
//    }
//}
        int [] arr= {12,32,66};
        int largest= arr[0];
        for(int i=1;i<arr.length;i++){
        	 if (arr[i] > largest) {
                 largest = arr[i];
        		
        	}
        }
        System.out.println("largest:"+largest);
	}

}
