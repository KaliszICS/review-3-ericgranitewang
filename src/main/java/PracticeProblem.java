import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
	}

	public static void q1() {
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		System.out.println(in.nextLine().charAt(0));
		in.close();
	}

	public static void q2() {
		//Write question 2 code here
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		System.out.println(!in.nextBoolean());
		in.nextLine();
		in.close();
	}

	public static void q3() {
		//Write question 3 code here
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		System.out.println(in.nextInt() > 5);
		in.close();
	}

	public static void q4() {
		//Write question 4 code here
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		int s = in.nextInt();
		System.out.println(s >= -2 && s <= 2);
		in.nextLine();
		in.close();
	}

	public static void q5() {
		//Write question 5 code here
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		System.out.println(in.nextLine().equals("Hello World"));
		in.close();
	}

	public static void q6() {
		//Write question 6 code here
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		int a = in.nextInt();
		in.nextLine();
		System.out.print("In: ");
		System.out.println(a <= in.nextInt());
		in.nextLine();
		in.close();
	}

	public static void q7() {
		//Write question 7 code here
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		double a = in.nextDouble();
		in.nextLine();
		System.out.print("In: ");
		System.out.println(a > in.nextDouble());
		in.nextLine();
		in.close();
	}

}
