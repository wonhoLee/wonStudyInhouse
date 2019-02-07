package study.main.hackerrank;

public class DayOfTheProgrammer {

	static String dayOfProgrammer(int year) {
		String returnValue = "";
		
		if(year < 1918) {
			if((year % 4) == 0) {
				returnValue = "12.09." + year;
			}else {
				returnValue = "13.09." + year;
			}
		}else if(year == 1918) {
			if(year == 1918) {
				returnValue = "27.09" + year;
			}
		}else {
			if((year % 400) == 0) {
				returnValue = "12.09." + year;
			}else if(((year % 4) == 0) && ((year % 100) != 0)){
				returnValue = "12.09." + year;
			}else {
				returnValue = "13.09." + year;
			}
		}
		
		return returnValue;
    }
	
	public static void main(String[] args) {
		int year = 1800;
		
		System.out.println(dayOfProgrammer(year));
	}
}
