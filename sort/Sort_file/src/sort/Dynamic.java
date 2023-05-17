package sort;

public class Dynamic {
	public static int fib_dynamic_programming(int n) {
        int[] fib = new int[n > 2 ? n + 1 : 3];
        fib[0] = 0;
        fib[1] = 1;
        fib[2] = 1;
        for(int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib[n];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
