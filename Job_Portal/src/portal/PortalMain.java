package portal;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class PortalMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String val = "";
		System.out.println("would you like to add candidate?");
		val = s.next();
		while (val.equalsIgnoreCase("yes")) {
			Candidate candidate = new Candidate();
			candidate.setDetails();
			NoOfCandidate nextCandidate = new NoOfCandidate(candidate);
			System.out.println("would you like to add candidate?");
			val = s.next();
		}
		System.out.println("thank you for applying");
		System.out.println("would you like to see eligible candidates?");
		val = s.next();
		if (val.equalsIgnoreCase("yes")) {
			Print.eligibileCandidates();
		}
	}

}
