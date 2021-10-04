import java.util.Scanner;
public class p3{
 public static void main(String[] args){
	 Scanner sc = new Scanner(System.in);
		int d_no[] = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		String sy_roman[] = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
		System.out.println("Enter the decimal number");
		int num = sc.nextInt();
		String rnumber = "";
		int j = 0;
		for (int i : d_no) {
			while (num >= i) {
				rnumber += sy_roman[j];
				num -= i;
			}
			++j;
		}
		System.out.println(rnumber);
 }
}
//.......
//updated
//hr
