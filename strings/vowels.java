package strings;

public class vowels {
    static void main() {

        String newName = "hello this is a STRING";

        int count = 0;

        newName = newName.toLowerCase();

        for (int i = 0; i < newName.length(); i++) {

            if (
                    newName.charAt(i) == 'a' ||
                    newName.charAt(i) == 'e' ||
                    newName.charAt(i) == 'i' ||
                    newName.charAt(i) == 'o' ||
                    newName.charAt(i) == 'u')
            {
                count++;
            }
        }

        System.out.println(count);

    }

}
