package Arrays;

class Arraysconstructors1{
	int id;
	String name;
	double marks;
	
	Arraysconstructors1(int id,String name,double marks){
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(marks);
		System.out.println("---------------------------------------");
	}}
	public class Arraysconstructors{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Arraysconstructors1 [] a1=new Arraysconstructors1 [3];
     a1[0]=new Arraysconstructors1(1,"dsxz",45.5);
     a1[1]=new Arraysconstructors1(2,"dsx",45.5);
     a1[2]=new Arraysconstructors1(3,"dsz",45.5);
     for(Arraysconstructors1 abcd:a1) {
    	abcd.display();
     }
     }

}
