
import java.util.*;

public class FusionSchemaTest {

	public void print(String s) {
		System.out.println("this in print function: " + s);	
	}

	public static void main(String[] args) {
		System.out.println("hello world");
		String s1 = "=abc";
		String s2 = "abc=abc";

		String info1 [] =  s1.split("=");
		String info2 [] =  s2.split("=");
		System.out.println(info1[0].isEmpty());
		System.out.println(info1[1].isEmpty());


		System.out.println(info1.length);
		System.out.println(info2.length);

		List<String> l1 = new ArrayList<>();
		l1.add("aaa");
		l1.add("bbb");
		l1.add("ccc");
		l1.forEach(n -> System.out.println(n));
		for (String s : l1) {
			System.out.println(s);
		}
		
	}
}
