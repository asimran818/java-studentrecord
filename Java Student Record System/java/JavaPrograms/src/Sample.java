
public class Sample {

	// int a=10; 
	// int  b=12;
	 //int c=a+b;
	int a;
	int b;
	public Sample(int a, int b){
		this.a=a;
		this.b=b;
	}
	public void add(){
		System.out.println("add 2 numbers:"+(a+b));
	}

	public static void main(String[] args) {
		Sample s = new Sample(10, 12);
		s.add();
	}

}
