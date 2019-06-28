import java.io.Serializable;
import java.util.Comparator;

public class Coin implements Serializable,Comparable<Coin>
{
   private int price;
   private String country;
   private int year;
   
	public int getPrice() 
	{
		return price;
	}
	
	public void setPrice(int price)
	{
		this.price = price;
	}
	
	public String getCountry() 
	{
		return country;
	}
	
	@Override
	public String toString() 
	{
		return "Coin [price=" + price + ", country=" + country + ", year=" + year + "]";
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public Coin(int price, String country, int year) 
	{
		super();
		this.price = price;
		this.country = country;
		this.year = year;
	}

	@Override
	public int compareTo(Coin o1) 
	{
		// TODO Auto-generated method stub
		if(this.getPrice()>o1.getPrice())
		{ 
			return 1;
			
		}
		else if(this.getPrice()<o1.getPrice())
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
}

class Sortbyroll implements Comparator<Coin> 
{ 
    // Used for sorting in ascending order of 
  
	@Override
	public int compare(Coin o1, Coin o2) {
		// TODO Auto-generated method stub
		return o1.getCountry().compareTo(o2.getCountry());
	} 
} 
