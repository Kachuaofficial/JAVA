public class array {


    static void update(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] +1;
        }
    }
    public static void main(String[] args) {
        int marks[] = {97, 98, 95, 100, 93};
        System.out.println(marks);

        update(marks);
        for (int i : marks) {
            System.out.println(i);
        }
    }
}