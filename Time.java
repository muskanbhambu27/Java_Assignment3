package Classroom3;		// Que 5

public class Time {
	private int hour;
	private int minute;
	private int second;

	public Time(int hour, int minute, int second) {
		setTime(hour, minute, second);
	}

	public Time() {
		this(0, 0, 0);
	}

	public void setTime(int hour, int minute, int second) {
		if (hour >= 0 && hour < 24 && minute >= 0 && minute < 60 && second >= 0 && second < 60) {
			this.hour = hour;
			this.minute = minute;
			this.second = second;
		} else {
			throw new IllegalArgumentException("Invalid time values");
		}
	}

	public void displayTime() {
		System.out.printf("%02d:%02d:%02d%n", hour, minute, second);
	}

	public static void main(String[] args) {
		Time time1 = new Time(05, 30, 45);
		time1.displayTime();

		try {
			Time time2 = new Time(25, 70, 80);
		} catch (IllegalArgumentException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
