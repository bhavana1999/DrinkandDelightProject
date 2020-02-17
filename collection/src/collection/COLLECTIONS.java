package collection;
import java.util.Collection;
import java.util.ArrayList;
interface ABC{
void show();
}
class TEST implements ABC{
	
	
	public void show() {
		System.out.println("HELLO");
	
	}
}

public class COLLECTIONS {

	public static void main(String[] args) {
		Collection<String> items=new ArrayList<>();
		items.add("100");
		items.add("true");
		for(Object item:items) {
			System.out.println("Element:"+item);
		}
		items.remove(100);
		System.out.println("After removing:");
		for(Object item:items) {
			System.out.println("Element:"+item);
	}
}

}