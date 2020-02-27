
public class Clock {
	private int hour;
	private int minute;
	public Clock(String time) {
		String[] split=time.split(":");
		this.hour=Integer.parseInt(split[0]);
		this.minute=Integer.parseInt(split[1]);
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
	
	public void convert() {
		if(this.hour==0 || this.hour==24) {
			System.out.println("12:"+this.minute+" a.m.");
		}
		else if(this.hour>12) {
			System.out.println((this.hour % 12)+":"+this.minute+" p.m.");
		}
		else if(this.hour<12) {
			System.out.println(this.hour+":"+this.minute+" a.m.");
		}
		else if(this.hour==12) {
			System.out.println(this.hour+":"+this.minute+" p.m.");
		}
	}
}
