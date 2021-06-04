package portal;

import java.util.LinkedHashMap;

public class NoOfCandidate {
	Candidate c;
	String name;

	public NoOfCandidate(Candidate c) {
		super();
		this.c = c;
		this.name = c.name;
		Criteria criteria = new Criteria();
		if (c.percentage >= criteria.getPercentage() && c.yop >= criteria.getYop()) {
			candidate.put(c.name, c);
			System.out.println("candidate added");
		} else {
			System.out.println("you are not eligible");
		}
	}

	public NoOfCandidate() {
		super();
	}

	static LinkedHashMap<String, Candidate> candidate = new LinkedHashMap<String, Candidate>();

	//Some hardcoded values 
	static {
		Candidate candidate1 = new Candidate();
		candidate1.name = "rahul";
		candidate1.college = "jain";
		candidate1.yop = 2016;
		candidate1.percentage = 69;
		candidate1.expInYears = 4;
		Candidate candidate2 = new Candidate();
		candidate2.name = "ravi";
		candidate2.college = "bti";
		candidate2.yop = 2017;
		candidate2.percentage = 65;
		candidate2.expInYears = 3;
		Candidate candidate3 = new Candidate();
		candidate3.name = "ram";
		candidate3.college = "mite";
		candidate3.yop = 2020;
		candidate3.percentage = 78;
		candidate3.expInYears = 0;
		Candidate candidate4 = new Candidate();
		candidate4.name = "ashok";
		candidate4.college = "joshep's";
		candidate1.yop = 2018;
		candidate4.percentage = 73;
		candidate4.expInYears = 2;
		Candidate candidate5 = new Candidate();
		candidate5.name = "jishnu";
		candidate5.college = "cit";
		candidate5.yop = 2020;
		candidate5.percentage = 65;
		candidate5.expInYears = 0;
		add(candidate1);
		add(candidate2);
		add(candidate3);
		add(candidate4);
		add(candidate5);
	}

	private static void add(Candidate c) {
		Criteria criteria = new Criteria();
		if (c.percentage >= criteria.getPercentage() && c.yop >= criteria.getYop()) {
			candidate.put(c.name, c);
		}
	}

}
