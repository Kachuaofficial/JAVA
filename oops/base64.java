import java.util.Base64;

public class base64 {
    public static void main(String[] args) {
        String original = "hello shivam from lko";
        System.out.println("Original -> " + original);

        // encoding
        byte[] inpbyt = original.getBytes();
        String encoded = Base64.getEncoder().encodeToString(inpbyt);
        System.out.println("encoded -> " + encoded);

        // decoding
        byte[] decbyt = Base64.getDecoder().decode(encoded);
        String decoded = new String(decbyt);
        System.out.println("Decoded -> " + decoded);
    }
}
