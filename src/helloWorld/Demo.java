package helloWorld;

public class Demo {
   
	public static void main(String[]args) {
		System.out.println(System.getenv("END_POINT"));
		System.out.println(System.getenv("RDS_USER"));
		System.out.println(System.getenv("RDS_PASS"));
		System.out.println(System.getenv("AWS_ACCESS_KEY"));
		System.out.println(System.getenv("AWS_SECRET_KEY"));
		System.out.println(System.getenv("AWS_BUCKET"));
		System.out.println("Hello");
	}
}
