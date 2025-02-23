package ex3_5;

public class MyDate {
	private int year;
	private int month;
	private int day;
	public static final String[] MONTHS  = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
			"Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
	public static final String[] DAYS  = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
	public static final int[] DAY_IN_MONTHS = {31, 28, 31, 30, 31, 30,  31, 31,  30, 31, 30, 31};
	
	public static boolean isLeapYear(int year) {
		if(((year%4 == 0) && (year%100 != 0)) || (year%400 == 0)) {
			return true;
		}else return false;
	}
	public static boolean isValidDate(int year, int month, int day) {
		if(((year >= 1) && (year <= 9999)) ||
			((month >= 1) &&(month <= 12))) {
			try {
				if((day >= 1) && (day <= DAY_IN_MONTHS[month-1])){
					return true;
				}else if((month == 2) && (isLeapYear(year) && (day == 29))) {
					return true;
				}
			} catch (Exception e) {
				System.err.println(e);
			}
		}
		System.err.println("Invalid date!");
		return false;
	}
	
	
	public MyDate(int year, int month, int day) {
		if(isValidDate(year, month, day)) {
			this.year = year;
			this.month = month;
			this.day = day;
		}else System.err.println("Cannot generate date!");
		
	}
	public void setDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.day +" "+ MONTHS[month-1] + " " + this.year;
	}
	
	public MyDate nextDay() {
		if((isLeapYear(year)) && (day == 28)) {
			day = 29;
			return this;
		}
		day+=1;
		if(DAY_IN_MONTHS[this.month-1] < day) {
			day = 1;
			month+=1;
			if(month > 12) {
				month = 1;
				year += 1;
			}
		}
		return this;
	}
	
	public MyDate nextMonth() {
		month += 1;
		if(month > 12) {
			month = 1;
		}else if((month == 2) && (isLeapYear(year) && (day > 29))){
			day = 29;
		}else if(day > DAY_IN_MONTHS[month-1]){
			day = DAY_IN_MONTHS[month-1];
		}
		return this;
	}
	
	public MyDate nextYear() {
		year += 1;
		if((day==29) && (!isLeapYear(year))) {
			day = 28;
		}
		return this;
	}
	
	public MyDate previousDay() {
		day -= 1;
		if(day == 0) {
			month -= 1;
			if(month == 0) {
				year -= 1;
				month = 12;
			}
			day = DAY_IN_MONTHS[month-1];
		}
		return this;
	}
	public MyDate previousMonth() {
		month -= 1;
		if(month == 0) {
			year -= 1;
			month = 12;
		}else if((month == 2)&& (isLeapYear(year)) && (day > 29)) {
			day = 29;
		} else if(day > DAY_IN_MONTHS[month-1]){
			day = DAY_IN_MONTHS[month-1];
		}
		return this;
	}
	public MyDate previousYear() {
		year -= 1;
		if((isLeapYear(year+1)) && (day == 29)) {
			day = 28;
		}
		return this;
	}
}
