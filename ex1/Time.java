package ex1;

public class Time {
	private int hour;
	private int minute;
	private int second;
	
	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}
	
	public void setTime(int hour, int minute, int second) {
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%02d", hour) + ":" + String.format("%02d", minute) + ":" + String.format("%02d", second);
	}
	
	public Time nextSecond() {
		setSecond(second+1);
		if (second >= 60) {
			setSecond(0);;
			setMinute(minute+1);
			if (minute >= 60) {
				setMinute(0);;
				setHour(hour+1);
				if(hour >= 24) {
					setHour(0);;
				}
			}
		}
		return this;		
	}
	
	public Time previousSecond() {
		setSecond(second-1);
		if (second < 0) {
			setSecond(59);
			setMinute(minute-1);
			if (minute < 0) {
				setMinute(59);
				setHour(hour-1);
				if (hour < 0) {
					setHour(23);
				}
			}
			
		}
		return this;
	}
}
