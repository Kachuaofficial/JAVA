package patterns;

public class numbertriangle {
    static void main() {
        int n = 4;

        for (int i = 1; i <=n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(j);
            }

            System.out.println(" ");
        }
    }
}
