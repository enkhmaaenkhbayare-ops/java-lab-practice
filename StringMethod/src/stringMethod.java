
public class stringMethod {
	
	static String addString(String s1, int index, String s2) {
		String added = s1.substring(0, index + 1).concat(s2).concat(s1.substring(index + 1));
		return added;
	}
	
	static String reverse(String s) {
		String reversed = "";
		for(int i = s.length() - 1; i >= 0; i--) {
			reversed += s.charAt(i);
		}
		return reversed;
	}
	
	static String removeString(String s1, String s2) {
		String removed = "";
		String[] splits = s1.split(s2);
		for(String str : splits) {
			removed = removed.concat(str);
		}
		return removed;
	}
	
	public static void main(String[] args) {
		System.out.println(addString("0123456", 3, "-"));
		System.out.println(reverse("abc"));
		System.out.println(removeString("01001000", "00"));
	}
}
