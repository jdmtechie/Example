import java.util.*;

public class Light {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int lightSpeed =186000;
		System.out.print("Please enter the number of days: ");
		int days = stdin.nextInt();
		long distance;
		long daysInSeconds = days * 24 * 60 * 60;
		distance = lightSpeed * daysInSeconds;
		System.out.println("In " + days + " days light will travel " 
				+ distance + " miles");
		distance = lightSpeed * days * 24 * 60 * 60;
		System.out.println("int overflow: " + distance + " miles");
	}

}
