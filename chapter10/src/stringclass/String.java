package stringclass;

public class String {
    private char[] chars;

    public String(char[] chars) {
        this.chars = new char[chars.length];
        System.arraycopy(chars, 0, this.chars, 0, chars.length);
    }

    public char[] toChars() {
        return chars;
    }

    public char charAt(int index) {
        return chars[index];
    }

    public int length() {
        return chars.length;
    }

    public String substring(int begin, int end) {
        char[] temp = new char[end - begin];
        for (int i = begin; i < end; i++) {
            temp[i - begin] = chars[i];
        }
        return new String(temp);
    }

    public String substring(int begin) {
        char[] temp = new char[chars.length - begin];
        for (int i = begin; i < chars.length; i++) {
            temp[i - begin] = chars[i];
        }
        return new String(temp);
    }

    public String toLowerCase() {
        char[] temp = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            temp[i] = Character.toLowerCase(chars[i]);
        }
        return new String(temp);
    }

    public String toUppercase() {
        char[] temp = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            temp[i] = Character.toUpperCase(chars[i]);
        }

        return new String(temp);
    }

    public static String valueOf(int i) {
        char[] temp = new char[40];
        int size = 0;
        while (i != 0) {
            int number = i % 10;
            i = i / 10;
            temp[size] = (char)(number + '0');
            size++;
        }

        char[] temp2 = new char[size];
        for (int k = size - 1; k >= 0; k--) {
            temp2[k] = temp[size - k - 1];
        }

        return new String(temp2);
    }

    public static String valueOf(boolean d) {
        if (d)
            return new String(new char[]{'t', 'r', 'u', 'e'});
        else
            return new String(new char[]{'f', 'a', 'l', 's', 'e'});
    }
}
