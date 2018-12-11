package calculator2;

public class Calc2 {
	public int add (int a, int b) {
	return a + b;
}
public int sub (int a, int b){
	return a -b;
}
public int mult (int a, int b) {
	return a * b;
}
public int div (int a, int b) {
	return a/b ;
}

public static void main(String[]args) {
	Calc2 myCalculator = new Calc2 ();
	System.out.println(myCalculator.add(2, 4));
	System.out.println(myCalculator.sub(18, 5));
	System.out.println(myCalculator.mult(6,2));
	System.out.println(myCalculator.div(26, 7));
}
}

