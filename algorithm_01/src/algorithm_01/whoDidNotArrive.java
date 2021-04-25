package algorithm_01;

import java.util.*;

public class whoDidNotArrive {

	public static void main(String[] participant, String[] completion) {
		
	        int i;
	        
	        Arrays.sort(participant);
	        Arrays.sort(completion);
	        
	        for(i = 0; i < completion.length; i++){
	            if(!participant[i].equals(completion[i])){
	                return participant[i];
	            }
	        }
	        
	        return participant[i];
	    }

	}


