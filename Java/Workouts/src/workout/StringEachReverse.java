package workout;

public class StringEachReverse {

    public static void main(String[] args) {
        String str = "Java is a Programming Language";
        String[] split_str = str.split(" ");
        String[] words = new String[split_str.length];
        for (int i = 0; i < split_str.length; i++) {
            words[i] = split_str[i];
        }
        char[][] chars = new char[words.length][];
        for (int i = 0; i < words.length; i++) {
            chars[i] = words[i].toCharArray();
        }
       
        for (int i = 0; i < chars.length; i++) {
            for (int j = chars[i].length - 1; j >= 0; j--) {
                System.out.print(chars[i][j]);
            }
            System.out.print(" ");
        }
    }
}
