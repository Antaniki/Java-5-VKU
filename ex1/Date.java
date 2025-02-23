package ex1;

public class Date {
	private int day;
	private int month;
	private int year;
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
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
	
	public void setDate(int day, int month, int year) {
		setDay(day);
		setMonth(month);
		setYear(year);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%02d", day)+"/"+String.format("%02d", month)+"/"+year;
	}
}
