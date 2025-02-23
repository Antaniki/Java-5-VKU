package ex3_4;

import ex1.Time;

public class MyTime {
	private int hour;
	private int minute;
	private int second;
	public MyTime(int hour, int minute, int second) {
		
		if((hour >= 0) && (hour <= 23)){
			this.hour = hour;
		}else System.err.println("Invalid hour!");

		if((minute >= 0) && (minute <= 59)){
			this.minute= minute;
		}else System.err.println("Invalid minute!");

		if((second >= 0) && (second <= 59)){
			this.second= second;
		}else System.err.println("Invalid second!");
	}
	public MyTime() {
		this.hour = 0;
		this.minute = 0;
		this.second = 0;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		if((hour >= 0) && (hour <= 23)){
			this.hour = hour;
		}else System.err.println("Invalid hour!");
			
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		if((minute >= 0) && (minute <= 59)){
			this.minute= minute;
		}else System.err.println("Invalid minute!");
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		if((second >= 0) && (second <= 59)){
			this.second= second;
		}else System.err.println("Invalid second!");
	}
	public void setTime(int hour, int minute, int second) {
		this.setHour(hour);
		this.setMinute(minute);
		this.setSecond(second);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%02d", hour) + ":" + String.format("%02d", minute) + ":" + String.format("%02d", second);
	}
	
	public MyTime nextSecond() {
		this.second += 1;
		if (second >= 60) {
			setSecond(0);;
			this.minute += 1;
			if (minute >= 60) {
				setMinute(0);;
				this.hour += 1;
				if(hour >= 24) {
					setHour(0);;
				}
			}
		}
		return this;		
	}
	
	public MyTime nextMinute() {
		this.minute += 1;
		if (minute >= 60) {
			setMinute(0);;
			this.hour += 1;
			if(hour >= 24) {
				setHour(0);;
			}
		}
		return this;	
	}
	
	public MyTime nextHour() {
		this.hour += 1;
		if(hour >= 24) {
			setHour(0);
		}
		return this;
	}
	
//````````````````````````````````````````````````````````````````
	public MyTime previousSecond() {
		this.second -= 1;
		if (second < 0) {
			setSecond(59);;
			this.minute -= 1;
			if (minute < 0) {
				setMinute(59);;
				this.hour -= 1;
				if(hour < 0) {
					setHour(23);;
				}
			}
		}
		return this;		
	}
	
	public MyTime previousMinute() {
		this.minute -= 1;
		if (minute < 0) {
			setMinute(59);;
			this.hour -= 1;
			if(hour < 0) {
				setHour(23);;
			}
		}
		return this;	
	}
	
	public MyTime previousHour() {
		this.hour -= 1;
		if(hour < 0) {
			setHour(23);;
		}
		return this;
	}
	
}
