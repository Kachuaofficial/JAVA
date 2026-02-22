package strings;

public class print_all_substrings {
    static void main() {
        String s = "56243";
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {

                String sub = s.substring(i,j+1);


                sum+=Integer.parseInt(sub);

            }

        }

        System.out.println(sum);



        //sum of all substring



    }
}
