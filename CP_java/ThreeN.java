import java.util.*;
class ThreeN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j, n, ans;
		while (sc.hasNext()) {
			i = sc.nextInt();
			j = sc.nextInt();
			ans = 0;
			for (n = Math.min(i, j); n <= Math.max(i, j); n++) {
				ans = Math.max(cycle(n), ans);
			}
				System.out.println(String.format("%d %d %d", i, j, ans));
		}
	}
	static int cycle(long n) {
		int ans = 1;
		while (n != 1) {
			if (n % 2 == 0) {
				n = n / 2;
			} else {
				n = 3 * n + 1;
			}
			ans++;
		}
		return ans;
	}
}
