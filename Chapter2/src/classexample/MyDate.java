package classexample;

public class MyDate {
	private int day;
	private int month;
	private int year;
	
	private boolean isValid;
	public MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		if(month ==2) {
			if(day>28) {
				System.out.println("date Error check the date");
				isValid = false;
				return ;
			}
		}
		this.day = day;
	}
	
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}

}
