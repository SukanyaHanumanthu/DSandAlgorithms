public class ReverseRecursive {
    public String reverseString(String str) {

        if (str.isEmpty()) {
            return str;
        } else {

            System.out.println(str.substring(1)+str.charAt(0));
            return reverseString(str.substring(1)) + str.charAt(0);
        }
    }

    public static void main(String[] args) {
        ReverseRecursive obj = new ReverseRecursive();
        String result = obj.reverseString("Tutorialspoint");
        System.out.println(result);
    }

}
