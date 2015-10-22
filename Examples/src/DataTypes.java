
public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pi = 3.1459;
		byte b = (byte) pi;
		System.out.println("PI stored in a byte variable: b = " + b);
		int i = 41;
		double d = 21.34;
		System.out.println("Promoting byte/int to double: " + (b + i + d));
		short s = 4, t = 7, res;
		//res = s + t;
		res = (short)(s + t);
		System.out.println("Casting the promoted to int result " + 
				"back to short: res = " + res);
		s += t;
		System.out.println("Shorthand operator is used, " + 
				"so cast is not required: res = " + s);
		System.out.println("Git Test!!!");

	}

}
