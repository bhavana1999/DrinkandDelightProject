package collection;
interface Operation{
	int operate(int a,int b);
}
class Calculator{
	public int calculate(int a,int b,Operation op) {
		return op.operate(a,b);
	}
} 
public class java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
