
public class Date {
	int year = 0;
	String month = "";
	int day = 0;
	
	public Date(int year, String month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;			
		
	}

	public static void main(String[] args) {
		Date date = new Date(2002, "Febuary", 25 );
		System.out.println("year:"+ date.year + ", month:"+date.month +", day:"+ date.day);

	}

}
