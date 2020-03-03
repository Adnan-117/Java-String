package com.string;

/**
 * Problem: It must return an integer that denotes the number of valleys Gary traversed.
 * Where Valley is a sequence of consecutive steps below sea level, 
 * starting with a step down from sea level and ending with a step up to sea level.
 *
 */
public class CountingValleys {

	public static void main(String[] args) {
		int numberOfSteps = 8;
		String stepsTrack = "UDDDUDUU";
		int valleysTraversed = countingValleys(numberOfSteps, stepsTrack);
		System.out.println(valleysTraversed);
	}
	
    static int countingValleys(int n, String s) {
    	String up = "U";
    	String down = "D";
    	for (int i = 0; i < n; i++) {
			if (s.charAt(i) == s.charAt(i+1)) {
				if (s.charAt(i) == up)
			}
		}
		return n;
    }


}
