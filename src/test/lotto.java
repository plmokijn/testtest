package test;

import java.util.Random;

public class lotto {
	public static void main(String[] args)  {
		//test
		//test1
		//test2
        Random rd = new Random();//·£´ý °´Ã¼ »ý¼º
        String[] six = new String[6];
        for(int i=0;i<6;i++) {
        	String rdS = "";
        	int test = 0;
        	test = rd.nextInt(45)+1;
        	rdS = Integer.toString(test);
        	six[i] = rdS;
        	boolean test1 = true;
        	for(int j=0;j<i;j++) {
        		if(i > 0) {
	        		if(six[j].equals(six[i])) {
	        			i = i-1;
	        			test1 = false;
	        			break;
	        		}
        		}
        	}
        	if(test1) {
        		System.out.println(six[i]);
        	}
        }
    }
}
