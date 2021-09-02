package resources;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomGenerator {
	static Random rd = new Random(); 
	public static String randomestring()
	  {
		String Domain = "@gmail.com";
	    String generatedstring=RandomStringUtils.randomAlphabetic(8);
	    return(generatedstring+Domain);
	   }
	public static boolean selectOne() {
		return rd.nextBoolean();
	}
}
