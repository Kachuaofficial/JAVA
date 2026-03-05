package patterns;

public class smallCharacter {
    static void main() {
        int n = 4;

        for (int i = 1; i <=n ; i++) {

            for (int j = 0; j < n; j++) {

                if (i%2 == 0) {
                    System.out.print((char) (i+64) + " ");
                } else {
                    System.out.print((char) (i+96) + " ");
                }


            }

            System.out.println(" ");

        }
    }
}
