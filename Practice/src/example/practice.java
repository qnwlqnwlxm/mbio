package example;

public class practice {
	public static void main(String[] args){
		String s = "12:05:39AM";
		System.out.println("input : " + s);
		System.out.println(timeConversion(s));
	}
	
	static String timeConversion(String s){
		//PM,AM형식을 24시 형식으로 변환
		//00:00:00~11:59:59AM -> 00:00:00~11:59:59 [그대로]
		//12:00:00~12:59:59AM -> 00:00:00~00:59:59 [-12해줌]
		//00:00:00~11:59:59PM -> 13:00:00~23:59:59 [+12해줌]
		//12:00:00~12:59:59PM -> 12:00:00~12:59:59 [그대로]
		
		String amPm = s.substring(s.length()-2,s.length());
		String time = s.substring(0, s.length()-2);
		String hour = time.substring(0, 2);
		if("AM".equals(amPm)){
			if("12".equals(hour)){
				return "00"+time.substring(2, time.length());
			}else{
				return time;
			}
		}else if("PM".equals(amPm)){
			if("12".equals(hour)){
				return time;
			} else {
				return (Integer.parseInt(hour)+12)+time.substring(2, time.length());
			}
		}else {
			System.out.println("WTF");
		}
		return s;
	}
	
}