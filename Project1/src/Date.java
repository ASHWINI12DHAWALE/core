import java.util.Scanner;

public class Date 
{
	int dd,mm,yy;
	Scanner sc=new Scanner(System.in);
	Date()
	{
		dd=0;
		mm=0;
		yy=0;
	}
	Date(int d,int m,int y)
	{
		dd=d;
		mm=m;
		yy=y;
	}
		
	public int getDd() {
		return dd;
	}
	public void setDd(int dd) {
		this.dd = dd;
	}
	public int getMm() {
		return mm;
	}
	public void setMm(int mm) {
		this.mm = mm;
	}
	public int getYy() {
		return yy;
	}
	public void setYy(int yy) {
		this.yy = yy;
	}
	void acceptDate()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter dd/mm/yy :");
		this.dd=sc.nextInt();
		this.mm=sc.nextInt();
		this.yy=sc.nextInt();
	}
	void displayDate()
	{
		System.out.println("\nOpenting Date is  :"+this.dd+"/" +this.mm+"/" +this.yy);
	}
	

}
