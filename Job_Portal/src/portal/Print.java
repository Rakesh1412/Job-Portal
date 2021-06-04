package portal;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class Print {

	public static void eligibileCandidates() {
		NoOfCandidate n = new NoOfCandidate();
		LinkedHashMap<String, Candidate> candidates = n.candidate;
		System.out.println(candidates.keySet());
	}

}
