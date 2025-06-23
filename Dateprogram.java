package p1;

class Date{
	private int month;
	private int day;
	private int year;
	
	 public Date(){
			
	 }

	 public Date(int month, int day, int year) {
		this.month = month;
		this.day = day;
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

	 public int getYear() {
		 return year;
	 }

	 public void setYear(int year) {
		 this.year = year;
	 }
	 public void displayDate() {
			System.out.println("Month - Day - Year :" + month + "/" + + day + "/" + year);
		}
}
  

public class Dateprogram {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d1= new Date(12,25,2008);
		Date d2= new Date(10,14,2005);
		Date d3= new Date(1,29,2004);
		
		d1.displayDate();
		d2.displayDate();
		d3.displayDate();

	}

}
