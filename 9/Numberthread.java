
import java.util.*;
public class Numberthread implements Runnable {
	private HashMap<Integer,String> numberMap = new HashMap<>();
	public Numberthread() {
		numberMap.put(1,"one");
		numberMap.put(2,"two");
		numberMap.put(3,"three");
		numberMap.put(4,"four");
		numberMap.put(5,"five");
		numberMap.put(6,"six");
		numberMap.put(7,"seven");
		numberMap.put(8,"eight");
		numberMap.put(9,"nine");
		numberMap.put(0,"zero");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		String number = sc.next();
		for(int i=0;i<number.length();i++) {
			int digit = Integer.parseInt(""+number.charAt(i));
			System.out.println(digit+":"+numberMap.get(digit));
		}
		}
			
	}


