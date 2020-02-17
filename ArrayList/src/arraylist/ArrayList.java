package arraylist;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
class Car{
	private String name;
	private String carName;
	private double price;
	Car(String pname,String cName,double p)
	{
		this.name=pname;
		this.carName=cName;
		this.price=p;
	}
public String getName()
{
	return name;
}
public String getCarName()
{
	return carName;
	
}
public double getPrice()
{
	return price;

}
public void setName(String s) {
	this.name=s;
}
public void setCarName(String s)
{
	this.carName=s;
}
public void setPrice(double s) {
	this.price=s;
}
class carImplementation{
	public double sumofprices(List<Car>carList) {
		double totalPrice=carList.stream().map(p->p.getPrice()).reduce(0.0d,(sum,s.getPrice()));
		return totalprice;
	}
public List<String>printName(List<Car>carList){
	List<String> s=carList.stream().filter(p->p.getPrice()>25000).Collectors.collect;
	return s;	
}
	public double maxPrice(List<Car>carList) {
  double maxPrice =carList.stream().filter(p->p.getPrice()>25000).Collectors.collect;
	return maxPrice;
}
	public double maxPrice1(List<Car>carList) {
		double maxPrice1 =carList.stream().max(p.getPrice()::compare.get());
		return maxPrice1;
		}
}
	}


