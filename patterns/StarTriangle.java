package patterns;

public class StarTriangle {

    public  static void RightAngledTriangle(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= n+1-i; j++) {
                System.out.print(j);
            }
            System.out.println(" ");
        }

    }
    static void main() {
        int n=6;
        RightAngledTriangle(n);
    }
}
