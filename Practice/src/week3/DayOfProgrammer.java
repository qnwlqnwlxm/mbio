package week3;

public class DayOfProgrammer {
	static String solve(int year){
		if(year<1918){
			if(year%4==0){
				return "12.09."+year;
			}
			return "13.09."+year;
		}else if(year==1918){
			return "26.09.1918";
		}else{
			if(year%400==0||(year%4==0&&year%100!=0)){
				return "12.09."+year;
			}
			return "13.09."+year;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = 1918;
		String result = solve(year);
		System.out.println(result);
	}

}
