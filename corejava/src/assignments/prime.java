package assignments;

public class prime {

	public static void main(String[] args) {
        int n = 12;
        
        if(n == 1) {
            System.out.println("NO");
            return;
        }
        
        for(int i=2;i<n;i++) {
            if(n % i == 0) {
                System.out.println("NO");
                return;
            }
        }
        
        System.out.println("YES");
    }
}
