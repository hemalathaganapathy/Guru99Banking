public class Samplepro {
    public static void main(String[] args) {
        String given="hema";
        int len=0;
        char [] ch=given.toCharArray();
        for (char a:ch) {
            len++;
        }
        System.out.println(len);
    }
}
