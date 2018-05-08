
import java.util.*;

public class ListMap {

	public static String sall;

	public ListMap() {
		sall = "";
	}

	public void print(String s) {
		System.out.println("this in print function: " + s);	
	}

	public static void add(String s) {sall += s;}

	public void get_list(List<String> l) {l.add("bbbbbccccc");}

	enum TagValueType {
		Boolean,
		Text,
		Enumeration,
		Int,
		Real,
		Unknown
	}

	enum CatType {
		Empty(0),
		Poi(1),
		Building(2),
		Transportation(4),
		Use(8),
		Name(16),
		PseudoName(32),
		HgisPoi(64),
		All(1|2|4|8|16|64);

		private final int value;

		private CatType(int value) {
			this.value = value;
		}

		public int getValue() {
			return value;
		}
	}

	public void testcattype(CatType t) {
		System.out.println(t);
	}

	public TagValueType tvt =  TagValueType.Enumeration;

	public static void main(String[] args) {
		ListMap t = new ListMap();
		System.out.println(t.sall.isEmpty());
		System.out.println("hello world");


		String s1 = "=abc";
		String s2 = "abc=abc";

		System.out.println(s1.indexOf('='));
		System.out.println(s2.indexOf('='));

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

		System.out.println("test map:");
		Map<String, String> hm = new HashMap<>();
		hm.put("a", "aa");
		hm.put("b", "");
		hm.put("c", "cc");
		hm.forEach((k, v) -> System.out.println(k+"->"+v));
		hm.compute("a", (k, v) -> v + "new");
		hm.merge("b", "c", (k, v) -> v + "new");
		hm.forEach((k, v) -> System.out.println(k+"->"+v));
		String v = hm.get("d");
		//System.out.println(v.isEmpty());

		List<String> l2 = new ArrayList<>();
		l2.add("ccc");
		l2.forEach(n -> System.out.println(n));
		t.get_list(l2);
		l2.forEach(n -> System.out.println(n));

		//compare
		List<String> c1 = new ArrayList<>();
		List<String> c2 = new ArrayList<>();
		c1.add("caaa");
		c1.add("cbbb");
		c1.add("cccc");
		c2.add("cbbb");
		c2.add("cccc");
		c2.add("caaa");
		c1.forEach(n -> System.out.println(n));
		c2.forEach(n -> System.out.println(n));
		Collections.sort(c1);
		Collections.sort(c2);
		System.out.println(c1.equals(c2));

		String s5 = "aaa;ttt;;ccc;dddd;;eeee;";
		String[] l5 = s5.split(";");
		for (String s : l5) {
			System.out.println(s);
		}

		StringBuffer sb1 = new StringBuffer();
		sb1.append("a");
		sb1.append("c");
		sb1.append("\n");
		sb1.append("d");
		System.out.println(sb1.toString());

		List<String> c6 = new ArrayList<>();
		c6.add("ggg");
		String s6 = "aaa;ttt;;ccc;dddd;;eeee;";
		String[] l6 = s6.split(";");
		Collections.addAll(c6, l6);
		System.out.println(c6.toString());

		String l7 = "abc=";
		int equalsPos = l7.indexOf("=");
		System.out.println(l7.substring(0, equalsPos));
		System.out.println(l7.substring(equalsPos+1));

		ListMap lm7 = new ListMap();
		System.out.println(lm7.tvt.toString());

		CatType ct1 = CatType.HgisPoi;
		lm7.testcattype(ct1);


	}
}
