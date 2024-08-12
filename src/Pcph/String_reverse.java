package Pcph;
public class String_reverse {

        public static void main(String[] args) {
            String str = "Shashi";
            String reversed = "";
            char[] chars = str.toCharArray();
            for (int i = chars.length - 1; i >= 0; i--) {
                reversed += chars[i];
            }
            System.out.println("Reversed String: " + reversed);
        }
    }


