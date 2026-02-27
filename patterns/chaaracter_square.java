package patterns;

public class chaaracter_square {
    static void main() {
        int n=4;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <=n; j++) {
                System.out.print((char)(j+96) + " ");
            }

            System.out.println(" ");
        }
    }
}
