public class Clock{
private int hour;
private int minute;
private int second;
public Clock(int hour,int minute,int second) {
  this.hour = hour;
  this.minute = minute;
  this.second = second;
}
 public void setHour(int hour) {
   
    if(hour > 23){
	this.hour = hour;
}
}
 public int getHour() {
	return hour;
}
 public void setMinute(int minute) {
	if(minute > 59){
     this.minute = minute;
}
}
 public int getMinute() {
	return minute;
}
  public void setSecond(int second) {
	if(second > 59) {
      this.second = second;
  }
  }
}
 public void displayTime(int displayTime) {
	if(hour > 23 && minute >59 && second > 59){
       this.hour = hour;
	this.minute = minute;
	this.second = second;
}
}