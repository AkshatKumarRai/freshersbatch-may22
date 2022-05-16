
public class Sample {
	public static void main(String[] args) {
		String str1 = "akshat is a good programmer";
		String str2 = "";
		for (int i = str1.length() - 1; i >= 0; --i) {
			str2 = str2 + str1.charAt(i);
		}
		System.out.println("Original string:" + str1);
		System.out.println("reverse string:" + str2);
		Sytem.out.println("  ");

}
}
