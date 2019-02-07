package study.main.hackerrank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MigratoryBirds {
	// Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {
    	int nReturnValue = 0;
    	Map<Integer, Integer> maps = new HashMap<>();
    	for(Integer nValue : arr) {
    		maps.put(nValue, maps.getOrDefault(nValue, 0) + 1);
    	}
    	
    	int nMax = 0;
    	for (int i = 1; i <= 5; i++) {
			if(nMax < maps.getOrDefault(i, 0)) {
				nMax = maps.get(i);
				nReturnValue = i;
			}
		}
    	
    	return nReturnValue;
    }
    
	public static void main(String[] args) {
		//List<Integer> nList = Arrays.asList(1, 4, 4, 4, 5, 3);	//4
		List<Integer> nList = Arrays.asList(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4);	//3
		
		System.out.println(migratoryBirds(nList));
	}
	
	
}
