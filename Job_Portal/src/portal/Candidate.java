package portal;

import java.util.Scanner;

public class Candidate {
	String name;
	String college;
	int yop;
	float percentage;
	float expInYears;
	static int count;

	public void setDetails() {
		count++;
		Scanner s = new Scanner(System.in);
		System.out.println("enter your name");
		name = s.next();
		System.out.println("enter your college name");
		college = s.next();
		System.out.println("enter your Year of Passout");
		yop = s.nextInt();
		System.out.println("Enter your percentage");
		percentage = s.nextFloat();
		System.out.println("Enter your Experience in years");
		expInYears = s.nextFloat();

	}

	public String getName() {
		return name;
	}

	public String getCollege() {
		return college;
	}

	public int getYop() {
		return yop;
	}

	public float getPercentage() {
		return percentage;
	}

	public float getExpInYears() {
		return expInYears;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.getYop();
	}
}
